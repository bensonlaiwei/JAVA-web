package tw.com.web.code.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import tw.com.web.code.dao.DAO;
import tw.com.web.code.dao.impl.NumberDaoImpl;
import tw.com.web.code.model.Number;
import tw.com.web.code.model.ProductValue;
/**
 * Servlet implementation class NumberServlet
 */
@WebServlet("/numberServlet")
public class NumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//add
		String status = request.getParameter("status");
		DAO<Number> dao= new NumberDaoImpl();
		
		if(status.equals("add")) {
			Number nm = new Number();
			nm.setnName(request.getParameter("nName"));
			nm.setnPass(request.getParameter("nPass"));
			nm.setnEmail(request.getParameter("nEmail"));
			nm.setnSex(request.getParameter("nSex"));
			dao.add(nm);
			
			request.getRequestDispatcher("addnumber.jsp").forward(request, response);
		}
		//刪除
		else if(status.equals("delete")) {
			
			
		}
		//更新
		else if(status.equals("update")) {
				
			}
		//查詢
		else if(status.equals("search")) {
			List<Number> list = dao.getAll();
			request.setAttribute("number", list);
			System.out.println(list);
			
			request.getRequestDispatcher("getnumber.jsp").forward(request, response);
			
			
		}
		else if(status.equals("login")) {
			
			NumberDaoImpl opl = new NumberDaoImpl();
			ResultSet rs = opl.loginNumber(request.getParameter("nEmail"),  request.getParameter("nPass"));
			HttpSession session = request.getSession();
			try {
				if(rs.next()) {
						session.setAttribute("name", rs.getString("nEmail"));
						request.getRequestDispatcher("index.jsp").forward(request, response);
					} 
				else {
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("login");
			
		}
			
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
