package aaa.di;

import aaa.model.ExamDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface ExamAction {
	
	//왜 두개를 받는가? 이렇게 받아야 페이지 정보와 학생정보를 각각 받을 수 있기 때문에
	Object execute(
			ExamDTO dto ,
			PageInfo pInfo,
			HttpServletRequest request,
			HttpServletResponse response
			);
}
