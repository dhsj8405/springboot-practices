package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * 
 * 
 * Bootstrapping Class
 * 
 * 1. 스프링 부트 애플리케이션의 부트스트래핑(Bootstrapping )
 * 2. 설정 class로 역할( Configuration class)
 * 
 */
@SpringBootApplication
public class HelloWorldApplication {
	public static void main(String[] args) {
		/*
		 * 1. 애플리케이션 컨텍스트(Application Context, Spring Container) 생성
		 * 2. 웹 애플리케이션 타입(Web Application인 경우, MVC or Reactive)
		 * 3. 어노테이션 스캐닝(Auto) or Configuration 클래스(Explicit) 통한 빈 생성 및 등록
		 * 4. 웹 애플리케이션인 경우 (MVC)
		 *    - 내장(embedded) 서버(TomcatEmbeddedServletContainer) 인스턴스 생성
		 *    - 서버 인스턴스에 웹 애플리케이션을 배포 
		 *    - 서버 인스턴스 실행
		 * 5. 인터페이스 ApplicationRunner 구현 빈의 run() 실행
		 */
//		ConfigurableApplicationContext c = null;
//		try {
//			c = SpringApplication.run(HelloWorldApplication.class, args); // 부트스트래핑하는클래스에 설정 클래스를 넣어줌)
//		}catch(Throwable ex){
//			ex.printStackTrace();
//		}finally {
//			c.close();
//		}
		
//		try~with~resource
		//웹에서 자동 자원정리를 하면 톰캣까지 내려감 ( 콘솔용으로만 사용)
		try(ConfigurableApplicationContext c = SpringApplication.run(HelloWorldApplication.class, args)) {
			
		}
	}

}
