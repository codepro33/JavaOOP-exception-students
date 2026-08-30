public class Main {

	public static void main(String[] args) {
		Gender male = Gender.MALE;
		Gender female = Gender.FEMALE;
		Group IT = new Group("IT");
		
		Student student1 = new Student(64559,"IT");
		student1.setGender(male);
		student1.setName("Xalid");
		student1.setSurname("Ibn-Valid");
		Student student2 = new Student(6459,"IT");
		student2.setGender(male);
		student2.setName("Muhammad");
		student2.setSurname("Ibn-Abbas");
		Student student3 = new Student(659,"IT");
		student3.setGender(male);
		student3.setName("Haydar");
		student3.setSurname("Aliyev");
		Student student4 = new Student(645,"IT");
		student4.setGender(male);
		student4.setName("Omar");
		student4.setSurname("Xayyam");
		Student student5 = new Student(649,"IT");
		student5.setGender(male);
		student5.setName("Huseyn");
		student5.setSurname("Muxtar");
		Student student6 = new Student(4559,"IT");
		student6.setGender(male);
		student6.setName("Ali");
		student6.setSurname("Karimov");
		Student student7 = new Student(559,"IT");
		student7.setGender(male);
		student7.setName("Karim");
		student7.setSurname("Bunyadov");
		Student student8 = new Student(6455,"IT");
		student8.setGender(male);
		student8.setName("John");
		student8.setSurname("Wick");
		Student student9 = new Student(1232,"IT");
		student9.setGender(male);
		student9.setName("Rayan");
		student9.setSurname("Ford");
		Student student10 = new Student(345,"IT");
		student10.setGender(male);
		student10.setName("Sergey");
		student10.setSurname("Konyakov");
		Student student11 = new Student(678,"IT");
		student11.setGender(male);
		student11.setName("Anil");
		student11.setSurname("Tuken");
		
		try {
			IT.addStudent(student1);
			IT.addStudent(student2);
			IT.addStudent(student3);
			IT.addStudent(student4);
			IT.addStudent(student5);
			IT.addStudent(student6);
			IT.addStudent(student7);
			IT.addStudent(student8);
			IT.addStudent(student9);
			IT.addStudent(student10);
		} catch (GroupOverflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(IT.searchStudentByLastName("Ibn-Valid"));
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(IT.deleteStudentByID(1232));
		
		try {
			System.out.println(IT.searchStudentByLastName("Ford"));
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
