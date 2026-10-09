
public class Human {

	private String name;
	private String surname;
	private Gender gender;
	
	
	
	
	public Human(String name, String surname, Gender gender) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
	}
	
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", surname=" + surname + ", gender=" + gender;
	}
	
	
	
	
}
