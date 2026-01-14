package anno_p.comp;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(
						"anno/component.xml");
		
		String [] beanNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));// bean들을 확인 할 수 있게 모아 보기
		
		System.out.println(context.getBean("camera"));
		System.out.println(context.getBean("bbtt"));
//		System.out.println(context.getBean("battery"));
		System.out.println(context.getBean("handPhone"));
		
		System.out.println(context.getBean("comWatch"));
		System.out.println(context.getBean("mic"));
		
		
		
		context.close();

	}

}

/* anno_p.cars
자동차를 출력
자동차의 종류 - 클래스
f1 --- 바퀴 , 부스터
리무진 --- 바퀴 ,방음벽
트럭 --- 바퀴,짐칸
*/
