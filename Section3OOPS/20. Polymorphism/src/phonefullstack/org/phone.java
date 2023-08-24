package phonefullstack.org;

public class phone {
	private String model;
	public phone(String model) {
		this.model=model;
	}
	public void features() {
		System.out.println("feature phone");
	}
	public String getModel() {
		return model;
	}

}
