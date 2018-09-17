import java.net.*;

public class LocalIPAdress {

    public void getLocal(){
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        }
        catch (UnknownHostException uhEx){
            System.out.println("Could not find local adress!");
        }
    }

}
