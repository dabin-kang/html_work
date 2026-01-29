package aop_p;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import anno_p.phone.ConfigScan;
import aop_p.movie.Avatar;
import aop_p.movie.TopMan1;
import aop_p.movie.sf.TopMan2;
import aop_p.webToon.JoSuk;
import aop_p.webToon.TopMan;

public class ExecutionMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
		new ClassPathXmlApplicationContext("aop/execution.xml");
		
		Object rr = context.getBean("joSuk",JoSuk.class).dog1(10,"아기상어");
		System.out.println("rr"+rr);
		System.out.println("--------------------------------------------");
		
		rr = context.getBean("joSuk",JoSuk.class).father(20,"엄마상어");
		System.out.println("rr"+rr);
		System.out.println("--------------------------------------------");
		
		rr = context.getBean("topMan",TopMan.class).dog4(30,"아빠상어");
		System.out.println("rr"+rr);
		System.out.println("--------------------------------------------");
		
		rr = context.getBean("avatar",Avatar.class).dog5(30,"아빠상어");
		System.out.println("rr"+rr);
		System.out.println("--------------------------------------------");
		
		rr = context.getBean("topMan1",TopMan1.class).dog6();
		System.out.println("rr"+rr);
		System.out.println("--------------------------------------------");
		
		rr = context.getBean("topMan2",TopMan2.class).dog7(40);
		System.out.println("rr"+rr);
		System.out.println("--------------------------------------------");
		
		context.getBean("topMan2",TopMan2.class).dog8(11,22);
		System.out.println("--------------------------------------------");
		
		context.close();
		
	}

}
