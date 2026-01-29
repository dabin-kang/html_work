package aaa.di;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginData {
	String name , pid;
	int age,email,phone,berths;
	
	
	public LoginData(String name, String pid, int age, int email, int phone, int berths) {
		super();
		this.name = name;
		this.pid = pid;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.berths = berths;
	}
}
