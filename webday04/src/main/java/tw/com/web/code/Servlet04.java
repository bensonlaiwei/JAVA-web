package tw.com.web.code;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet04
 */
@WebServlet("/s4")
public class Servlet04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	//doget 一般接收  http://localhost:8080/webday04/s4?un=123456
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reqq = request.getParameter("un");
		System.out.println(reqq);
		System.out.println(request.getMethod());
		System.out.println("doGET------------------------");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//dopost 需要接收安全性的參數 http://localhost:8080/webday04/s4
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String reqq = request.getParameter("un");
		System.out.println(reqq);
		System.out.println(request.getMethod());
		System.out.println("doPOST------------------------");
	}

}
