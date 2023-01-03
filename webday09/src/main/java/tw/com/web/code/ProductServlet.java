package tw.com.web.code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.code.bean.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/productServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> list = new ArrayList<>();
		list.add(new Product("MAC","yoyoyoyoy","https://www.shutterstock.com/zh-Hant/blog/wp-content/uploads/sites/11/2021/07/0726cover.png","958"));
		list.add(new Product("MAC1","ooooooooooooooooooooooooo","https://www.shutterstock.com/zh-Hant/blog/wp-content/uploads/sites/11/2021/07/0726cover.png","958"));
		list.add(new Product("MAC5","iiiiiiiiiiiiii","https://www.shutterstock.com/zh-Hant/blog/wp-content/uploads/sites/11/2021/07/0726cover.png","958"));
		list.add(new Product("MAC6","ppppppppppppppppppppppp","https://www.shutterstock.com/zh-Hant/blog/wp-content/uploads/sites/11/2021/07/0726cover.png","958"));
		request.setAttribute("product", list);
		request.getRequestDispatcher("product.jsp").forward(request, response);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
