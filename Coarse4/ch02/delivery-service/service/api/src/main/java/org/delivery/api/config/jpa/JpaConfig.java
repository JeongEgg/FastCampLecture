package org.delivery.api.config.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "org.delivery.db")// 해당 경로에서 @Entity 어노테이션이 붙은 모든 객체들을 스캔하여 빈으로 등록함.
@EnableJpaRepositories(basePackages = "org.delivery.db") // 해당 경로에 있는 Jpa Repository를 빈으로 등록함.
public class JpaConfig {
}
