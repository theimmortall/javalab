import java.net.*;

class urldetail {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("deprecation")
        URL obj = new URL("https://www.hackerrank.com/index.html");
        System.out.println("Protocol: " + obj.getProtocol());
        System.out.println("Host: " + obj.getHost());
        System.out.println("File: " + obj.getFile());
        System.out.println("Port: " + obj.getPort());
        System.out.println("Path: " + obj.getPath());
    }
}