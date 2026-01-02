package io_p;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;

public class FileExamMain {

	public static void main(String[] args) {
		String ttt =  " 장동건_77,78,75\r\n"
					+ " 장서건_67,68,65\r\n"
					+ " 장남건_97,98,95\r\n"
					+ " 갓동규_57,58,55\r\n"
					+ " 갓짝튱_87,88,85";
		char []arr = ttt.toCharArray();
		
		try {
			Writer examw = new FileWriter("fff/exam.txt");
			examw .write(arr);
			char [] buf = new char[8];
			examw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Reader examr = new FileReader("fff/exam.txt");
			int data;
			while((data = examr.read())!=-1) {
				String AA = examr.read();
				System.out.print(AA);
			}
			System.out.println();
			System.out.println("---------------");
			System.out.println(data);
			

			examr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


/*
 * FileExamMain
 * 
 * fff/exam.txt 파일을 만들고 파일내용에 총점,평균,등수를 계산하여
 * ggg/examRes.txt 파일로 저장하시오
 * 
 * fff/exam.txt
 * 장동건_77,78,75
 * 장서건_67,68,65
 * 장남건_97,98,95
 * 갓동규_57,58,55
 * 갓짝튱_87,88,85
 * 
 * ggg/examRes.txt
 * 장동건_77,78,75, 총점,평균,등수
 * 
 */