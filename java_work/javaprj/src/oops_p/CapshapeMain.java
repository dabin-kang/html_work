package oops_p;


class shapeAAA{
	private String bb = "직사각형";
	private String aa = "원";
	public String getBb() {
		return bb;
	}
	public void setBb(String bb) {
		this.bb = bb;
	}
	public String getAa() {
		return aa;
	}
	public void setAa(String aa) {
		this.aa = aa;
	}
	
	
}


public class CapshapeMain {

	public static void main(String[] args) {
		shapeAAA cv = new shapeAAA();
		
		System.out.println(cv.getAa());
		//직사각형 넓이 둘레
	}

}
