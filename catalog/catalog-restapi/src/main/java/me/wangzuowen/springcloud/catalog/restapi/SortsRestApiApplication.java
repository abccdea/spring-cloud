package me.wangzuowen.springcloud.catalog.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableHystrix
@EnableFeignClients(basePackages = "me.wangzuowen")
@ComponentScan(basePackages = "me.wangzuowen")
public class SortsRestApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SortsRestApiApplication.class, args);
    }
}
