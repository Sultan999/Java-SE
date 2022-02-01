package fileoutputstreamdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Test.txt");
			
			String str = "Learn Java Programming";
			
			byte b[] = str.getBytes();
			
			fos.write(b);
			
			// This is the first method
			//fos.write(str.getBytes());
			
			// This is the second method
//			for(byte x: b) {
//				fos.write(x);
//			}
			
			
			
			
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
