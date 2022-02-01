package runnableTest;

//class MyRunnable implements Runnable{
//	@Override
//	public void run() {
//		for(int i = 0; i < 100; i++) {
//			System.out.println("Hasen");
//		}
//	}
//}

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("Hasen");
		}
	}
	
	public static void main(String[] args) {
		
		RunnableTest m = new RunnableTest();
		Thread t = new Thread(m);
		t.start();
		for(int j = 0; j < 100; j++) {
			System.out.println("Sultan");
		}

	}

}
