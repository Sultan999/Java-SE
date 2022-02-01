package randomaccessfiledemo;
import java.io.*;

public class RandomAccessFileDemo {

	public static void main(String[] args) {
		
		try {
			RandomAccessFile raf = new RandomAccessFile("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Test2.txt", "rw");
			
			// The data that in the file Test2 that I'm going to access is "Sultan Hasen Alzahrani"
			
			
			System.out.println((char)raf.read());
			System.out.println((char)raf.read());
			System.out.println((char)raf.read());
			// rewrite at index 4
			raf.write('T');
			System.out.println(raf.getFilePointer());
			System.out.println((char)raf.read());
			System.out.println((char)raf.read());
			System.out.println((char)raf.read());
			// skip one index
			raf.skipBytes(1);
			System.out.println((char)raf.read());
			// To read or write at a specific location in a RandomAccessFile you must first position the file pointer. 
			// In this example it will start from index 13 and it read or write at index 14
			raf.seek(13);
			// index 14
			System.out.println((char)raf.read() + " " + raf.getFilePointer());
			// To know where is the file position at meaning that you will know which index are you at the this moment 
			System.out.println(raf.getFilePointer() + 2);
			System.out.println((char)raf.read());
			
			raf.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
