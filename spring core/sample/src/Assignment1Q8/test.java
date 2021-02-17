package Assignment1Q8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring8.xml");
		context.registerShutdownHook();
		student s=(student) context.getBean("STUDENT");
		s.display();
	}

}
