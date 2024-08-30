package service;

public class RealInternet implements InternetService{
    
    public void connectTo(String serverhost) throws Exception
    {
    System.out.println("Conectando a "+ serverhost + " ... OK");
    }
   }
   