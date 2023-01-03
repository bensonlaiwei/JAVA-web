package tw.com.web.code.servlet;

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
 * Servlet implementation class Servlet03
 */
@WebServlet("/s3")
public class Servlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"tim","123456@tyuu5","18"));
		list.add(new Student(2,"tim","123456@tyuu5","18"));
		list.add(new Student(3,"tim","123456@tyuu5","18"));
		list.add(new Student(4,"tim","123456@tyuu5","18"));
		request.setAttribute("list", list);
		request.getRequestDispatcher("demo05.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
