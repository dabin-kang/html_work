package aaa.di;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import aaa.model.ExamDTO;
import aaa.model.ExamMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExamInsertReg  implements ExamAction {
	
	@Resource
	ExamMapper mapper;

	@Override
	public Object execute(
			ExamDTO dto,
			PageInfo pInfo,
			HttpServletRequest request,
			HttpServletResponse response) {
		
		
		dto.setFf(fileSave(dto.getUpff(),request));// 파일을 만들고 난 뒤에 여기에 저장
		
		mapper.insert(dto);
		
		int maxId = mapper.maxId();
		
		System.out.println("ExamInsertReg : "+maxId);
		
		return maxId; //null로 해서 받을 수있다 , maxId 로 값 하나만 받아서 할 수 있다	
	}
	
	
	//파일저장을 위한 곳 (fff폴더에 저장한다)
	String fileSave(MultipartFile mf,HttpServletRequest request) {
		String path= request.getServletContext().getRealPath("/fff");
		path = "C:\\Users\\ekqls\\OneDrive\\Desktop\\study\\java_work\\mybatisprj\\src\\main\\webapp\\fff";
		
		File saveFile = new File(path,mf.getOriginalFilename());
		
		String newFileName = mf.getOriginalFilename(); // 이름이 겹치면 어떻게 할건지 정책을 세우는 곳
		try {
			mf.transferTo(saveFile);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		return newFileName;
	}
}
