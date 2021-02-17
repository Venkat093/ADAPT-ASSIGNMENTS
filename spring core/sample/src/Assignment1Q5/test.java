package Assignment1Q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Assignment1Q4.States;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("spring5.xml");
		States State=(States) context.getBean("State");
       State.print();
	
	}

}
