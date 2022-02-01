package MergeFilesDemo;
import java.io.*;

public class MergeFilesDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream readFromFile1 = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Source1.txt");
			FileInputStream readFromFile2 = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Source2.txt");
			
			FileOutputStream writeToFile = new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Destination.txt");
			
			SequenceInputStream mergeFiles = new SequenceInputStream(readFromFile1, readFromFile2);
			
			int b;
			while((b = mergeFiles.read()) != -1) {
				
				writeToFile.write(b);
			
			}
			
			readFromFile1.close();
			readFromFile2.close();
			writeToFile.close();
			mergeFiles.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
