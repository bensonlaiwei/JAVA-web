package tw.com.web.code.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.code.dao.DAO;
import tw.com.web.code.dao.impl.NumberDaoImpl;
import tw.com.web.code.dao.impl.ProductDaoImpl;
import tw.com.web.code.model.Number;
import tw.com.web.code.model.ProductValue;

/**
 * Servlet implementation class ProductServlet
 * 此頁面跟NumberServlet一樣
 */
@WebServlet("/productServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//add
		String status = request.getParameter("status");
		DAO<ProductValue> dao= new ProductDaoImpl();
		
		if(status.equals("add")) {
			ProductValue pv = new ProductValue();
			pv.setpName(request.getParameter("pName"));
			pv.setpDoc(request.getParameter("pDoc"));
			pv.setpImage(request.getParameter("pImage"));
			pv.setpPay(request.getParameter("pPay"));
			dao.add(pv);
		}
		//刪除
		else if(status.equals("delete")) {
			
			
		}
		//更新
		else if(status.equals("update")) {
				
			}
		//查詢
		else if(status.equals("search")) {
			List<ProductValue> list = dao.getAll();
			request.setAttribute("productValue", list);
			System.out.println(list);
			
			request.getRequestDispatcher("getproduct.jsp").forward(request, response);
			
			
			
			
		}
		else if(status.equals("login")) {
			System.out.println("login");
		}
			
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
