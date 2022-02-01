package serialisationwritinginfile;
import java.io.*;

class Student{
	
	int rollNo;
	String name;
	String dept;
}

public class SerialisationWritingInFile {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream writeInFile = new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Student.txt");
		DataOutputStream dos = new DataOutputStream(writeInFile);
		
		Student s = new Student();
		
		s.rollNo = 12345;
		s.name = "Sultan";
		s.dept = "SaNE";
		
		dos.writeInt(s.rollNo);
		dos.writeUTF(s.name);
		dos.writeUTF(s.dept);
		
		writeInFile.close();
		dos.close();                  

	}

}
