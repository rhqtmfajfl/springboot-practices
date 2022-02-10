package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * Bootstrapping class
 * 
 * 1.스프링 부트 어플리케이션의 부트 스트래핑(Bootstrapping)
 * 2. 설정 클래스로 역활을한다.(configuration class로 역활)
 * 
 */


@SpringBootApplication
//@ComponentScan() // auto
//@Import({})
public class HelloWorldApplication {

	public static void main(String[] args) {
		/*
		 * run 안에서 일어나는 bootspring의 관정
		 * 1. 애플리케이션 컨텍스트(Application Context, Spring Container) 생성
		 * 2. 웹애플리케이션 타입 결정(Web Application 인 경우 , MVC or Reactive 타입을 결정한다.)
		 * 3. 어노테이션 스캐닝(auto) or Configuration Class(Explicit) 통한 빈 생성/등록 및 와이어링 작업
		 * 4. 웹 어플리케이션(MVC)
		 * 	- 내장(embeded) 서버(TomcatEmbeddedServletContainer) 인스턴스 생성
		 * 	- 서버 인스턴스 웹 애플리케이션을 배포시킨다.
		 * 	- 서버 인스턴스를 실행한다.
		 * 5. ApplicationRunner 인터피이스 구현한 빈을 찾아서 실행(run 호출)
		 * 
		 * 
		 */
		
//		ConfigurableApplicationContext c = null;
//		try {
//			c = SpringApplication.run(HelloworldApplication.class, args);
//		
//		}catch(Throwable ex) {  // 부트스트랩 과정을 거치면서 에러가 발생한다.
//			ex.printStackTrace();
//		}finally {
//			c.close(); //exception이 발생
//			
//		}
		
		// try ~ with ~ resource 구문  위의 구문과 같은 의미가 된다.
		try(ConfigurableApplicationContext c = SpringApplication.run(HelloWorldApplication.class, args)) {		// HelloworldApplication는 설정 파일잉다 3 번을 하려고

			
		}
		//  4번을 쭉 하면 tomcat이 뜨는것이다. 그러다가 crtl을 눌러서 ApplicationRunner을 구현한 빈을 찾아서 실헹 즈터 
		// helloworld에서는 전체적인 부트스트래핑 과정 run 안에서 일어나는 것 context spring container는 springbootapplication에서 실행하는 것이다.
		// spring bootapplication이 configuration을 가지고 있다.
		
	}

}
