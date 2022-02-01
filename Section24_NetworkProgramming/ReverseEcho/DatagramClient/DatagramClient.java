package datagramclient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class DatagramClient {

	public static void main(String[] args) throws Exception {
		
		try {
			
			DatagramSocket ds = new DatagramSocket(2001);
			
			String msg = "Welcome to Canberra";
			
			// Send 
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("Localhost"),2000);
			ds.send(dp);
			
			// Receive
			byte b[] = new byte[1000];
			dp = new DatagramPacket(b, 1000);
			ds.receive(dp);
			
			msg = new String(dp.getData()).trim();
			System.out.println("From Server: " + msg);
			
			ds.close();
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

}

class Server{
	
	public static void main(String[] agrs) {
		
		try {
			DatagramSocket ds1 = new DatagramSocket(2000);
			
			// Receiving 
			byte b1[] = new byte[1000];
			DatagramPacket dp = new DatagramPacket(b1, 1000);
			ds1.receive(dp);
			
			String m = new String(dp.getData()).trim();
			System.out.println("From Client: " + m);
			StringBuilder sb = new StringBuilder(m);
			
			sb.reverse();
			m = sb.toString();
			
			dp = new DatagramPacket(m.getBytes(), m.length(), InetAddress.getByName("Localhost"),2001);
			
			ds1.send(dp);
			
			ds1.close();
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

