package bytearrayoutputstreamdemo;
import java.io.*;
public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
		
		bos.write('a');
		bos.write('b');
		bos.write('c');
		bos.write('d');
		bos.write('e');
		
		
		bos.writeTo(new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Test1.txt"));
		
//		byte b[] = bos.toByteArray();
//		
//		for(byte x: b) {
//			System.out.println((char)x);
//		}

	}

}
