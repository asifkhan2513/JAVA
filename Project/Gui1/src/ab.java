import  java.net.*;
public class ab {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress localHost= InetAddress.getLocalHost();
        System.out.println(localHost.getHostAddress());
    }
}
