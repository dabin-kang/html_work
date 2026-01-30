package aaa.di;

import lombok.Data;

@Data
public class PageInfo {
	String service;
	int cnt =3, pCnt = 4;
	int pNo;
	int start,total;
	int pStart, pEnd,pTotal;
	
	public void setPNo(int pNo) {
		this.pNo = pNo;
		
		start = (pNo-1)*cnt;
		
		pStart = (pNo-1)/pCnt*pCnt+1;
		pEnd = pStart+pCnt-1;
		
		// 마지막이 되면 [다음]이 사라지게 만든다
		if(pEnd > pTotal) {
			pEnd = pTotal;
		}
		
	}
	
	
	public void setTotal(int total) {
		this.total = total;
		
		pTotal = total/cnt;
		
		if(total%cnt>0) {
			pTotal++;
		}
		
	}
	
}
