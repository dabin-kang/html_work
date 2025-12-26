package lang_p;

public class WrapperMain {

	public static void main(String[] args) {
		int i = new Integer(123);
		System.out.println(i);
		
		Integer i2 = 345;
		System.out.println(i2);
		i = i2;
		System.out.println(i);
		
		
//		객체가 아니라서 null을 못 받는다
//		i = null;
		i2 = null;
		
		i = 789;
		i2 = i;
		System.out.println(i2);
		
		
		
		i2 = Integer.parseInt("125");
		System.out.println(i2);
		i2 = Integer.parseInt("101");
		System.out.println(i2);
		
//		진수로 표기 할수가 있다
		i2 = Integer.parseInt("101",2);
		System.out.println(i2);
		i2 = Integer.parseInt("101",8);
		System.out.println(i2);
		i2 = Integer.parseInt("101",16);
		System.out.println(i2);
		
		
		byte bb = Byte.parseByte("123");
		System.out.println(bb);
		Short ss = Short.parseShort("123",8);
		System.out.println(ss);
		long ll = Long.parseLong("13465798546413");
		System.out.println(ll);
		
		
		float ff = Float.parseFloat("123.456");
		System.out.println(ff);
		double dd = Double.parseDouble("123.456");
		System.out.println(dd);
		
		boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		
//		char ch = Character.parseCharacter("A")
		char ch = "A".charAt(0);
		System.out.println(ch);
		
		
		
		
//		Integer.parseInt("123.456); 정수에 . 을 넣어서 에러가 난다
		Double.parseDouble("456");
//		Double.parseDouble("456asf123");
		
		
		
		
		
		
		
		
		
		
		
	}

}
