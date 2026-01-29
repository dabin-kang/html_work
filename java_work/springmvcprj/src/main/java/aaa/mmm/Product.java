package aaa.mmm;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
	String pname;
	Integer price, cnt,tot;
	
	// 입력받는 값이 없으면 에러가 나지 않게 하기 위해서 넣는다
	public void setPrice(Integer price) {
		this.price = price;
		if(price==null) {
			this.price =0;
		}
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
		if(cnt==null) {
			this.cnt=0;
		}
	}
	
	public Product (String pname,Integer price,Integer cnt) {
		this.pname= pname;
		this.price = price;
		this.cnt = cnt;
		tot = price*cnt;
		
	}
	
	
}
