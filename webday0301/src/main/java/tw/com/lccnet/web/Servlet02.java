package tw.com.lccnet.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet02
 */
@WebServlet(
		name = "Servlet02",
		urlPatterns = { 
				"/s2", 
				"/s3"
		}, 
		initParams = { 
				@WebInitParam(name = "jdbc", value = "1234"), 
				@WebInitParam(name = "username", value = "tom")
		})
public class Servlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet02() {
        super();
    }

    //method="get" http://localhost:8080/webday0301/s2?un=123&pass=99 明碼
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("un");
		String val = request.getParameter("pass");
		System.out.println("GET--------------"+name+":"+val);
	}

	//method="post" http://localhost:8080/webday0301/s2 暗碼(有安全顧慮的請使用post)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("un");
		String val = request.getParameter("pass");
		System.out.println("POST--------------"+name+":"+val);
	}

}
