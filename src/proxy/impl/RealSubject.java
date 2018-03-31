package proxy.impl;

import proxy.IProgrammer;

/**
 * Created by http://teachcourse.cn on 2018-3-30.
 */
public class RealSubject implements IProgrammer {

	@Override
	public void developeApp() {
		System.out.println("客户需要开发一个包含Android客户端、iPhone客户端的APP");

	}

	@Override
	public void developeWebSite() {
		System.out.println("客户需要开发一个PC端网站");

	}

	@Override
	public void developeServer() {
		System.out.println("客户需要开发一个服务于APP和PC网站的后台");

	}

}
