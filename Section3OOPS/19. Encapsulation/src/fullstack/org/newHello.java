package fullstack.org;

public class newHello {
private String name;
private String gender;
private int age;
public boolean setAge(int age) {
	if(age>=0&&age<=100) {
		this.age=age;
		return true;
	}
	return false;
}
public int getAge() {
	return age;
}

}
