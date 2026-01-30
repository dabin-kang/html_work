package aaa.di;

import lombok.Data;

@Data
public class PageInfo {
	String service;
	int cnt =5, pCnt = 4;
	int pNo;
	int start,total;
	int pStart, pEnd,pTotal;
	
	public void setpNo(int pNo) {
		this.pNo = pNo;
		
		start = (pNo-1)*cnt;
	}
	
	
	public void setTotal(int total) {
		this.total = total;
		
		pTotal = total/cnt;
		
		if(total%cnt>0) {
			pTotal++;
		}
	}
	
}
