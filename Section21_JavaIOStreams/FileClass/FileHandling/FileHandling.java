package filehandling;
import java.io.*;
public class FileHandling {

	public static void main(String[] args) throws Exception {
		
		File f = new File("/Users/sultanalzahrani/Desktop/Online_Courses/Java");
		
		f.setWritable(true);
		
		FileOutputStream fos = new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Test1.txt");
		
		System.out.println(f.isDirectory());
		
		//String list[] = f.list();
		
		File list[] = f.listFiles();
		
//		for(String x: list) {
//			
//			System.out.println(x);
//		}
		
//		for(File x: list) {
//			System.out.println(x.getName());
//			System.out.println(x.getAbsolutePath());
//		}
		
		System.out.println(" ");
		
		for(int i = 0; i < list.length; i++) {
			
			System.out.print(list[i].getName() + " ");
			System.out.println(list[i].getPath());
			System.out.println(" ");
			
			fos.close();
		}

	}

}
