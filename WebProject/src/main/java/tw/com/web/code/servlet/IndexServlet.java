package tw.com.web.code.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.code.dao.DAO;
import tw.com.web.code.dao.impl.ProductDaoImpl;
import tw.com.web.code.model.ProductValue;


@WebServlet(name = "IndexServlet",urlPatterns = {"/","/indexServlet"})
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO<ProductValue> dao= new ProductDaoImpl();
		List<ProductValue> list = dao.getAll();
		request.setAttribute("productValue", list);
		System.out.println(list);

		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPOST");
	}

}
