package com.zqdl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
	
	/*@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}*/
	
	/**
	 * 
	 * @EnableFeignClients
	 * 在学习时,服务调用有两种方法.
	 * 
	 * 1.feign
	 * 		1)使用@EnableFeignClients注解:使用该注解时,要创建一个service(名字没有约束)-->FeignClientService,该service在类名上使用注解@FeignClient("demo-provide")
	 * 			该注解的作用是在eureka上根据应用名称查找应用
	 * 		2)在service下创建接口方法,应使用@RequestMapping注解,value值就是想要访问服务对应的地址,不用写根地址
	 * 		3)这个方法一个应用只能写一个service,即@FeignClient("demo-provide"),这个注解中的value只能出现一次,创建多个service,使用该注解value相同时,
	 * 			启动报错,服务被占用
	 * 2.Ribbon
	 * 		1)不需使用@EnableFeignClients注解,在消费者启动类上创建一个bean对象
	 * 			@Bean
	 *		    @LoadBalanced
	 *		    RestTemplate restTemplate(){
	 *		        return new RestTemplate();
	 *		    }
	 *		2)正常写controller,但是并不注入service,要注入RestTemplate,在调用是的使用规则:
	 *			restTemplate.getForObject("URL", 返回类型:String.calss);
	 *			URL:服务提供者的详细URL.例如:localhost:8080/list
	 */
	
}
