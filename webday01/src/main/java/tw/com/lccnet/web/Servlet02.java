package tw.com.lccnet.web;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet02 implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//出得初始化值，需要至Web.xml進行設定
//		config.getInitParameter(getServletInfo());
		
		String name = config.getInitParameter("username");
		String user22 = config.getInitParameter("username222");
		
		System.out.println(name+":--:"+user22);
		
		//出得初始化值，需要至Web.xml進行設定
		config.getInitParameterNames();
		
//		config.getServletContext();
		System.out.println(config.getServletContext());
		
		System.out.println(config.getServletName());//專案名稱
		
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
