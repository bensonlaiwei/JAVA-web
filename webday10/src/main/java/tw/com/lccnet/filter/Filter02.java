package tw.com.lccnet.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;




/*
 * 攔截副檔名為 : *.jsp
 * 攔截jsp : "/index.jsp"
 * 攔截檔案 : "/demo/*"
 * 攔截Servlet : "/s1"
 * 
 */



/**
 * Servlet Filter implementation class Filter02
 */
@WebFilter(
		filterName = "/Filter02" ,
		urlPatterns = {"/index.jsp", "/a1.jsp"}
		// urlPatterns = "*.jsp"
		) //攔截多個位置

public class Filter02 extends HttpFilter implements Filter {
       


	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
