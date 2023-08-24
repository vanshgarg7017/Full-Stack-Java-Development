package fullstack.org;

import phonefullstack.org.nokia;
import phonefullstack.org.phone;
import phonefullstack.org.samsung;

public class Hello {
	public static void main(String[] args) {
//		phone note7=new samsung("note7");
		phone note7=new Hello().phone1(1);
		System.out.println(note7.getModel());
		note7.features();
		
//		phone nokia44 =new nokia("nokia44");
		phone nokia44=new Hello().phone1(2);
		System.out.println(nokia44.getModel());
		nokia44.features();
	}
	public phone phone1(int dailydriver) {
		switch(dailydriver) {
		case 1:return new nokia("3310");
		case 2:return new samsung("note7");
		}
		return null;
	}
	

}
