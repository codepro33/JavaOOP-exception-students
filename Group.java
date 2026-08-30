
public class Group {

	String groupName;
	int counter=0;
	Student[] students = new Student[10];
	
	
	
	public Group(String groupName) {
		super();
		this.groupName = groupName;
		this.students = new Student[10];
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student student) throws GroupOverflowException{
		
		if(counter>=10){
			throw new GroupOverflowException("Maximum group size is 10");
		}else {
		students[counter] = student;
		counter++;
		System.out.println("Student " + student.getName() + " " + student.getSurname() + " added to group " + groupName);
		}
	}
	
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
		int id = -1;
		for(int i = 0; i<students.length;i++ ) {
			
			if(students[i]!=null && students[i].getSurname().equals(lastName)) {
				id=i;
			}else {
				continue;
			}
		}
		if(id==-1) {
			throw new StudentNotFoundException();
		}else {
		return students[id];
		}
	}
	
	public boolean deleteStudentByID(int id) {
	
	for(int i = 0; i<students.length;i++ ) {
		
		if(students[i]!=null && students[i].getId()==id) {
			students[i]=null;
			return true;
		}else {
			continue;
		}
	}
	return false;
	}
}
