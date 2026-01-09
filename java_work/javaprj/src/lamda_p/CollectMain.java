package lamda_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectMain {

	public static void main(String[] args) {
		int [] arr1 = {33,44,11,77,22,33,55,11,88,22};
		
		//java16 이전 버전
		List<Integer>list1 = Arrays.stream(arr1)
				.boxed() //xxxStream -> Stream<xxx>로 변환시키는 역할
				.collect(Collectors.toList());
		
		System.out.println("toList : "+list1);
		
		
		//java16 이후 버전
		list1 = Arrays.stream(arr1)
				.boxed()
				.toList();
		
		System.out.println("toList : "+list1);
		
		
		//HashSet
		Set<Integer> set1 = Arrays.stream(arr1)
				.boxed()
				.collect(Collectors.toSet());
		System.out.println("Collectors.toSet() : "+set1);
		
		
		//LinkedHashSet
		 set1 = Arrays.stream(arr1)
				.boxed()
//				.collect(Collectors.toCollection(()->new LinkedHashSet<Integer>()));
				.collect(Collectors.toCollection(LinkedHashSet<Integer>::new));
		System.out.println("toCollection(()->new LinkedHashSet<Integer>() : "+set1);
		
		
		//TreeSet
		//오름차순 정렬 : toCollection((TreeSet): [11, 22, 33, 44, 55, 77, 88]
		 set1 = Arrays.stream(arr1)
				.boxed()
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println("toCollection((TreeSet): "+set1);
		
		
		
		//TreeSet
		//내림차순 정렬 : Comparator.reverseOrder(): [88, 77, 55, 44, 33, 22, 11]
		set1 = Arrays.stream(arr1)
				.boxed()
				.collect(Collectors.toCollection(()->new TreeSet(Comparator.reverseOrder())));
		System.out.println("toCollection((TreeSet): "+set1);
		
		
		
		
		//Map - 짝수 홀수
		//{짝수=[44, 22, 88, 22], 홀수=[33, 11, 77, 33, 55, 11]}
		// 같은 숫자가 중복 된다.
		Map<String,List<Integer>> map = Arrays.stream(arr1)
				.boxed()
				.collect(Collectors.groupingBy(a->a%2==0 ?"짝수" : "홀수"));
		System.out.println("Collectors.groupingBy: "+map);
		
		
		//Map - 짝수Set ,홀수Set
		//{짝수=[22, 88, 44], 홀수=[33, 55, 11, 77]}
		// 같은 숫자가 중복 되지 않는다
		Map<String,Set<Integer>> map2 = Arrays.stream(arr1)
				.boxed()
				.collect(Collectors.groupingBy(
						a->a%2==0 ?"짝수" : "홀수",
						Collectors.toSet()
				));
		System.out.println("Collectors.toSet(): "+map2);
	}

}





/*CollectStudMain
 * 반별로 구분 하기
 * 
 * 	반, 이름     나이  키
 * 1, "장동건" , 47, 180
 * 3, "현빈" , 29, 182
 * 3, "정우성" , 37, 188
 * 1, "원빈" , 45, 170
 * 
 */



















