package coll_p;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class TreeStud implements Comparable{
	final int ban;
	final String kind,name;
	final int jum;
	
	TreeStud(int ban, String kind, String name, int jum) {
		this.ban = ban;
		this.kind = kind;
		this.name = name;
		this.jum = jum;
	}
	@Override
	public String toString() {
		return ban+"\t"+kind+"\t"+name+"\t"+jum;
	}
	@Override
	public int compareTo(Object o) {
		TreeStud you = (TreeStud)o;
		int res = you.jum - jum;
		
		if(res== 0) {
			res = name.compareTo(you.name);
		}
		return res;
	}
	
}

class MyMapCom implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String me = (String)o1;
		String you= (String)o2;
		return you.compareTo(me);
	}
}

public class TreeMapStudMain {

	public static void main(String[] args) {
		TreeStud [] ori = {
				new TreeStud(2,"예체능","원빈",77),
				new TreeStud(1,"일반","원빈이",42),
				new TreeStud(4,"예체능","이빈",11),
				new TreeStud(4,"일반","하나빈",19),
				new TreeStud(4,"일반","콩빈",19),
				new TreeStud(1,"일반","콩빈",22),
				new TreeStud(2,"예체능","밥빈",71),
				new TreeStud(1,"예체능","호빈",70),
				new TreeStud(1,"일반","호빗",55),
				new TreeStud(2,"예체능","다빈",2),
				new TreeStud(4,"예체능","숙빈",97)
		};
		
		MyMapCom mmc = new MyMapCom();
		
		TreeMap<Integer, Integer> res = new TreeMap<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int me = o1;
				int you = o2;
				return you-me;
			}
		});
		for (TreeStud st : ori) {
			TreeMap<Integer, Integer> ban ;
			if(res.containsKey(st.ban)) {
				ban = (TreeMap)res.get(st.ban);
			}else {
				ban = new TreeMap(mmc);
			}
			res.put(st.ban,ban);
			
			TreeSet kind ;
			if(ban.containsKey(st.kind)) {
				kind = (TreeSet)ban.get(st.kind);
			}else {
				kind = new TreeSet();
			}
			ban.put(st.kind,kind);
			
			kind.add(st);
		}
//		System.out.println(res);
		for (Object obj1 : res.entrySet()) {
			Map.Entry banSet = (Map.Entry)obj1;
			System.out.println("["+banSet.getKey()+"]");
			
			for (Object obj2 : ((TreeMap)banSet.getValue()).entrySet()) {
				Map.Entry kindSet = (Map.Entry)obj2;
				System.out.println(kindSet.getKey()+">>>");
				
				for (Object st : (TreeSet)kindSet.getValue()) {
					System.out.println(st);
				}
			}
		}
		
		
		
	}

}
