import java.lang.*;
import java.util.*;

public class ReadKeyboard {

	public static void main(String arg[]){

	Scanner sc = new Scanner(System.in);

	int x;

	sc.useRadix(2);
	x = sc.nextInt();	

	System.out.println(x);
	
	}

}