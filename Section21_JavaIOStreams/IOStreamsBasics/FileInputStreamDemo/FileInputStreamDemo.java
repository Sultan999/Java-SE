package fileinputstreamdemo;
import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) {

	
		try {
			FileReader fis = new FileReader("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Test.txt");
			
			
			// First method
			
			/**
			 * To get the length of the file
			 * @value 
			 */
			//byte b[] = new byte[fis.available()];
			
			/**
			 * to read the file
			 */
			
			//fis.read(b);
			
			/**
			 * to convert it to string 
			 */
			//String str = new String(b);
			
			/**
			 * print the data of the file 
			 */
			//System.out.println(str);
			
			
			
			// Second Method
			
			int x;
			
//			do {
//				x = fis.read();
//				if(x != -1) {
//					System.out.print((char)x);
//				}
//			}while(x != -1);
			
			// Third method
			while((x = fis.read()) != -1) {
				
				System.out.print((char)x);
			}
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
		
//		
//		try {
//			FileInputStream fis = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section23_JavaIOStreams/Test.txt");
//			
//			
//			// First method
//			
//			/**
//			 * To get the length of the file
//			 * @value 
//			 */
//			//byte b[] = new byte[fis.available()];
//			
//			/**
//			 * to read the file
//			 */
//			
//			//fis.read(b);
//			
//			/**
//			 * to convert it to string 
//			 */
//			//String str = new String(b);
//			
//			/**
//			 * print the data of the file 
//			 */
//			//System.out.println(str);
//			
//			
//			
//			// Second Method
//			
//			int x;
//			
////			do {
////				x = fis.read();
////				if(x != -1) {
////					System.out.print((char)x);
////				}
////			}while(x != -1);
//			
//			// Third method
//			while((x = fis.read()) != -1) {
//				
//				System.out.print((char)x);
//			}
//			
//			fis.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		

	}

}
