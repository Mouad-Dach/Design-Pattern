package net.dach.ProxyPattern.proxy;

import net.dach.ProxyPattern.services.IService;

public class SecuredProxy implements IService {
    private IService target;
    private String password;
    @Override
    public double compute(int t) {
        if(password == "1234"){
        return target.compute(t);
        }else {
            throw new RuntimeException("Wrong password");
        }
    }
    public void setService(String password) {
        this.password=password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setTarget(IService target) {
        this.target = target;
    }
}
