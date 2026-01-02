package io_p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

public class File2Main {

	public static void main(String[] args) throws Exception {
		File ff = new File("fff/aaa.txt"); // 파일가져오기
		
		
		System.out.println(ff);
		System.out.println(ff.exists()); // true,false로 동일한 파일이 존재하는지 확인한다
		System.out.println(ff.isFile());	
		System.out.println(ff.isDirectory());	
		System.out.println(ff.isAbsolute()); //절대주소인지 묻는다
		
		System.out.println(ff.getParent());
		System.out.println(ff.getName());//파일명을 묻는다
		System.out.println(ff.getAbsolutePath());
		System.out.println(ff.getPath());
		System.out.println(ff.isHidden());
		System.out.println(ff.canExecute());
		System.out.println(ff.canRead());
		System.out.println(ff.canWrite());
		System.out.println(ff.length());
		System.out.println(new Date(ff.lastModified()));
		
		ff = new File("fff/ggg.txt");
		ff.createNewFile(); // 새로운 파일 생성
		
		new File("fff/qqq").mkdir();// 새로운 폴더 생성
		new File("fff/rrr/uuu").mkdir();// 폴더를 생성 할 수 없다
		new File("fff/rrr/uuu").mkdirs();// s를 붙이면 하위 폴더를 생성가능하다
		
		boolean bb = new File("fff/ggg.txt").delete();
		System.out.println(bb);
		
		bb = new File("fff/qqq").delete();
		System.out.println(bb);
		
		bb = new File("fff/rrr").delete();
		System.out.println(bb);// 폴더 안에 자료가 있으면 삭제 할 수 가 없다
		
		
		bb = new File("fff/ddd.txt").renameTo(new File("ggg/sss.txt"));// 파일 이동하기/이름변경
		System.out.println(bb);
		
		//파일 복사하기
		Files.copy(new File("fff/home1.png").toPath(),
				new FileOutputStream("ggg/home3.png"));
		
		System.out.println("===========================================================");
		
		//fff안에 있는 것들을 전부다 확인하겠다
		//하위 폴더,객체는 확인 할 수 없다 , 지정한 폴더만 확인가능
		File [] arr = new File("fff").listFiles();
		for(File file : arr) {
			System.out.println(file.getName());
		}
		
		
		
		
		
		
		
		
		
	}

}
