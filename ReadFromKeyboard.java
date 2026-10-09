import java.util.Scanner;

public class ReadFromKeyboard{
	
	private String name;
	private String surname;
	private Gender gender;
	
	private int id;
	private String groupName;
	
	
    Scanner sc = new Scanner(System.in);
    
    public Student readStudentData() {
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter surname: ");
		surname = sc.nextLine();
		System.out.print("Enter gender (MALE/FEMALE): ");
		gender = Gender.valueOf(sc.nextLine().toUpperCase());
		System.out.println("Enter ID:");
    	id = sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter group name:");
    	groupName = sc.nextLine();
    	return new Student(id, groupName, name, surname, gender);
	}
		
    
    


}
