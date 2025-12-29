package coll_p;

import java.util.ArrayList;
import java.util.Iterator;

class Phone{}
class HandPhone extends Phone{}
class SmartPhone extends HandPhone{}
class TV{}



public class GenericListMain {
	public static void main(String[] args) {
		ArrayList ooArr = new ArrayList();
		ArrayList <Phone> phoneArr = new ArrayList();
		ArrayList <HandPhone> handArr = new ArrayList();
		ArrayList <SmartPhone> smartArr = new ArrayList();
		ArrayList <? super HandPhone> superHandArr = new ArrayList();
		ArrayList <? extends HandPhone> extendsHandArr = new ArrayList();// 모두불가 의미 없음
		ArrayList <TV> tvArr = new ArrayList ();
		
		ooArr.add(new TV());
		ooArr.add(new Phone());
		ooArr.add(new HandPhone());
		ooArr.add(new SmartPhone());
		
//		phoneArr.add(new TV());
		phoneArr.add(new Phone());		//자신 가능
		phoneArr.add(new HandPhone());	//자손 가능
		phoneArr.add(new SmartPhone());
		
//		handArr.add(new TV());
//		handArr.add(new Phone());		//부모 불가
		handArr.add(new HandPhone());	//자신 가능
		handArr.add(new SmartPhone());	//자손 가능
		
//		smartArr.add(new TV());			
//		smartArr.add(new Phone());
//		smartArr.add(new HandPhone());	
		smartArr.add(new SmartPhone());	//자신 가능
		
//		superHandArr.add(new TV());
//		superHandArr.add(new Phone());
		superHandArr.add(new HandPhone());	//자신 -handArr과 같음
		superHandArr.add(new SmartPhone());	//자손
		
		extendsHandArr.add(new TV());
		extendsHandArr.add(new Phone());
		extendsHandArr.add(new HandPhone());
		extendsHandArr.add(new SmartPhone());
		
		tvArr.add(new TV());
//		tvArr.add(new Phone());
//		tvArr.add(new HandPhone());
//		tvArr.add(new SmartPhone());
		
		
//		메서드에서 어떻게 사용하는지
		methObj(ooArr);
		methObj(phoneArr);
		methObj(handArr);
		methObj(smartArr);
		methObj(superHandArr);
		methObj(extendsHandArr);
		methObj(tvArr);
		
		
//		methHand(ooArr);		//컴파일 시에는 정상으로 보이나 실행시 에러발생
//		methHand(phoneArr);
		methHand(handArr);		//자신만 가능
//		methHand(smartArr);
//		methHand(superHandArr);
//		methHand(extendsHandArr);
//		methHand(tvArr);
		
		methPhone(phoneArr);	//자신만 가능
//		methPhone(handArr);
//		methPhone(smartArr);
//		methPhone(superHandArr);
//		methPhone(extendsHandArr);
//		methPhone(tvArr);
		
//		methSmart(phoneArr);
//		methSmart(handArr);
		methSmart(smartArr);	//자신만 가능
//		methSmart(superHandArr);
//		methSmart(extendsHandArr);
//		methSmart(tvArr);
		
//		methEx(phoneArr);
		methEx(handArr);		//자신
		methEx(smartArr);		//자손 가능
//		methEx(superHandArr);	
		methEx(extendsHandArr);	//자신+자손 가능
//		methEx(tvArr);
		
		methSuper(phoneArr);
		methSuper(handArr);
//		methSuper(smartArr);
		methSuper(superHandArr);
//		methSuper(extendsHandArr);
//		methSuper(tvArr);
		
		
		Iterator itObj;
		itObj = ooArr.iterator();
		itObj = phoneArr.iterator();
		itObj = handArr.iterator();
		itObj = smartArr.iterator();
		itObj = superHandArr.iterator();
		itObj = extendsHandArr.iterator();
		itObj = tvArr.iterator();
		
		Iterator<Phone> itPhone;
		itPhone = ooArr.iterator();
		itPhone = phoneArr.iterator();			//자신만 가능
//		itPhone = handArr.iterator();
//		itPhone = smartArr.iterator();
//		itPhone = superHandArr.iterator();
//		itPhone = extendsHandArr.iterator();
//		itPhone = tvArr.iterator();
		
		Iterator<HandPhone> itHandPhone;
//		itHandPhone = ooArr.iterator();
//		itHandPhone = phoneArr.iterator();
		itHandPhone = handArr.iterator();		//자신만 가능
//		itHandPhone = smartArr.iterator();
//		itHandPhone = superHandArr.iterator();
//		itHandPhone = extendsHandArr.iterator();
//		itHandPhone = tvArr.iterator();
		
		Iterator<SmartPhone> itSmart;
//		itSmart = ooArr.iterator();
//		itSmart = phoneArr.iterator();
//		itSmart = handArr.iterator();
		itSmart = smartArr.iterator();		//자신만가능
//		itSmart = superHandArr.iterator();
//		itSmart = extendsHandArr.iterator();
//		itSmart = tvArr.iterator();
		
		Iterator<? extends HandPhone> itEx; //자신 + 자손
//		itEx = ooArr.iterator();
//		itEx = phoneArr.iterator();
		itEx = handArr.iterator();			//자신
		itEx = smartArr.iterator();			//자손
//		itEx = superHandArr.iterator();
		itEx = extendsHandArr.iterator();	//자신 + 자손
//		itEx = tvArr.iterator();
		
		Iterator<? super HandPhone> itSuper;
//		itSuper = ooArr.iterator();
		itSuper = phoneArr.iterator();		//부모
		itSuper = handArr.iterator();		//자신
//		itSuper = smartArr.iterator();
		itSuper = superHandArr.iterator();	//자신 + 부모
//		itSuper = extendsHandArr.iterator();
//		itSuper = tvArr.iterator();

	}
	
	static void methObj(ArrayList arr) {
		for (Object obj : arr) {
			
		}
	}
	static void methPhone(ArrayList<Phone> arr) {
		for (Phone obj : arr) {
			
		}
	}
	static void methSmart(ArrayList<SmartPhone> arr) {
		for (SmartPhone obj : arr) {
			
		}
	}
	static void methHand(ArrayList<HandPhone> arr) {
		for (HandPhone obj : arr) {
			
		}
	}
	static void methEx(ArrayList<? extends HandPhone> arr) {
		for (HandPhone obj : arr) {
			
		}
	}
	static void methSuper(ArrayList<? super HandPhone> arr) {
//		for (HandPhone obj : arr) {
		for(Object obj : arr) {// 부모가 가능하기에Object로 올라가야 함
			
		}
	}

}
