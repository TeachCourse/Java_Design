package proxy.extra;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理类简单封装
 */
public abstract class InvokeProxy implements InvocationHandler {
    protected Object target;

    public Object newProxyInstance(Object subject){
        this.target=subject;
        return Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),this);
    }
}
