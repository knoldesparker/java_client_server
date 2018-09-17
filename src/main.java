public class main {
    public static void main(String[] args) {
        IPFinder ipFinder = new IPFinder();
        LocalIPAdress localIPAdress = new LocalIPAdress();
        UDPEchoServer server = new UDPEchoServer();


        //ipFinder.getIP();
        //localIPAdress.getLocal();
        server.UDPserver();


    }
}
