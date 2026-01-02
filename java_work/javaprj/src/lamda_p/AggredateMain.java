package lamda_p;

import java.util.Arrays;
import java.util.OptionalInt;

public class AggredateMain {

	public static void main(String[] args) {
		int [] arr = {33,11,22,44,55,66,88,77,99};
		
		//OptionalInt = 없을 수도 있다는 뜻
		
		System.out.println("count():"+Arrays.stream(arr).count());
		System.out.println("findFirst():"+Arrays.stream(arr).findFirst());
		System.out.println("findFirst().getAsInt():"+Arrays.stream(arr).findFirst().getAsInt());
		System.out.println("max():"+Arrays.stream(arr).max());
		System.out.println("min():"+Arrays.stream(arr).min());
		System.out.println("sum():"+Arrays.stream(arr).sum());
		System.out.println("average():"+Arrays.stream(arr).average());
		
		System.out.println("값이 없을 경우 처리--------------------------------------------------");
		arr= new int[] {};
		System.out.println("count():"+Arrays.stream(arr).count());
		System.out.println("findFirst():"+Arrays.stream(arr).findFirst());
//		System.out.println("findFirst().getAsInt():"+Arrays.stream(arr).findFirst().getAsInt());//  데이터가 없어서 에러발생(변환불가)OptionalInt

		OptionalInt oint = Arrays.stream(arr).findFirst();
		System.out.println(oint);
		System.out.println(oint.isPresent()); // 값이 존재 : true 값이 없으면 : false
		
		//방법1
		if(!oint.isPresent()) {
			System.out.println("값이없음");
		}
		
		//방법2 orElse()
		// 값이 있을 경우 값을 int 로 리턴
		// 값이 없을 경우 매개변수(0)을 리턴 , 초기값이 리턴이다 생각하면 된다
		System.out.println("orElse():"+Arrays.stream(arr).findFirst().orElse(0));
		
		//방법3
		// ifPresent(a->System.out.println("방법3"+a)
		// 값이 있을 경우 ()안의 내용을 실행한다
		// 값이 없을 경우 실행하지 않는다 
		Arrays.stream(arr).findFirst().ifPresent(a->System.out.println("방법3"+a));
	}

}
