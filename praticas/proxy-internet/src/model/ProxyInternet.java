package model;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet {
    private final RealInternet realInternet = new RealInternet();
    private static final List<String> blockedSites;

    static {
        blockedSites = new ArrayList<>();
        blockedSites.add("www.youtube.com");
        blockedSites.add("www.facebook.com");
        blockedSites.add("www.netflix.com");
        blockedSites.add("www.google.com");
    }

    public void connectTo(String serverhost) throws Exception {
        if (blockedSites.contains(serverhost.toLowerCase())) {
            System.out.println("Acesso negado ao site " + serverhost);
        } else {
            realInternet.connectTo(serverhost);
        }
    }
}

