package com.hello.servletstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/*
	1. 서블릿
	- http 요청과 http 응답을 처리하기 위해서 서버 내부에 개발자들이 구현을 한다.
	서블릿은 이러한 웹 요청과 응답의 흐름을 간단한 메서드 호출만으로 체계적으로 다룰 수 있게 해주는 기술이다

	2. @ServletComponentScan
	- 해당 패키지 기준으로 하위 패키지를 뒤져서 자동으로 Servlet 실행시킬 수 있도록 해준다.
 */
@ServletComponentScan
@SpringBootApplication
public class ServletStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletStudyApplication.class, args);
	}

}
