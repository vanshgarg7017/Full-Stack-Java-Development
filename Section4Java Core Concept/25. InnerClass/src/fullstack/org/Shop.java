package fullstack.org;

public class Shop {
public static void main(String[] args) {
	Door door=new Door();
	door.setStatus();
	door.getLock().setLock(false);
	door.setStatus();
}
}
