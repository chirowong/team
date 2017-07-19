package com.qatang.team.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author wangzhiliang
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients({
        "com.qatang.team.data.service"
})
public class TeamWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamWebApplication.class, args);
    }

}
