package anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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

@Autowired //멤버변수 안에 설정 , setter 없이도 가능하게 해준다
			// 우선순위가 있다 , byName > byType 순서로 진행한다
@Qualifier("bbq")// 결합하려는 bean 지정
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



//false : bean 없으면 결합을 하지 않고 있으면 결합을 해준다
//true : 필수로 있어야 한다
@Autowired(required = false)
public void setBat(Battery bat) {
	this.bat = bat;
}




@Override
public String toString() {
	return "HandPhone [name=" + name + ", price=" + price + ", fc=" + fc + ", bc=" + bc + ", bat=" + bat + "]";
}
}
