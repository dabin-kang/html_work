package aaa.mmm;

import java.util.List;

import lombok.Data;

@Data
public class BuyOrder {
	List<Product> prods;
	Address ad;
	int tot;
	
	public void calc() {
		
		prods = prods.stream().filter(pp->!pp.pname.trim().equals(""))
				.toList();
				
		
		tot = 0; // 값 누적하기 저장
		prods.stream().forEach(pp->{
			pp.tot=pp.price*pp.cnt;
			tot += pp.tot;
		});
	}
}
