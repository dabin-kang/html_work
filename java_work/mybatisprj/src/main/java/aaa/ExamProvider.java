package aaa;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.Getter;

@Service
@Data //getter로 해도 된다 set 으로 변하는것을 방지할 수 있다
public class ExamProvider implements ApplicationContextAware {

	
	ApplicationContext context;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;

	}

}
