import service.InternetProxy;
import service.InternetService;

public class ClientInternet {
    public static void main (String[] args)
    {
    InternetService internet = new InternetProxy();
    try
    {
        internet.connectTo("www.ifpb.edu.br");
        internet.connectTo("www.youtube.com");
    }
    catch (Exception e)
    {
    System.out.println(e.getMessage());
    }
    }
   } 