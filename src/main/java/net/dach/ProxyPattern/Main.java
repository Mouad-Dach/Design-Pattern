package net.dach.ProxyPattern;

import net.dach.ProxyPattern.controllers.Client;
import net.dach.ProxyPattern.proxy.ProxyCache;
import net.dach.ProxyPattern.proxy.SecuredProxy;
import net.dach.ProxyPattern.services.IService;
import net.dach.ProxyPattern.services.ServiceImpl;

public class Main {
    public static void main(String[] args) {
    //IService service = new ServiceImpl();
        IService cache = new ProxyCache();
       //IService proxy = new ProxyCache();
        IService service = new ServiceImpl();
        var securedProxy = new SecuredProxy();
        securedProxy.setTarget(cache);
        securedProxy.setPassword("1234");
        Client client = new Client();
    client.setService(securedProxy);
    System.out.println("RES="+client.perform(23));
    System.out.println("RES="+client.perform(23));
    System.out.println("RES="+client.perform(23));
}
}

