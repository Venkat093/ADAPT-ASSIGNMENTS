package Assignment1Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
	Question question=(Question) context.getBean("question");
			question.print();
	}

}
