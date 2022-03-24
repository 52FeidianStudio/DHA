package org.feidian.dha.console;

import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xunjiu
 */
@SpringBootApplication
@EnableNacosConfig
public class DhaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DhaApplication.class, args);
    }

}
