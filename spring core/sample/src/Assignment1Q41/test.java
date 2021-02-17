package Assignment1Q41;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(app_config.class);
		states sta=context.getBean(states.class);
		sta.display();
	}

}
