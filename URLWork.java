package WebAccess;
import java.net.*;
import java.io.*;
import java.lang.*;

public class URLWork {

    public static URL GetURL() {
        URL TestURL = null;
        try {
            TestURL = new URL("http://stats.nba.com/player/201566/");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    return TestURL;
    }

    public URLWork(){

    }
}
