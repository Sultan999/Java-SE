package serialisationobjectstream;
import java.io.*;

class Student implements Serializable {
	
	private int rollNo;
	private String name;
	private float avg;
	private String dept;
	public static int data = 10;
	public transient int t;
	
	public Student(){
		
	}
	public Student(int r, String n, float a, String d) {
		
		this.rollNo = r;
		this.name = n;
		this.avg = a;
		this.dept = d;
		this.data = 500;
		this.t = 500;
	}
	
	public String toString() {
		
		return "\nStudent Details\n" +
				"\nStudent ID: " + rollNo +
				"\nStudent Name: " + name +
				"\nStudent Average; " + avg +
				"\nStudent Departement: " + dept +
				"\nData: " + data +
				"\nTransient: " + t + "\n";
	}
	
}

public class SerialisationObjectStream {

	/*
	public static void main(String[] args) throws Exception {
		

		FileOutputStream writeInFile = new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Student1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(writeInFile);
		
		Student s = new Student(123, "Hasen", 96f, "SaNE");
		
		oos.writeObject(s);
		
		writeInFile.close();
		oos.close();
		
		// I can access it like that if the variable is public not private 
		//s.rollNo = 12;
		
		
		
	}
	*/
	
	
	public static void main(String[] args) throws Exception {
		

		FileInputStream readFromFile = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Student1.txt");
		ObjectInputStream ois = new ObjectInputStream(readFromFile);
		
		Student s = (Student)ois.readObject();
		
		System.out.println(s);
		
		readFromFile.close();
		ois.close();
		
		
		
	}
	
	
}
