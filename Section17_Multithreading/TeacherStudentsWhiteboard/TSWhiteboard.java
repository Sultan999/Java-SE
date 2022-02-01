package tswhiteboard;

class Whiteboard{
	
	String text;
	int numberOfStudent = 0;
	int count = 0;
	
	public void atendence() {
		numberOfStudent++;
	}
	
	synchronized public void write(String t) {
		System.out.println("Teacher is writing " + t);
		
		while(count != 0) {
			try{wait();}catch(Exception e) {}
		}
		text = t;
		count = numberOfStudent;
		notifyAll();
	}
	
	
	
	synchronized public String read() {
		
		while(count == 0) {
			try{wait();}catch(Exception e) {}
		}
		
		String r;
		r = text;
		count--;
		if(count == 0)
			notify();
		return r;
		
	}
	
}

class Teachers extends Thread{
	
	Whiteboard w;
	String notes[] = {"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};
	
	public Teachers(Whiteboard wb) {
		this.w = wb;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < notes.length; i++) {
			w.write(notes[i]);
		}
	}
}

class Students extends Thread{
	
	Whiteboard wboard;
	String name;
	
	public Students(Whiteboard whb, String name) {
		this.wboard = whb;
		this.name = name;
	}
	
	public void run() {
		String text;
		wboard.atendence();
		
		do {
			
			text = wboard.read();
			System.out.println(name + " reading " + text);
			System.out.flush();
		}while(!text.equals("end"));
	}
}



public class TSWhiteboard {

	public static void main(String[] args) {
		
		Whiteboard wb = new Whiteboard();
		Teachers t = new Teachers(wb);
		Students s1 = new Students(wb, "1. Sultan");
		Students s2 = new Students(wb, "2. Hasen");
		Students s3 = new Students(wb, "3. Jatina");
		
		t.start();
		s1.start();
		s2.start();
		s3.start();

	}

}
