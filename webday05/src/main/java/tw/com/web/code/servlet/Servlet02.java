package tw.com.web.code.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 重定向
 * 
 * status
 * 200-299 正常
 * 300-399 轉頁302
 * 400-499 頁面錯誤 404
 * 500-599 Servlet 錯誤500
 * 
 */
@WebServlet("/s2")
public class Servlet02 extends HttpServlet {
	private static final long serialVrsionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("s2");
		//狀態碼
		response.setStatus(302);

		response.setHeader("location","/webday05/s1");
		
		response.sendRedirect("/webday05/s1");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
