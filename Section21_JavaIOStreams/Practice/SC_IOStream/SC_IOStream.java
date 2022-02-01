package sc_iostream;
import java.io.*;
public class SC_IOStream {

	public static void main(String[] args) throws Exception {
		
		float list[] = {1.2f, 2.5f, 4.6f, 34.5f, 56.2f};
		FileOutputStream writeInFile = new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/StudentChallengeTest.txt");
		DataOutputStream dos = new DataOutputStream(writeInFile);
		
		// First you have to store the length of the list 
		dos.writeInt(list.length);
		
		for(float f: list) {
			dos.writeFloat(f);
		}
		
		writeInFile.close();
		dos.close();
		
		FileInputStream readFromFile = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/StudentChallengeTest.txt");
		DataInputStream dis = new DataInputStream(readFromFile);
		
		int length = dis.readInt();
		
		float data;
		for(int i = 0; i<length; i++) {
			
			data = dis.readFloat();
			System.out.println(data);
		}
		
		
		readFromFile.close();
		dis.close();

	}

}
