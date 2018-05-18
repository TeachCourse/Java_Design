package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by http://teachcourse.cn on 2018-3-30.
 */
public class OwnerInvocationHandler implements InvocationHandler {
    private IProgrammer programmer;
    
    
	public OwnerInvocationHandler(IProgrammer programmer) {
		this.programmer = programmer;
	}


	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		//programmer是执行arg1方法的对象，返回该对象

		return arg1.invoke(programmer, arg2);
	}
}
