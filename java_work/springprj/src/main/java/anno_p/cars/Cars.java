package anno_p.cars;

import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
import lombok.Data;
import lombok.ToString;

public class Cars {
	
}

@Data
//@ToString
@Component("car1")
class Busta{
	String name;
	int parwer;
	
	public Busta() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setParwer(int parwer) {
		this.parwer = parwer;
	}

	/*
	 * @Override public String toString() { return "Busta [name=" + name +
	 * ", parwer=" + parwer + "]"; }
	 */
	
}




interface Pickup{
	
}

@Component
class Ripu implements Pickup{
	String rpu = "리무진 짐칸";

	@Override
	public String toString() {
		return "Ripu [rpu=" + rpu + "]";
	}
	
}

@Component
class Trpu implements Pickup{
	String trpu = "트럭 짐칸";

	@Override
	public String toString() {
		return "Trpu [trpu=" + trpu + "]";
	}
	
	
}


@Component("rimujin")
class Rimujin{
	String name ="리무진";
	
	@Resource(name ="ripu")
	Pickup rpu;
	int size;
	
	@Override
	public String toString() {
		return "리무진 [name=" + name + ", Pickup=" + rpu + ", size=" + size + "]";
	}	
}


class Track{
	@Resource(name="trpu")
	Pickup trpu;

	@Override
	public String toString() {
		return "트럭 [pu=" + trpu + "]";
	}
	
	
}





