package com.ccnu.eldercare.infrared;

import io.swagger.annotations.Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ganccl
 * @create 2022-11-30 19:19
 */

@Api(tags = "红外管理" )
@SpringBootApplication
@ComponentScan(basePackages = "com.ccnu")
public class ServiceInfraredApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceInfraredApplication.class,args);
    }
}
