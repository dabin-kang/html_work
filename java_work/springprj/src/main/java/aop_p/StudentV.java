package aop_p;

public class StudentV {
	String name;
	String examType;
	int kor , eng , mat ;
	int total;
	double avg;
	
	public StudentV(String name,String examType,int kor,int eng,int meth){
		this.name = name;
		this.examType = examType;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.total = kor+eng+mat;
		this.avg = total/3;
	}

	@Override
	public String toString() {
		return "StudentV [name=" + name + ", examType=" + examType + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat
				+ ", total=" + total + ", avg=" + avg + "]";
	}
	
	
	public String getName() {return name;}
	public String getExamType() {return examType;}
	public double getAvg() {return avg;}
	
}




