package db_p;

import java.util.Date;

public class SignDTO {
	String name,pid,email,adress;
	int phone ;
	Date at_day ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Date getAt_day() {
		return at_day;
	}
	public void setAt_day(Date at_day) {
		this.at_day = at_day;
	}
	
	
	@Override
	public String toString() {
		return "SignDTO [name=" + name + ", pid=" + pid + ", email=" + email + ", adress=" + adress + ", phone=" + phone
				+ ", at_day=" + at_day + "]";
	}
	
	
}
