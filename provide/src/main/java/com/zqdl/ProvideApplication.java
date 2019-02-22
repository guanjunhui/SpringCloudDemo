package com.zqdl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableFeignClients//通过该注解,可让其他应用调用该应用服务
@EnableEurekaClient//服务发现注解注解
@SpringBootApplication
@MapperScan("com.zqdl.mapper")//扫描持久层注解		不使用这个注解,就要在数据持久层中使用mapper这个注解
@EnableTransactionManagement//开启SpringBoot事物支持
public class ProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvideApplication.class, args);
	}
}