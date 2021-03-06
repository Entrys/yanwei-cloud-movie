package com.yanwei.movie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author li.tao
 * @since 2019/12/9 16:37
 */
@SpringBootApplication(scanBasePackages = "com.yanwei.movie")
@MapperScan("com.yanwei.movie.repository")
@EnableEurekaClient
public class MovieWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieWebApplication.class, args);

    }
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
