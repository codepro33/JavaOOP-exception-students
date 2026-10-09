public class Main {

	public static void main(String[] args) {
		Gender male = Gender.MALE;
		Gender female = Gender.FEMALE;
		Group IT = new Group("IT");
		
		ReadFromKeyboard read = new ReadFromKeyboard();
		
		Student student1 = new Student(64559,"IT","Xalid","Ibn-Valid",male);
		Student student2 = new Student(6459,"IT","Muhammad","Ibn-Abbas",male);
		Student student3 = new Student(659,"IT","Ali","Ibn-Abbas",male);
		Student student4 = new Student(645,"IT","Ali","Ibn-Sabah",male);
		Student student5 = new Student(649,"IT","Ramin","Huseynov",male);
		Student student6 = new Student(4559,"IT","Ali","Karimov",male);
		Student student7 = new Student(559,"IT","Karim","Bunyadov",male);
		Student student8 = new Student(6455,"IT","John","Wick",male);
		Student student9 = new Student(1232,"IT","Rayan","Ford",male);
		Student student10 = read.readStudentData();
		
		
		
		
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
		
		IT.SortStudentsByLastName();
	}

}
