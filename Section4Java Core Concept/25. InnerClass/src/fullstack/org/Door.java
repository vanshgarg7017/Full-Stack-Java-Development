package fullstack.org;

public class Door {
private Lock lock;
public Door() {
	lock=new Lock(true);
}
public Lock getLock() {
	return lock;
}
public void setStatus() {
	if(lock.isLock()) {
		System.out.println("Shop is close! Please come later");
	}
	else {
		System.out.println("Welcome, shop is open");
	}
}
public class Lock{
	private boolean lock;
	public Lock(boolean lock) {
		this.lock=lock;
	}
	public boolean isLock() {
		return lock;
	}
	public void setLock(boolean lock) {
		this.lock=lock;
	}
}
}
