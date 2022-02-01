package bytearrayinputstreamdemo;
import java.io.*;
public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		
		byte b[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		
		int x;
		while((x = bis.read()) != -1) {
			
			System.out.println((char)x);
		}

	}

}
