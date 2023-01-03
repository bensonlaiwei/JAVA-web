package tw.com.web.code.servlet2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/ls")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String name = request.getParameter("un");
		String pass = request.getParameter("pn");
		
		if(name.equals("Tom") && pass.equals("1234"))
		{
			request.setAttribute("name", name);
			//內部轉發
			request.getRequestDispatcher("number.jsp").forward(request, response);
		}
		else {
			//重新定向
			request.setAttribute("msg", "errr log");
			response.sendRedirect("login.html");
		}
		
		System.out.println(name+":"+pass);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
