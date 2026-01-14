package anno_p.phone;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Data;

public class BeanCarMain {
	
	
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"anno/bean.xml");
		
		System.out.println(context.getBean(Treck.class));
	}
}




