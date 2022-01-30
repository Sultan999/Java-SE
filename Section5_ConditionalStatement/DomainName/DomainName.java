package domainname;
import java.util.*;

public class DomainName {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		String domain;

		System.out.println("Enter a domain name");

		domain = scan.nextLine();

		String ext = domain.substring(domain.lastIndexOf(".")+1);

		switch(ext) {

			case "com": System.out.println("Commercial website");
						break;

			case "org": System.out.println("Organisation website");
						break;

			case "net": System.out.println("Network website");
						break;

			default: System.out.println("Not valid extension");
					break;

		}


	}

}
