package reverseechodemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEchoDemo {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(2000);
		Socket stk = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps = new PrintStream(stk.getOutputStream());
		
		String msg;
		
		StringBuilder sb;
		
		do {
			
			msg = br.readLine();
			sb = new StringBuilder(msg);
			sb.reverse();
			msg = sb.toString();
			
			ps.println(msg);
		}while(!msg.equals("dne"));
		
		ss.close();
	}

}


class Client{
	
	public static void main(String[] agrs) throws Exception {
		
		
		//Socket stk = new Socket("Localhost", 2000);
		
		Socket stk1 = new Socket("192.168.1.68", 2000);
		
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(stk1.getInputStream()));
		PrintStream ps = new PrintStream(stk1.getOutputStream());
		
		String m;
		
		do {
			
			m = keyb.readLine();
			
			ps.println(m);
			
			m = br.readLine();
			System.out.println("From server: " + m);
		}while(!m.equals("dne"));
		
		stk1.close();
	}
	
}
