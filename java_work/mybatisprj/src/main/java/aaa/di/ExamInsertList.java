package aaa.di;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExamInsertList  implements ExamAction {
	
	@Resource
	ExamMapper mapper;

	@Override
	public Object execute(
			ExamDTO dto,
			PageInfo pInfo,
			HttpServletRequest request,
			HttpServletResponse response) {
		
		List<ExamDTO> arr = List.of(
				new ExamDTO(1,"semi","ccc",80,78,76,"1111"),
				new ExamDTO(2,"semi","bbb",80,73,46,"1111"),
				new ExamDTO(1,"final","ccc",80,64,33,"1111")
				);
		
		
		int cnt = mapper.insertList(arr);
		System.out.println("ExamInsertList :"+cnt);
		return null;
	}
}