package threadmethoddemo1;

class MyThread extends Thread{
	
	public void run() {
		
		int count = 1;
		while(count < 100) {
			System.out.println(count++ + " Thread class");
			
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}

public class ThreadMethodDemo1 {

	public static void main(String[] args) throws InterruptedException {
		

		MyThread m = new MyThread();
		//m.setDaemon(true);
		m.start();
		
//		Thread mainThread = Thread.currentThread();
//		mainThread.join();
		
		//Thread.sleep(200);
		
		int count = 1;
		while(count < 100) {
			System.out.println(count++ + " main class");
			
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			Thread.yield();
		}

	}

}
