package Assignment1Q4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	
		ApplicationContext context= new ClassPathXmlApplicationContext("spring4.xml");
		States State=(States) context.getBean("states");
       State.print();
	}

}