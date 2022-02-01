package monitordemo;

class MyData{
	
	synchronized public void display(String str) {
		
		//synchronized (this) {
			for(int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i));
			}
		//}
		System.out.println("");
	}
}

class MyThread1 extends Thread{
	
	MyData d;
	
	MyThread1(MyData dat){
		this.d = dat;
	}
	@Override
	public void run() {
		d.display("Hello World");
	}
}

class MyThread2 extends Thread{
	MyData data;
	
	public MyThread2(MyData data1) {
		this.data = data1;
	}
	@Override
	public void run() {
		data.display("Welcome");
	}
}

public class MonitorDemo {

	public static void main(String[] args) {
		
		MyData d = new MyData();
		
		MyThread1 m1 = new MyThread1(d);
		
		MyThread2 m2 = new MyThread2(d);
		
		m1.start();
		m2.start();

	}

}
