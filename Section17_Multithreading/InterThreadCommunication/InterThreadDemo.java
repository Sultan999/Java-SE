package interthreaddemo;

class MyData{
	
	int value;
	boolean flag = true;
	
	synchronized public void setMyValue(int v) {
		
		while(flag != true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.value = v;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flag = false;
		notify();
	}
	
	synchronized public int getMyValue() {
		int x = 0;
		while(flag != false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		x = this.value;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flag = true;
		notify();
		return x;
	}
}

class Producer extends Thread{
	
	MyData data;
	
	public Producer(MyData d) {
		this.data = d;
	}
	
	int count = 1;
	public void run() {
		
		while(true) {
			data.setMyValue(count);
			System.out.println("Producer: " + count);
			count++;
			
		}
	}
}

class Consumer extends Thread{
	
	MyData d;
	
	public Consumer(MyData data) {
		this.d = data;
	}
	
	int value;
	public void run() {
		
		while(true) {
		value = d.getMyValue();
		System.out.println("Consumer: " + value);
		}
	}
}

public class InterThreadDemo {

	public static void main(String[] args) {
		
		MyData data = new MyData();
		Producer p = new Producer(data);
		Consumer c = new Consumer(data);
		p.start();
		c.start();

	}

}
