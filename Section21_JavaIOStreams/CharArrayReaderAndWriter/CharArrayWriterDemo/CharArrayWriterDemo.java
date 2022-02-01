package chararraywriterdemo;
import java.io.*;
public class CharArrayWriterDemo {

	public static void main(String[] args) throws Exception {
		
		CharArrayWriter caw = new CharArrayWriter();
		
		caw.write('a');
		caw.write('b');
		caw.write('c');
		caw.write('d');
		caw.write('e');
		caw.write('f');
		
		
		FileWriter fw = new FileWriter("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Test2.txt");
		
		caw.writeTo(fw);
		fw.flush(); // use flush
		caw.close();
		
		
//		char c[] = caw.toCharArray();
//		
//		for(char x: c) {
//			System.out.println(x);
//		}

	}

}
