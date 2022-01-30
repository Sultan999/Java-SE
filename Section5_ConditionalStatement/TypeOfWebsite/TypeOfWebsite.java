package typeofwebsite;
import java.util.*;

public class TypeOfWebsite {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a URL");
		String url;
		url = scan.nextLine();

		String protocol = url.substring(0, url.indexOf(":"));
		if(protocol.equals("http")) {
			System.out.println("Hypertext Transfer Protocol");
		}
		else if(protocol.equals("ftp")) {
			System.out.println("File Transfer Protocol");
		}
		else {
			System.out.println("Not a protocol");
		}

		String ext = url.substring(url.lastIndexOf(".")+1);
		if(ext.equals("com")) {
			System.out.println("Commercial website");
		}
		else if(ext.equals("net")) {
			System.out.println("Network website");
		}
		else {
			System.out.println("Not an extension website");
		}


	}

}
