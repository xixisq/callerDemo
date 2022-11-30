package com.ccnu.eldercare.infrared.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ganccl
 * @create 2022-11-30 20:11
 */
@Configuration
@MapperScan("com.ccnu.eldercare.infrared.mapper")
public class InfraConfig {
}
