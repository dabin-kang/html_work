package aaa.di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Mlist implements MyAction {

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return "리스트데이터";
	}

}
