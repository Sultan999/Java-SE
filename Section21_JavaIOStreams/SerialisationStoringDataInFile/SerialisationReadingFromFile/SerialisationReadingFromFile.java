package serialisationreadingfromfile;
import java.io.*;

class Student{
	
	int rollNo;
	String name;
	String dept;
}

public class SerialisationReadingFromFile {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream readFromFile = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Student.txt");
		DataInputStream dis = new DataInputStream(readFromFile);
		
		Student s = new Student();
		
		s.rollNo = dis.readInt();
		s.name = dis.readUTF();
		s.dept = dis.readUTF();
		
		
		System.out.println("Student ID: " + s.rollNo);
		System.out.println("Student Name: " + s.name);
		System.out.println("Student Department: " + s.dept);
		
		readFromFile.close();
		dis.close();
		
		

	}

}
