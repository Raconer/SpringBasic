# SpringBasic

Spring Make Basic Setting

* gradle
    1. spring-boot-starter-web, 2.3.1.RELEASE
        * Spring MVC를 사용하는 RESTful 애플리케이션을 포함한 웹 구축을위한 스타터. Tomcat을 기본 내장 컨테이너로 사용  
        * @SpringBootApplication, @Controller, @GetMapping 등 프로젝트 구성 및 의존성을 자동화 한다.

    2. Tasks > application > bootrun 추가시
        * build.gradle
            * buildscript
                * Repository add 'mavenCentral()'
                * dependencies add classpath 'spring-boot-gradle-plugin'
            * apply plugin add 'org.springframework.boot'

    3. tomcat-embed-jasper
        * Controller와 WEB-INF 의 View를 찾아서 불러온다.

    4. spring-boot-devtools
        * 개발에 필요한 기능 제공한다.
            * Live Reload : View 개발시 서버 재시작 없이 바로 적용이 된다.
            * Cache disabled : 템플릿 관련 캐시를 모두 비활성화 한다.
            
* Connect DB (Mysql)

    1. gradle 
        * spring-boot-starter-data-jpa : DB데이터를 JAVA의 POJO(Plain Old Java Object)로 인식을 하여 맵핑을 해주는 맵퍼 이다. @Entity 사용시 필요
        * mysql-connector-java 
        
    2. application.properties Setting
        * spring.jpa.hibernate.ddl-auto=update
        * spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_example
        * spring.datasource.username=springuser
        * spring.datasource.password=ThePassword
        
    * [DB Connect]
        * <https://spring.io/guides/gs/accessing-data-mysql/>
        
    * [JPA]
        * <https://velog.io/@adam2/JPA%EB%8A%94-%EB%8F%84%EB%8D%B0%EC%B2%B4-%EB%AD%98%EA%B9%8C-orm-%EC%98%81%EC%86%8D%EC%84%B1-hibernate-spring-data-jpa>

* Other
    1. application.properties
        * 스푸링부트가 애플리케이션을 구동할 때 자동으로 로딩하는 파일이다

    2. Java Servlet
        * 웹 프로그래밍에서 클라이언트의 요청을 처리하고 그 결과를 다시 클라이언트에게 전송하는  Servlet클래스의 구현 규칙을 지킨 자바 프로그래밍 기술]
        * Ex) 사용자가 로그인을 하려고 할 때, 사용자는 아이디와 비밀번호를 입력하고, 로그인 버튼을 누릅니다. 그떄 서버는 클라이언트의 아이디와 비밀번호를 확인하고, 다음 페이지를 띄어주어야 하는데, 이러한 역할을 수행하는 것이 서블릿이다.
        * 서블릿은 자바로 구현 된 CGI라고 한다.

    3. CGI(Common Gateway Interface)
        * 별도로 제작된 웹 서버와 프로그램간의 교환 방식
        * CGI방식은 어떠한 프로그래밍 언어로도 구현이 가능하며, 별도로 만들어 놓은 프로그램에 HTML의 GET or Post방법으로 클라이언트 의 데이터를 환경 변수로 전달하고, 프로그램의 표준 출력 결과를 클라이언트에게 전송하는것이다.
        * 자바 어플리케이션 코딩을 하듯 웹 브라우저용 출력 화면을 만드는 방법

    4. SpringBootServletInitializer를 상속하는 이유
        * Servlet3.0 스펙에 새로운 기능 중 하나는 web.xml없이 배포가 가능하다.

* [Servlet]
  * <https://mangkyu.tistory.com/14>

* [SpringBootServletInitializer를 상속하는 이유]
  * <https://medium.com/@SlackBeck/spring-boot-%EC%9B%B9-%EC%95%A0%ED%94%8C%EB%A6%AC%EC%BC%80%EC%9D%B4%EC%85%98%EC%9D%84-war%EB%A1%9C-%EB%B0%B0%ED%8F%AC%ED%95%A0-%EB%95%8C-%EC%99%9C-springbootservletinitializer%EB%A5%BC-%EC%83%81%EC%86%8D%ED%95%B4%EC%95%BC-%ED%95%98%EB%8A%94%EA%B1%B8%EA%B9%8C-a07b6fdfbbde>
