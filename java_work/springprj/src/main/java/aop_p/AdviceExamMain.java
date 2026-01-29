package aop_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceExamMain {
	AbstractApplicationContext context =
			new ClassPathXmlApplicationContext("aop/exam.xml");
}
