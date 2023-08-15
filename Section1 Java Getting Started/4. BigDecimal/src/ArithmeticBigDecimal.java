import java.math.BigDecimal;

public class ArithmeticBigDecimal {

	public static void main(String[] args) {
		BigDecimal num1=new BigDecimal("231.23");
		BigDecimal num2=new BigDecimal(23.45);
		//Addition
		BigDecimal result=num1.add(num2);
		System.out.println("Addition: "+result);
		// Subtraction
		BigDecimal result2=num1.subtract(num2);
		System.out.println("Subtraction: "+result2);
		// Multiply
		BigDecimal result3=num1.multiply(num2);
		System.out.println("Multiply: "+result3);
		// Division
		@SuppressWarnings("deprecation") //optional
		BigDecimal result4=num1.divide(num2,2,BigDecimal.ROUND_HALF_UP);
		System.out.println("Division:"+result4);
		
	}

}
