import java.net.*;
import java.util.*;

public class IPFinder {

        private String host;
        Scanner input = new Scanner(System.in);
        InetAddress address;

        public void getIP(){
        System.out.println("\n\nEnter host name: ");
        host = input.next();
        try {
            address = InetAddress.getByName(host);
            System.out.println("IP adress: " + address.toString());
        }
        catch (UnknownHostException uhEx){
            System.out.println("could not find " + host);
        }
        }

}
