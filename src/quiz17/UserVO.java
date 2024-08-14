package quiz17;

public class UserVO {
	// 회원정보를 담기 위한 클래스 -> 은닉, getter, setter
	private String name;
	private int age;
	
	//생성자
	public UserVO() {
	}
	
	public UserVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//alt + shift + s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}