package fullstack.localInnerClass.org;

public class Outer {
void getValue() {
	int sum=20;
	class Inner{
		public int divisor;
		public int remainder;
		public Inner() {
			divisor=4;
			remainder=sum%divisor;
		}
		private int getDivisor()
		{
			return divisor;
		}
		private int getremainder() {
			return remainder;
		}
		private int getQuentient() {
			System.out.println("inside a class");
			return sum/divisor;
		}
	}
	Inner inner=new Inner();
	System.out.println("Divisor :"+inner.getDivisor());
	System.out.println("Remainder :"+inner.getremainder());
	System.out.println("Quentient :"+inner.getQuentient());	
}
}
