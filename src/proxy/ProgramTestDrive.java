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
		IProgrammer realSubject = new RealSubject();
		
		//获取被代理类的ClassLoader
		Class<?> clazz=realSubject.getClass();
		ClassLoader loader = clazz.getClassLoader();
		
		//重写InvocationHandler的invoke(Object,Method,Object[])方法
		OwnerInvocationHandler handler = new OwnerInvocationHandler(realSubject);
		IProgrammer iProgrammer = new ProxySubject().getOwerProxy(loader,
				new Class[] { IProgrammer.class }, handler);
		
		iProgrammer.developeApp();
		iProgrammer.developeWebSite();
		iProgrammer.developeWebSite();
	}

}
