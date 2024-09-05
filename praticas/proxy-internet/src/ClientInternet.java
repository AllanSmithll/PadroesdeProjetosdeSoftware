import model.ProxyInternet;

public class ClientInternet {
    public static void main(String[] args) {
        ProxyInternet proxyInternet = new ProxyInternet();
        try {
            proxyInternet.connectTo("www.ifpb.edu.br");
            proxyInternet.connectTo("www.youtube.com");
            proxyInternet.connectTo("www.netflix.com");
            proxyInternet.connectTo("www.google.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
