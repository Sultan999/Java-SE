package resourcesdemo;
import java.io.*;
import java.util.*;

public class ResourcesDemo {
	
	
	
	
	static void divide() throws Exception{
		
		
		// for closing resource file and scan
		try(FileInputStream fi = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section18_ExceptionHandling/Test.txt"); Scanner scan = new Scanner(fi)){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			System.out.println(a/c);
		}
		
		//fi.close();
		//scan.close();
	}
	
	

	public static void main(String[] args) throws Exception {
		try {
			divide();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
//		int x = scan.nextInt();
//		System.out.println(x);

	}

}
