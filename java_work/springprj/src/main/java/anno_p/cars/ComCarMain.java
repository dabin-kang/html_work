package anno_p.cars;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ComCarMain {



	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"anno/component.xml");
		
		
		System.out.println(context.getBean("car1"));
		/*
		 * System.out.println(context.getBean("car2"));
		 */ 
//		  System.out.println(context.getBean("rimujin"));
//		  System.out.println(context.getBean("Track"));
		 
		
		context.close();
	}
}