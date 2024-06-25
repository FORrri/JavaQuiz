package quiz20;

public class Data {
	private String age;
	private String name;
	private String id;
	private String email;
	
	public Data(String name, String age, String email, String id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Data [age=" + age + ", name=" + name + ", id=" + id + ", email=" + email + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	

}
