package aaa.mmm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
	String name;
	int id,kor,eng,mat ;
	
	public int getTotal() {
		return kor+eng+mat;
	}
	
	public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
}
