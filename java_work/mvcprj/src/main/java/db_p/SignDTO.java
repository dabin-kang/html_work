package db_p;

import java.util.Date;

public class SignDTO {
	String pid,name,email,adress;
	int phonenum;
	Date at_day;
	
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	public Date getAt_day() {
		return at_day;
	}
	public void setAt_day(Date at_day) {
		this.at_day = at_day;
	}
	
	@Override
	public String toString() {
		return "SignDTO [pid=" + pid + ", name=" + name + ", email=" + email + ", adress=" + adress + ", phonenum="
				+ phonenum + ", at_day=" + at_day + "]";
	}
	
	
	
}
