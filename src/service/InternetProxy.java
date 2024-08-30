package service;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements InternetService {
    private static List<String> bannedSites = new ArrayList<String>();

    private InternetService realInternetService = new RealInternet();


    static {
        bannedSites.add("www.ifpb.edu.br");
        bannedSites.add("www.instragram.com");
        bannedSites.add("www.suap.ifpb.edu.br");
    }
    @Override
    public void connectTo(String serverhost) throws Exception {
        if(bannedSites.contains(serverhost)){
            System.out.println(String.format( "Acesso negado ao host: %s", serverhost));
            //throw new Exception( String.format( "Acesso negado ao host: %s", serverhost));
        }
        else{
            this.realInternetService.connectTo(serverhost);
        }

    }

}