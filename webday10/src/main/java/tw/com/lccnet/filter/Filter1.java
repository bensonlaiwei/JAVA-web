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
 *  *號 代表所有
 * 
 * 
 */





/**
 * Servlet Filter implementation class Filter1
 */
//@WebFilter("/demo/*")//攔截型態或是檔案，名稱
public class Filter1 extends HttpFilter implements Filter {
       
 
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory--------銷毀");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("攔截-----------------");
//		chain.doFilter(request, response);//打開放行，停用攔截
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init---------初始化");
	}

}
