package org.example.part4.ch3;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.example.part4.ch3.model.Book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KakaoBookApi {
    private static final String API_KEY = "YOUR_API_KEY";
    private static final String API_BASE_URL = "https://dapi.kakao.com/v3/search/book";
    private static final OkHttpClient client = new OkHttpClient();
    private static final Gson gson = new Gson();

    // 책 검색 메서드
    public static List<Book> searchBooks(String title) throws IOException{
        // url을 연결하는 객체
        HttpUrl.Builder urlBuilder = HttpUrl.parse(API_BASE_URL).newBuilder();
        urlBuilder.addQueryParameter("query", title);

        // 자바에서 코틀린 구문 사용할 때 에러 발생.
        // 서버에 요청
        Request request = new Request.Builder()
                .url(urlBuilder.build())
                .addHeader("Authorization","KakaoAK "+API_KEY)
                .build();

        try (Response response = client.newCall(request).execute()){
            if (!response.isSuccessful()) throw new IOException("Request failed: "+response);
            /** response.body 응답에 대한 데이터가 담겨져 있음.
             * response로 받은 데이터는 gson 형태이기 때문에 객체로 변환함.
             */
            JsonObject jsonResponse = gson.fromJson(response.body().charStream(), JsonObject.class);
            JsonArray documents = jsonResponse.getAsJsonArray("documents");

            List<Book> books = new ArrayList<>();
            for (JsonElement document : documents){
                JsonObject bookJson = document.getAsJsonObject();
                Book book = new Book(
                        // gson 형태의 document 객체 내부에서 각각의 필요데이터들만 가져옴.
                        bookJson.get("title").getAsString(),
                        bookJson.get("authors").getAsJsonArray().toString(),
                        bookJson.get("publisher").getAsString(),
                        bookJson.get("thumbnail").getAsString()
                );
                books.add(book);
            }
            return books;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
