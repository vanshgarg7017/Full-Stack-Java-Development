import java.math.BigDecimal;

public class bigDecimal {

	public static void main(String[] args) {
		BigDecimal num1=new BigDecimal("123.45");
		BigDecimal num2=new BigDecimal(67.45);
		BigDecimal result=num1.add(num2);
		System.out.println(result);
	}
}
