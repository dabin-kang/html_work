package db_p;

public class RegDTO {
	String	name , emeil,phonenum,adress,at_day;
	int pid ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmeil() {
		return emeil;
	}
	public void setEmeil(String emeil) {
		this.emeil = emeil;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getAt_day() {
		return at_day;
	}
	public void setAt_day(String at_day) {
		this.at_day = at_day;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "regDTO [name=" + name + ", emeil=" + emeil + ", phonenum=" + phonenum + ", adress=" + adress
				+ ", at_day=" + at_day + ", pid=" + pid + "]";
	}
	
	
}
