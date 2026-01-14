package di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext(
						"di/student.xml");

		
		System.out.println(context.getBean("강백호"));
		System.out.println(context.getBean("산청룡"));
		System.out.println(context.getBean("이북두산"));
		
		
	}

}
