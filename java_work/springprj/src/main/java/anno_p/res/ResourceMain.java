package anno_p.res;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"anno/resource.xml");
		
//		System.out.println(context.getBean("fc"));
//		System.out.println(context.getBean("bb1"));
		System.out.println(context.getBean("hp1"));
	
		context.close();

	}

}