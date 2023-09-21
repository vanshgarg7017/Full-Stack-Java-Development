package fullstack.org;
class Riya<T extends Comparable<T>> implements Comparable<T>{
private T myVariable;
public Riya(T myVariable) {
	super();
	this.myVariable=myVariable;
}

	public T getMyVariable() {
	return myVariable;
}
	
	@Override
	public String toString() {
		return "Riya [myVariable=" + myVariable + "]";
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return getMyVariable().compareTo(o);
	}
	
}
public class ComparableInterface {
public static void main(String[] args) {
	Riya<Integer> integer=new Riya<Integer>(1);
	System.out.println(integer.compareTo(1));
}
}
