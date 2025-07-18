
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {
    public static void main(String[] args) throws UnknownHostException{
        String url = "ymg-oiltech-com.netlify.app";
        InetAddress inetaddress = Inet4Address.getByName(url);

        System.out.println("Address: " + Arrays.toString(inetaddress.getAddress()));
        System.out.println("Host Address: " + inetaddress.getHostAddress());

        // isAnyLocalAddress() Method
        System.out.println("isAnyLocalAddress: " + inetaddress.isAnyLocalAddress());

        // isLinkLocalAddress Method
        System.out.println("isLinkLocalAddress: " + inetaddress.isLinkLocalAddress());

        // isLoopbackAddress Method
        System.out.println("isLoopbaclAddress: " + inetaddress.isLoopbackAddress());

        //isSiteLocalAddress method
        System.out.println("isSiteLocalAddress: " + inetaddress.isSiteLocalAddress());

        //hashCode() method
        System.out.println("hashCode: " + inetaddress.hashCode());
    }
}
