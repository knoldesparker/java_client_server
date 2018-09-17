import java.net.*;
import java.util.*;

public class IPFinder {
    public static void main(String[] args) {
        String host;
        Scanner input = new Scanner(System.in);
        InetAddress address;
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
