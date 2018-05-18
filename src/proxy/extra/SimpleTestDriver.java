package proxy.extra;

import proxy.IProgrammer;
import proxy.impl.RealSubject;

public class SimpleTestDriver {

    public  static void main(String[] args){
        //使用封装的类获取代理对象，更加的方便
        IProgrammer programmer=(IProgrammer) new SimpleInvokeProxy().newProxyInstance(new RealSubject());

        programmer.developeApp();
        programmer.developeWebSite();
        programmer.developeWebSite();
    }
}
