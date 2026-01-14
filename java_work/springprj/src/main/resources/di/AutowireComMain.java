package di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireComMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di/autowire3.xml");
		
		System.out.println(context.getBean("aaa"));
		System.out.println(context.getBean("nnn"));
		
		
		
		context.close();
	}

}
