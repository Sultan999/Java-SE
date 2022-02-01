package tokenizerdemo;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenizerDemo {

	public static void main(String[] args) throws Exception {
		
		//FileInputStream readFromFile = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section25_CollectionFramework/CollectionFrameworkPractice/Student.txt");
		
		FileInputStream readFromFile = new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section25_CollectionFramework/CollectionFrameworkPractice/Data.txt");
		
		byte b[] = new byte[readFromFile.available()];
		
		readFromFile.read(b);
		
		String data = new String(b);
		
		//String data = "Name = Sultan;Address = Belconnen;Country = Australia";
		
		StringTokenizer stk = new StringTokenizer(data, ", ");
		
		
		String s;
		
		ArrayList<Integer> al = new ArrayList<>();
		
		
		
		while(stk.hasMoreTokens()) {
			s = stk.nextToken();
			//System.out.println(s);
			al.add(Integer.valueOf(s));
		}
		
		System.out.println(al);
		readFromFile.close();
	}

}
