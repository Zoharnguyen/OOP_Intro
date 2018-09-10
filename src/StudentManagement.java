import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentManagement {
	
	public static boolean sameGroup(Student s1, Student s2) {
		if (s1.getGroup().equals(s2.getGroup())) {
			return true;
		}
		return false;
	}
	
	public static boolean deleteById(String id, List<Student> list) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public static void studentByGroup(List<Student> list) {
		Set<String> listGroupNotDuplicate = new HashSet<String>();
		for(int i=0; i<list.size(); i++) {
			listGroupNotDuplicate.add(list.get(i).getGroup());
		}
		for(String group: listGroupNotDuplicate) {
			System.out.println("Name group: "+group);
			for(int i=0; i<list.size(); i++) {
				if(group.equals(list.get(i).getGroup())) {
					System.out.println("Id= "+list.get(i).getId()+", name= "+list.get(i).getName()+", email= "+list.get(i).getEmail());
				}
			}
		}
	} 
	
	public static void main(String[] args) {
		Student student = new Student();
		List<Student> arrayStudent = new ArrayList();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.setGroup("K60CA");
		s2.setGroup("K60CA");
		s3.setGroup("K60CB");
		Student s101 = new Student("1","Nguyen Van A","A@gmail.com");
		s101.setGroup("K62CH");
		Student s102 = new Student("2","Nguyen Van B","B@gmail.com");
		s102.setGroup("K62CK");
		Student s103 = new Student("3","Nguyen Van C","C@gmail.com");
		s103.setGroup("K62CB");
		Student s104 = new Student("4","Nguyen Van D","D@gmail.com");
		s104.setGroup("K62CH");
		Student s105 = new Student("5","Nguyen Van E","E@gmail.com");
		s105.setGroup("K62CK");
		Scanner sc = new Scanner(System.in);
		arrayStudent.add(s101);
		arrayStudent.add(s102);
		arrayStudent.add(s103);
		arrayStudent.add(s104);
		arrayStudent.add(s105);
		
		student.getInfo();
		if(sameGroup(s1,s2)) {
			System.out.println("Group of s1 and s2 is same");
		}
		if(sameGroup(s1, s3)) {
			System.out.println("Group of s1 and s3 is same");
		}
		else {
			System.out.println("Group of s1 and s3 is not same");
		}
//		System.out.println("Delete student at id= ");
//		String id = sc.next();
//		if(deleteById(id, arrayStudent)) {
//			System.out.println("Delete sucess.");
//		}
//		else {
//			System.out.println("Delete fail.");
//		}
		studentByGroup(arrayStudent);
	}
}
