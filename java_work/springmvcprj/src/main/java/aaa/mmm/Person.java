package aaa.mmm;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
	String pid,pw,pname;
	int age;
	boolean marriage;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate birth;
	
	
	public Person(String pid, String pname, String pw) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pw = pw;
	}
	
	
}
