
public class Student extends Human implements CSVConverter {

	private int id;
	private String groupName;
	
	
	public Student(int id, String groupName, String name, String surname, Gender gender) {
		super(name, surname, gender);
		this.id = id;
		this.groupName = groupName;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", groupName=" + groupName+" " +  super.toString() + "]";
	}
	
	@Override
	public String toCSVString(Student student) {
		return student.getId() + "," + student.getGroupName() + "," + student.getName() + "," + student.getSurname() + "," + student.getGender();
	}
	
	@Override
	public Student fromCSVString(String str) {
		String[] parts = str.split(",");
		int id = Integer.parseInt(parts[0]);
		String groupName = parts[1];
		String name = parts[2];
		String surname = parts[3];
		Gender gender = Gender.valueOf(parts[4]);
		
		return new Student(id, groupName, name, surname, gender);
		
	}
	
	
}
