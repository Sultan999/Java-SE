package interfaceexample;

class Phone{
	
	public void call() {
		System.out.println("Phone call");
	}
	public void sms() {
		System.out.println("Phone sending SMS");
	}
}

interface ICamera{
	void click();
	void record();
}

interface IMusicPlayer{
	void play();
	void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer{
	
	public void videoCall() {
		System.out.println("Smart phone video calling");
	}
	@Override
	public void click() {
		System.out.println("Smart phone clicking photo");
	}
	@Override
	public void record() {
		System.out.println("Smart phone recording video");
	}
	@Override
	public void play() {
		System.out.println("Smart phone playing music");
	}
	@Override
	public void stop() {
		System.out.println("Smart phone stopped playing music");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		

		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.sms();
		sp.click();
		sp.record();
		sp.play();
		sp.stop();
		
		System.out.println("");
		
		Phone p = new SmartPhone();
		p.call();
		p.sms();
		
		System.out.println("");
		
		ICamera c = new SmartPhone();
		c.click();
		c.record();
		
		System.out.println("");
		
		IMusicPlayer mp = new SmartPhone();
		mp.play();
		mp.stop();

	}

}
