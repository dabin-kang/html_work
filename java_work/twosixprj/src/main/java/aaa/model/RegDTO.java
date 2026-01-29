package aaa.model;

import java.sql.Date;

import lombok.Data;

@Data
public class RegDTO {
	Integer id,hakgi,kor,eng,mat;
	String name,pid,ff,pw;
	Date regDate;
	String service;
	int pNo;
	
}
