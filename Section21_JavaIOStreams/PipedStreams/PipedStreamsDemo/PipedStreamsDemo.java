package pipedstreamsdemo;
import java.io.*;

class Producer extends Thread{
	
	OutputStream os;
	
	public Producer(OutputStream o) {
		os = o;
	}
	
	int count = 0;
	public void run() {
		
		while(true) {
			
			try {
				os.write(count);
				os.flush();
				
				System.out.println("Producer: " + count);
				System.out.flush();
				
				Thread.sleep(10);
				count++;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Consumer extends Thread{
	
	InputStream is;
	
	public Consumer(InputStream i) {
		
		is = i;
	}
	
	int x;
	public void run() {
		
		while(true) {
		try {
			x = is.read();
			
			System.out.println("Consumer: " + x);
			System.out.flush();
			
			Thread.sleep(10);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
}

public class PipedStreamsDemo {

	public static void main(String[] args) throws Exception {
		

		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		
		pos.connect(pis);
		
		Producer p = new Producer(pos);
		Consumer c = new Consumer(pis);
	
		p.start();
		c.start();
		
		
		
		
		
		
		
		
		

	}

}
