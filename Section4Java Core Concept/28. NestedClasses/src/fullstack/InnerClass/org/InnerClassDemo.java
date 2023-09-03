package fullstack.InnerClass.org;

public class InnerClassDemo {
public static void main(String[] args) {
	OuterClass outerobject=new OuterClass();
	OuterClass.InnerClass innerObject=outerobject.new InnerClass();
	innerObject.display();
}
}
