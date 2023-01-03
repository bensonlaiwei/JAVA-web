package tw.com.lccnet.web;


import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet01 implements Servlet{

	/*
	 * Servlet初始化方法，網頁啟動時都會運行一次，單例設計模式
	 */

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("servlet init-----------初始化方法-----------------");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/*
	 * servlet 服務， 每次重整整個頁面都會運行一次
	 */

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("servlet server------------服務方法----------------");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*
	 * Servlet 服務，每次重整頁面都會被運行一次
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("servlet destroy-------銷毀方法---------------------");
	}



}
