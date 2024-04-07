package org.delivery.api.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
public class LoggerFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // request를 한번 읽어버리면, 뒤에서 다시 읽을 수 없도록 되어있기 때문에, 캐싱할 수 있는 wrapper 클래스를 사용함.
        var req = new ContentCachingRequestWrapper( (HttpServletRequest) request );
        var res = new ContentCachingResponseWrapper( (HttpServletResponse) response );

        log.info("INIT URI : {}", req.getRequestURI());

        // 위에서 doFilter를 통해 넘어온 request, response 객체가 아닌 직접 만든 req, res 객체를 doFilter에 넘겨준다.
        /** 실행 전 */
        chain.doFilter(req, res);
        /** 실행 후 */

        // request 정보
        var headerNames = req.getHeaderNames();
        var headerValues = new StringBuilder();

        headerNames.asIterator().forEachRemaining(headerKey ->{
            var headerValue = req.getHeader(headerKey);

            // authorization-token : ??? , user-agent : ???
            headerValues
                .append("[")
                .append(headerKey)
                .append(" : ")
                .append(headerValue)
                .append("] ");
        });

        var requestBody = new String(req.getContentAsByteArray()); // request json
        var uri = req.getRequestURI();
        var method = req.getMethod();

        log.info(">>>>> uri : {} , method : {} , header : {} , body : {}", uri, method, headerValues, requestBody);


        // response 정보
        var responseHeaderValues = new StringBuilder();

        res.getHeaderNames().forEach(headerKey ->{
            var headerValue = res.getHeader(headerKey);

            responseHeaderValues
                .append("[")
                .append(headerKey)
                .append(" : ")
                .append(headerValue)
                .append("] ");
        });

        var responseBody = new String(res.getContentAsByteArray());

        log.info("<<<<< uri : {} , method : {} , header : {} , body : {}", uri, method, responseHeaderValues, responseBody);

        // response의 body 부분을 한번 읽었기 때문에, 클라이언트로 데이터를 정상적으로 내려주기 위해 다시 response body를 초기화 함.
        res.copyBodyToResponse();
    }
}
