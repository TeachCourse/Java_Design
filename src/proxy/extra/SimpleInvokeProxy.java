package proxy.extra;

import java.lang.reflect.Method;

public class SimpleInvokeProxy extends InvokeProxy{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }
}
