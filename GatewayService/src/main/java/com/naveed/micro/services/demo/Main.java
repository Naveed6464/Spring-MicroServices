package com.naveed.micro.services.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 21, 2020
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
