package proxy;

import proxy.impl.ProxySubject;
import proxy.impl.RealSubject;

/**
 * Created by http://teachcourse.cn on 2018-3-30.
 */
public class ProgramTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//被代理类
		RealSubject realSubject = new RealSubject();
		
		Class<?> clazz = realSubject.getClass();
		ClassLoader loader = clazz.getClassLoader();
		
		OwerInvocationHandler handler = new OwerInvocationHandler(realSubject);
		IProgrammer iProgrammer = new ProxySubject().getOwerProxy(loader,
				new Class[] { IProgrammer.class }, handler);
		
		iProgrammer.developeApp();
		iProgrammer.developeWebSite();
		iProgrammer.developeWebSite();
	}

}
