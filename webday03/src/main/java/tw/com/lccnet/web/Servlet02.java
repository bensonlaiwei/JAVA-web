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
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String protocol = req.getProtocol();
		System.out.println(protocol);//會印出 HTTP/1.1
		
		//一般網站使用port為80port，是網路預設port，
		int port = req.getServerPort();
		System.out.println(port);//會印出 8080
		
		//servlet傳值(key,value)
		req.setAttribute("msg", "haha");
		
		/* 
		 *	內部轉發 
		 * 	網址為s2，內容會變成s3的
		 */
		req.getRequestDispatcher("s3").forward(req, res);
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
