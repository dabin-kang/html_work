package io_p;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class FileDisMain {

	public static void main(String[] args) {
		
			
		File [] arr = new File("ori/ori").listFiles();
		for(File bbb : arr) {
			System.out.println(bbb.getName());
			
			String[] aaa = bbb.getName().split("[.]");
			System.out.println(Arrays.toString(aaa) );
			
			if(bbb.isFile()) {
				System.out.println(aaa[1]);
			}
			
			new File("ggg/dst");
			new File("ggg/dst/image").mkdirs();
			new File("ggg/dst/music").mkdirs();
			new File("ggg/dst/document").mkdirs();
			new File("ggg/dst/ext").mkdirs();
			
			
			
			
		}
		
		
		
		
		
	}

}



/*
 * ori폴더
 * ori폴더의 파일을 각각 종류별로 dst폴더에 저장하시오
 * -하위 폴더까지 검색
 * -같은 파일명인 경우 중복 처리
 * 
 * 이미지 : bmp,jpg,gif,png,jpeg
 * 음악 : mp3, wma , wav
 * 문서 : doc , hwp, ppt,xls,pptx,xlsx,docx
 * 기타 : 이외의 기타 분류
 * 
 * 확장자의 대소문자 구분을 하지 않음
 * 
 */