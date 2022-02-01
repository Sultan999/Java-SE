package firstmethodreadingfromfile;
import java.io.*;

class Student{
	
	int rollNo;
	String name;
	String dept;
}

public class FirstMethodReadingFromFile {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Test2.txt");
		
		// FileInputStream can't read String so that's why we will use BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		Student s = new Student();
		
		s.rollNo = Integer.parseInt(br.readLine());
		s.name = br.readLine();
		s.dept = br.readLine();
		
		System.out.println("Student ID: " + s.rollNo);
		System.out.println("Student Name: " + s.name);
		System.out.println("Student Departement: " + s.dept);
		
		fis.close();
		br.close();

	}

}
