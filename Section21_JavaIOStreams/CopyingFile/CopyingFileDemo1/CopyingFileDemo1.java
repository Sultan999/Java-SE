package copyingfiledemo1;
import java.io.*;

public class CopyingFileDemo1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream readFromFile = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Source1.txt");
			FileOutputStream writeToFile = new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Source3.txt");
			
			
			
			
			int b;
			while((b = readFromFile.read()) != -1) {
				
				// The range of upperCase is from 65 - 90
				// The range of LowerCase is from 97 - 122
				
				if(b >= 65 && b <= 90) {
					writeToFile.write(b + 32);
				}
				else {
					writeToFile.write(b);
				}
			}
			
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
