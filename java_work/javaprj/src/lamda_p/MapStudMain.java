package lamda_p;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class MapStudMain {
	public static void main(String[] args) {
		Map<String, int[]> stud = new HashMap<>();
		String line;
		
		try {
			BufferedReader file = new BufferedReader(new FileReader("fff/exam.txt"));
			
			while((line = file.readLine()) !=null) {
				line = line.trim();
				if(line.isEmpty())continue;
				
				String [] data = line.split(",");
				String name = data[0];
				int [] scores = new int[3];// 값을 저장하기 위한 공간을 생성
			
				
				for (int i =0; i< 3; i++) {
					scores[i] = Integer.parseInt(data[i+1]);
				}
				
				stud.put(name, scores);
			}
			file.close();
			
			//합계 평균 계산
			for(Map.Entry<String, int[]> jum : stud.entrySet()) {
				String name = jum.getKey();
				int[] scores = jum.getValue();
				
				int sum = 0;
				for(int score : scores) {
				sum += score;
				}
				System.out.println(line+"합계:"+sum);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}







/*MapStudMain
 * 
 장동건,77,78,75
 장서건,67,68,65
 장남건,97,98,95
 갓동규,57,58,55
 갓짝튱,87,88,85
 강통균,87,88,85
 통멸치,47,78,85
 * 
 * 평균이 70점 이상인 학생들을 출력사세요
 * 
 */