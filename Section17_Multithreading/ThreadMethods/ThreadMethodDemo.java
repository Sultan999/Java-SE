package threadmethoddemo;


//class MyRun implements Runnable{
//	public void run() {}
//	
//}




class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name);
		setPriority(MAX_PRIORITY);
		//setPriority(MIN_PRIORITY+2);
		
	}
	
	public void run() {
		int count = 1;
		while(count < 15) {
			System.out.println(count++);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				e.getStackTrace();
			}
		}
	}
}

public class ThreadMethodDemo {

	public static void main(String[] args) {
		
//		Thread t = new Thread(new MyRun(), "My Name");
//		System.out.println(t.getName());
//		System.out.println(t.getPriority());
		
		MyThread m = new MyThread("First thread");
		m.start();
		m.interrupt();
//		System.out.println("ID: " + m.getId());
//		System.out.println("Name: " + m.getName());
//		System.out.println("Priority: " + m.getPriority());
//		System.out.println("State: " + m.getState());
//		System.out.println("Alive: " + m.isAlive());

	}

}
