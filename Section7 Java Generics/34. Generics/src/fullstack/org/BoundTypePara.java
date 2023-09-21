package fullstack.org;
class Mia<K extends Integer, V extends BoundTypePara>{
	private K key;
	private V value;
	public Mia(K key,V value) {
		this.key=key;
		this.value=value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Mia [key=" + key + ", value=" + value + "]";
	}
	public<E extends Character,N extends Number> void display(E element,N number) {
		System.out.println("Elements: "+ element +" Number: "+number);
	}
}
public class BoundTypePara {
public static void main(String[] args) {
	Mia<Integer,BoundTypePara> mia=new Mia<Integer,BoundTypePara>(1, new BoundTypePara());
	mia.display('$', 1);
	mia.getValue().test();
	System.out.println(mia.getKey());
			
			
			
			
			
}
public void test() {
	System.out.println("Testing.......");
}
}
