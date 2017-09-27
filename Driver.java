import java.io.*;
import java.net.*;
import java.lang.*;
import WebAccess.*;
public class Driver{

	public static void main(String[] args) throws IOException {
		URL RetURL = null;
		String inputLine;
		URLWork Test = new URLWork();
		RetURL = URLWork.GetURL();

		System.out.println("protocol = " + RetURL.getProtocol());
		System.out.println("authority = " + RetURL.getAuthority());
		System.out.println("host = " + RetURL.getHost());
		System.out.println("port = " + RetURL.getPort());
		System.out.println("path = " + RetURL.getPath());
		System.out.println("query = " + RetURL.getQuery());
		System.out.println("filename = " + RetURL.getFile());
		System.out.println("ref = " + RetURL.getRef());

		BufferedReader in = new BufferedReader(new InputStreamReader(RetURL.openStream()));

		String inputline;

		while ((inputline = in.readLine()) != null)
			System.out.println(inputline);
		in.close();
	}
}


		

