package bufferedreaderdemo;
import java.io.*;
public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {
		
		
		FileReader fr = new FileReader("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Test2.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		br.mark(1);
		
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		br.mark(5);
		System.out.print((char)br.read());
		br.reset();
		
		System.out.print(" ");
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		
		System.out.println("String " + br.readLine());
		
//		int f;
//		while((f = br.read()) != -1) {
//			System.out.print((char)f);
//		}
		
		fr.close();
		br.close();
	}

}
