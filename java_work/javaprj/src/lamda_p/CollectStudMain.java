package lamda_p;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectStudMain {
	class Student {
		int ban;
		String name;
		int age;
		int height;
		
		public Student(int ban, String name, int age, int height) {
			this.ban = ban;
			this.name = name;
			this.age = age;
			this.height = height;
		}
		public int getBan() {return ban;}
		public int getAge() {return age;}
	}

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student(1, "장동건" , 47, 180),
				new Student(3, "현빈" , 29, 182),
				new Student(3, "정우성" , 37, 188),
				new Student(1, "원빈" , 45, 170)
		);
		
		Map<Integer,List<Student>> res = students.stream()
				.collect(Collectors.groupingBy(
						Student::getBan,
						Collectors.toList(),
						list -> {
							list.sort();
						}
						));
		
		
		 

	}

}
