package propertydemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties p = new Properties();
		
		/*
		p.setProperty("Brand", "Mac");
		p.setProperty("Processor", "i7");
		p.setProperty("OS", "macOS Big Sur");
		p.setProperty("Model", "MacBookPro15,1");
		
		p.store(new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section25_CollectionFramework/CollectionFrameworkPractice/MyData.txt"), "Laptop");
		
		p.storeToXML(new FileOutputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section25_CollectionFramework/CollectionFrameworkPractice/MyData.xml"), "Laptop");
		*/
		
		//p.loadFromXML(new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section25_CollectionFramework/CollectionFrameworkPractice/MyData.xml"));
		
		p.load(new FileInputStream("/Users/sultanalzahrani/Desktop/Online_Courses/Java/Section25_CollectionFramework/CollectionFrameworkPractice/MyData.txt"));
		System.out.println(p);
		System.out.println(p.getProperty("Brand"));
	}

}
