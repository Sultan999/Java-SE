package threadtest;

//class MyThread extends Thread{
//	@Override
//	public void run() {
//		
//		for(int i = 0; i < 100; i++) {
//			System.out.println("Sultan");
//			
//		}
//	}
//}

public class ThreadTest extends Thread {
	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			System.out.println("Sultan");
			
		}
	}

	public static void main(String[] args) {
		

		ThreadTest m = new ThreadTest();
		m.start();
		
		for(int j = 0; j < 100; j++) {
			
			System.out.println("Hasen");
		}

	}

}
