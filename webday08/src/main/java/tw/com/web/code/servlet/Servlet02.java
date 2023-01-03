package tw.com.web.code.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.code.bean.Student;

/**
 * Servlet implementation class Servlet02
 */
@WebServlet("/s2")
public class Servlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student st = new Student();
		st.setSid(1);
		st.setsName("tinn");
		st.setsEmail("12345679@jigetoet");
		st.setsAge("15");
		request.setAttribute("student", st);
		request.getRequestDispatcher("demo04.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
