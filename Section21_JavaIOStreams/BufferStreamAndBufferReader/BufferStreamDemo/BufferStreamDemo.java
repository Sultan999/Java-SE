package bufferstreamdemo;
import java.io.*;
public class BufferStreamDemo {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Test2.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.mark(10);
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.reset();
		
		System.out.print(" ");
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		
		fis.close();
		bis.close();
		
		
		
//		int f;
//		while((f = bis.read()) != -1) {
//			System.out.print((char)f);
//		}
		
		
		
		

	}

}
