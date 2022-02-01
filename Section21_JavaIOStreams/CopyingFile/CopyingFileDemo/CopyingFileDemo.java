package copyingfiledemo;
import java.io.*;

public class CopyingFileDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream readFromFile = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Source1.txt");
			
			byte b[] = new byte[readFromFile.available()];
			
			readFromFile.read(b);
			
			String str = new String(b);
			
			System.out.print(str);
			
			FileOutputStream writeToFile = new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Source2.txt");
			
			String str1 = str.toLowerCase();
			
			byte a[] = str1.getBytes();
			
			writeToFile.write(a);
			
			
			readFromFile.close();
			writeToFile.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
