package studenttest;

class Student{

	public String roll;
	public String name;
	public String course;
	public int m1,m2,m3;

	public int total() {

		int t;
		t = m1 + m2 + m3;

		return t;
	}

	public float average() {

		float a;
		a = (float)total()/3;
		return a;
	}

	public char grade() {

		//char A = 'A', B = 'B', C = 'C', D = 'D', F = 'F';

		if(average() >= 70) {
			return 'A';
		}
		else if(average() >= 60) {
			return 'B';
		}
		else if(average() >= 50) {
			return 'C';
		}
		else if(average() >= 40) {
			return 'D';
		}
		else {
			return 'F';
		}
	}

	public String toString() {

		return "Student Number: " + roll + "\n" +
				   "Student Name: " + name + "\n" +
				   "Student Course: " + course;
	}

//	public String details() {
//
//		return "Student Number: " + roll + "\n" +
//			   "Student Name: " + name + "\n" +
//			   "Student Course: " + course;
//	}



}

public class StudentTest {

	public static void main(String[] args) {

		Student s = new Student();

		s.roll = "U007";
		s.name = "Sultan Alzahrani";
		s.course = "Software Engineering and Network Engineering";
		s.m1 = 70;
		s.m2 = 80;
		s.m3 = 65;

//		System.out.println("Student ID: " + s.roll);
//		System.out.println("Student Name: " + s.name);
//		System.out.println("Student Course: " + s.course);

		System.out.println("Detial:\n\n" + s);
		System.out.println("Student Total Marks: " + s.total());
		System.out.println("Student Average: " + s.average());
		System.out.println("Student Grade: " + s.grade());



//		if(s.grade() == 'A') {
//			System.out.println("Student Grade: A");
//		}
//		else if(s.grade() == 'B') {
//			System.out.println("Student Grade: B");
//		}
//		else if(s.grade() == 'C') {
//			System.out.println("Student Grade: C");
//		}
//		else if(s.grade() == 'D') {
//			System.out.println("Student Grade: D");
//		}
//		else {
//			System.out.println("Student Grade: F");
//		}





	}

}
