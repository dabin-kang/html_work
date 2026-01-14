package anno_p.res;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.annotation.Resource;

public class Camera{
	String name;
	int pixel;
	
	public Camera() {
		System.out.println("camera 생성자");
	}
	
	

	public void setName(String name) {
		this.name = name;
	}



	public void setPixel(int pixel) {
		this.pixel = pixel;
	}



	@Override
	public String toString() {
		return "Camera [name=" + name + ", pixel=" + pixel + "]";
	}
}

class Battery{
	String name;
	boolean remoeable;
	
	
	
	public Battery() {
		System.out.println("배터리 생성자");
	}

	

	public void setName(String name) {
		this.name = name;
	}



	public void setRemoeable(boolean remoeable) {
		this.remoeable = remoeable;
	}



	@Override
	public String toString() {
		return "Battery [name=" + name + ", remoeable=" + remoeable + "]";
	}
}


class HandPhone {
String name;
int price;
int pixel;


HandPhone(){
	System.out.println("HandPhone() 생성자");
}

//@Resource
//@Qualifier("bbq")// 결합하려는 bean 지정
@Resource(name="bbq")
Camera fc;
Camera bc;
Battery bat;




public void setName(String name) {
	this.name = name;
}

public void setPixel(int pixel) {
	this.pixel = pixel;
}



public void setPrice(int price) {
	this.price = price;
}


@Resource
public void setBat(Battery bat) {
	this.bat = bat;
}




@Override
public String toString() {
	return "HandPhone [name=" + name + ", price=" + price + ", fc=" + fc + ", bc=" + bc + ", bat=" + bat + "]";
}
}
