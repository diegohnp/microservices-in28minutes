package com.github.diegohnp.hreurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekaNamingServer {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaNamingServer.class);
    }
}
