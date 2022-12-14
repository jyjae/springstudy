# springstudy
백엔드 (spring 기반) 개념 및 면접 공부



## 웹 서버 & 웹 애플리케이션 서버

- 웹 서버: 정적 리소스를 처리하며, Tomcat, PHP 등이 있다.
- 웹 애플리케이션 서버: 비즈니스 로직을 처리하며 Nginx, Apache 등이 있다.

> 웹 시스템 구성은 간단하게 WAS와 DB만으로도 가능하지만 이렇게 되면 WAS가 너무 많은 역할을 담당하게 되고 정적 리소스로 인하여 비즈니스 로직 수행이 어려워질 수도 있다. 또한 WAS 장애 시 오류 화면 노출이 불가해진다.

> 웹 시스템 구성을 WS, WAS, DB로 구성하게 되면 정적 리소스는 WEB에서 처리하고 비즈니스 로직은 WAS가 처리하며 업무 분담이 된다. 이로 인해서 만약 정적 리소스가 많이 사용되면 WS를 증설하고 애플리케이션 리소스가 많이 사용되면 WAS를 증설하면 된다는 장점이 있다.


## 서블릿

- 서블릿: HTTP 요청을 보내고 처리해서 응답을 보내려면 여러 과정을 거쳐야 한다. 
예를 들어서 TCP/IP, HTTP 스펙에 맞춰 request, response 메시지 만들기 등 여러 과정이 있는데
이 과정을 서버 개발자가 매번 처리하기에는 힘들다 그래서 HTTP 요청과 응답을 처리할 때 개발자는 비즈니스 로직만 신경쓰게끔 다른 과정들을 처리해주는것을 서블릿이리고 한다.


## Spring과 Spring Boot 차이점

- Spring은 자바 기반 애플리케이션을 개발하기 보다 쉽게 해주는 프레임워크이다.
- Spring Boot는 Spring의 하위 프로젝트중에 하나이다.
- 이 둘의 차이점으로는 Spring은 톰캣같은 WAS를 별도로 설치해주어야 하며, XML 파일을 통해 복잡한 설정을 해주어야 하지만,
  Spring Boot는 자동 설정을 통해 XML에 설정하는데 걸리는 시간을 단축시켜 준다 또한 임베디드 서버가 내장되어있어 따로 설치를 해주지 않아도 되고
  spring-boot-starter를 사용해서 외부 도구를 보다 편리하게 사용할 수 있다는 장점이 있다.



##### 출처: 스프링 MVC 1편 - 백엔드 웹 개발 핵심 기술 - 김영한
