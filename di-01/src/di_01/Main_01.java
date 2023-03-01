package di_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_01 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		Greeting gr = context.getBean(Greeting.class);
		String msg = gr.getMessage();
		System.out.println(msg);
	}
}