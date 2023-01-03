package tw.com.web.code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.code.bean.Student;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/listServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "TOM", "20", "123@mioerjywjet"));
		list.add(new Student(2, "TOM1", "20", "123@mioerjywjet"));
		list.add(new Student(3, "TOM2", "20", "123@mioerjywjet"));
		list.add(new Student(4, "TOM3", "20", "123@mioerjywjet"));
		list.add(new Student(5, "TOM4", "20", "123@mioerjywjet"));
		
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("demo07.jsp").forward(request, response);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
