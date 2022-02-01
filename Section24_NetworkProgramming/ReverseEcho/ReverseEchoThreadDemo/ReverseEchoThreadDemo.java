package reverseechothreaddemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ReverseEchoThreadDemo extends Thread {

	Socket skt;
	
	public ReverseEchoThreadDemo(Socket sk) {
		this.skt = sk;
	}
	
	public void run() {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
			PrintStream ps = new PrintStream(skt.getOutputStream());
			
			String msg;
			
			StringBuilder sb;
			
			
			do {
				
				
				msg = br.readLine();
				sb = new StringBuilder(msg);
				sb.reverse();
				msg = sb.toString();
				ps.println(msg);
				
			}while(!msg.equals("tixe") || !msg.equals("tixE"));
			
			skt.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args)  {
		
		ServerSocket ss;
		try {
			ss = new ServerSocket(2000);
			
			Socket skt1;
			
			int count = 1;
			
			ReverseEchoThreadDemo ret;
			
			do {
				
				skt1 = ss.accept();
				System.out.println("Number of Client connected to the server: " + count++);
				ret = new ReverseEchoThreadDemo(skt1);
				ret.start();
				
			}while(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}



class Client{
	
	public static void main(String[] agrs)  {
		
		Socket s;
		
		try {
			s = new Socket("Localhost", 2000);
			
			BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream ps = new PrintStream(s.getOutputStream());
			
			
			String m;
			System.out.println("Welcome to my Server");
			do {
				
				m = keyb.readLine();
				ps.println(m);
				m = br.readLine();
				System.out.println("From Server: " + m);
				
			}while(!(m.equals("tixe") || m.equals("tixE")));
			
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}

















