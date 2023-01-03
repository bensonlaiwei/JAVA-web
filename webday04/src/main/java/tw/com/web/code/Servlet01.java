package tw.com.web.code;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet01
 */
@WebServlet("/s1")
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURL());//http://localhost:8080/webday04/s1
		System.out.println(request.getRequestURI());///webday04/s1
		System.out.println("ContextPath"+request.getContextPath());//webday04，專案名稱
		System.out.println("Method"+request.getMethod());//GET
		System.out.println("QueryString"+request.getQueryString());//null
		System.out.println("Session"+request.getSession());//org.apache.catalina.session.StandardSessionFacade@290e5505
		System.out.println("cookie"+request.getCookies());//null
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
