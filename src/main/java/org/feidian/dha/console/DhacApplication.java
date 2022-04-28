package org.feidian.dha.console;

import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xunjiu
 */
@SpringBootApplication
@EnableNacosConfig
public class DhacApplication {

    public static void main(String[] args) {
        SpringApplication.run(DhacApplication.class, args);
    }

}
