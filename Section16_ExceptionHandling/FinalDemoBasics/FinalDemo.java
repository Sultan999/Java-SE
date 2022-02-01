package finaldemo;


//class FinalException extends Exception{
//	
//	public String toString() {
//		return "Allow final message to print";
//	}
//}

public class FinalDemo {
	
	static void math1() throws Exception {
		
		try {
			
			throw new Exception();
			
		}finally {
			//this message will definitely execute 
			System.out.println("Final Message");
		}
	}

	public static void main(String[] args) throws Exception{
		
		math1();

	}

}
