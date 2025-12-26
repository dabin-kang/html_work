package coll_p;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue qq = new LinkedList();
		
		st.add(1);
		st.add(2);
		st.add(3);
		
		
		qq.add(1);
		qq.add(2);
		qq.add(3);

		System.out.println("st : "+st);
		System.out.println("qq : "+qq);
		
		st.push(4);
		st.push(5);
		st.push(6);
		
		qq.offer(4);
		qq.offer(5);
		qq.offer(6);
		
		System.out.println("st : "+st);
		System.out.println("qq : "+qq);
		
		System.out.println(st.get(0));
		
		
		Object rr = st.pop();
		System.out.println(rr);
		System.out.println("st ; "+st);
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("qq-----------------------");
		rr = qq.poll();
		System.out.println(rr);
		System.out.println("qq ; "+qq);
		while(!qq.isEmpty()) {
			System.out.println(qq.poll());
		}
	}

}
