package firstmethodwritinginfile;
import java.io.*;


class Student{
	
	int rollNo;
	String name;
	String dept;
}



public class FirstMethodWritingInFile {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream writeInFile = new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Test2.txt");
		
		PrintStream ps = new PrintStream(writeInFile);
		
		Student s = new Student();
		s.rollNo = 12345;
		s.name = "Sultan";
		s.dept = "SaNE";
		
		
		ps.println(s.rollNo);
		ps.println(s.name);
		ps.println(s.dept);
		
		writeInFile.close();
		ps.close();

	}

}
