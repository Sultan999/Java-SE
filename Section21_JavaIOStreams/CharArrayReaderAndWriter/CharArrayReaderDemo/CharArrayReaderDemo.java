package chararrayreaderdemo;
import java.io.*;
public class CharArrayReaderDemo {

	public static void main(String[] args) throws Exception {
		
char c[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		
		CharArrayReader car = new CharArrayReader(c);
		
		int i;
		while((i = car.read()) != -1) {
			
			System.out.println((char)i);
		}

	}

}
