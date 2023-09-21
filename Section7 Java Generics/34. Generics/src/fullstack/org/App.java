package fullstack.org;
class Data{
	private Object obj;
 
	public Data(Object obj) {
		this.obj = obj;
	}
 
	public Object getObj() {
		return obj;
	}
 
	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
}
 
class GenericClass<T>{
	private T data;
 
	public GenericClass(T data) {
		this.data = data;
	}
 
	public T getData() {
		return data;
	}
 
	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
}
public class App {
	public static void main(String[] args) {	
		GenericClass<String> genericData = new GenericClass<String>("Some Data");
		String data = genericData.getData();
		System.out.println(data);	
	}
 
}