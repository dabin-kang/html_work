package lamda_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapMain {

	public static void main(String[] args) {
		
		System.out.println("Map-----------------------------");
		Arrays.stream(new int[] {11,22,33,44,55,66,77,88})
		.map(i->i*100)
		.forEach(i->System.out.println(i));
		
		System.out.println("flatMap-----------------------------");
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("배구,농구");
		arr.add("축구,야구,탁구");
		arr.add("족구,피구");
		arr.add("맹구,아구");
		
		
		arr.stream()
		.flatMap(ss->Arrays.stream(ss.split(",")) )
		//,를 기준으로stream-> stream요소를 각각의 요소로 새로운 stream 생성
		//묶여 있는 자료들을 따로따로 분리 시키기
		.forEach(i->System.out.println(i));
		
		System.out.println("flatMap + IntStream-----------------------------");
		int [] arr1 = {11,22,33};
		Arrays.stream(arr1)
		.flatMap(i->IntStream.of(i,i*10,i*100)) //IntStream.of => [11,110,1100][22,220,2200]..
												//.flatMap => 11,110,1100,22,220,2200 ...
		.forEach(i->System.out.println(i));	
		
		System.out.println("flatMap + IntStream + range-----------------------------");
		int [] arr2 = {5,8,3};
		Arrays.stream(arr2)
		.flatMap(i->IntStream.range(1,i)) 
		.forEach(i->System.out.println(i));	
//	==	.forEach(System.out::println); // 이렇게 해도 똑같이 출력된다
		
		
		System.out.println("mapToInt------------------------------------------");
		List<String> arr3 = Arrays.asList("12,34,56".split(","));
		arr3.stream()
			.mapToInt(s-> Integer.parseInt(s))
			.forEach(s->System.out.println(s+1000));
		
		
		
		List<String>arr4 = Arrays.asList("12,34,56","100,220","135246,369");
		arr4.stream()
		.flatMapToInt(ss->
			Arrays.stream(ss.split(","))
		   .mapToInt(s->Integer.parseInt(s))
		)
		.forEach(s-> System.out.println(s+1000));
		
	}
}


















