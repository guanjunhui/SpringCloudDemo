package com.zqdl.aspect;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class LogAspect {

	private static Logger log = Logger.getLogger(LogAspect.class);

	@Pointcut("execution(* com.zqdl.controller..*.*(..))")
	public void webPonitCut() {
	}

	@Before("webPonitCut()")
	public void beforePoint(JoinPoint joinPoint) throws Exception{
		// 接收到请求，记录请求内容
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		// 记录下请求内容
		log.info("URL : " + request.getRequestURL().toString());
		log.info("HTTP_METHOD : " + request.getMethod());
		log.info("IP : " + request.getRemoteAddr());
		Enumeration<String> enu = request.getParameterNames();
		while (enu.hasMoreElements()) {
			String name = (String) enu.nextElement();
			log.info(String.format("name:{%s},value:{%s}", name, request.getParameter(name)));
		}
	}

	@AfterReturning(returning = "ret", pointcut = "webPonitCut()")
	public void afterPoint(Object ret) throws Exception{
		// 处理完请求，返回内容
		log.info("RESPONSE : " + ret);
	}

}
