package di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di/autowire.xml","di/autowire2.xml");
		
		System.out.println(context.getBean("fc"));
		System.out.println(context.getBean("hp1"));
		System.out.println(context.getBean("hp2"));
		System.out.println(context.getBean("hp3"));
		
		context.close();

	}

}

/*AutowireComMain
 * 부품,완성품, xml을 분리하여 context 작업할 것
 * autowire로 작업 요망
 * 
 * 데스크 탑 - 본체1. 모니터1 키보드1 마우스1
 * 노트 북 - 본체1 , 마우스1
 * 
 */













