package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@ExtendWith(SpringExtension.class)   //주피터버전을 사용할때 ExtendWith 사용한다.
//@ContextConfiguration(classes= {MyApplication.class})  //spring에서는 이걸 사용하지 않는다.

@SpringBootTest // 하나로 통합하려고 한다.  다른게 하나 있는데  스프ㄹ이테스트에서는 이걸 사용한다. 스프링 
public class MyApplicationTest02 {
	
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
	
	
}
