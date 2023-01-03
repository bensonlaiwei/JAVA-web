package tw.com.web.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet01 implements Servlet{
	ServletConfig config =null;//使用屬性方式
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config ;
		config.getInitParameter(getServletInfo());
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * config.getInitParameter("jdvc")
		 * 取得Servlet 內初始化參數
		 * 
		 */
		
		String jdvc = config.getInitParameter("jdvc");
		System.out.println(jdvc);
		
		//常用顯示專案，用於頁面連結
		String path=config.getServletContext().getContextPath();
		System.out.println(path);
		
		//各式檔案於網頁上進行顯示
		String mime = config.getServletContext().getMimeType("application/x-ms-application");
		System.out.println(mime);
		
		/*
		 * config.getServletContext().getInitParameter("")
		 * 取得專案的全域變數
		 */
		
		String allvar = config.getServletContext().getInitParameter("allVar");
		System.out.println(allvar);
		
		
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
