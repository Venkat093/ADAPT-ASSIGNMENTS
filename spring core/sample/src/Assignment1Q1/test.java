package Assignment1Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		Customer customer=(Customer) context.getBean("customer");
		customer.print();
	}

}
