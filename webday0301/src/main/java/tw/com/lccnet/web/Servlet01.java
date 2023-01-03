package tw.com.lccnet.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet01
 *  1. Servlet 3.1版本後使用servlet就不需要註冊web.xml，使用註解方式進行啟動@WebServlet("/s1")
 *  2. 繼承結構 servlet --> GenericServlet --> HttpServlet -->xxx
 *  3. 原本的五個方法，轉換成doGet跟doPost方法，如需要原本五個方法，就用複寫的方法
 *  name="Servlet01"  名稱
 *  urlPatterns ="/s1" 呼叫名稱
 *  loadOnStartup =1 啟動順序
 *  initParams= { 初始化參數
					@WebInitParam(name = "jdbc", value = "1234"), 
					@WebInitParam(name = "username", value = "tom")
					}
 */
@WebServlet(name="Servlet01",
			urlPatterns ="/s1",
			loadOnStartup =1,
			initParams= {
					@WebInitParam(name = "jdbc", value = "1234"), 
					@WebInitParam(name = "username", value = "tom")
					})
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig config = null;
	
    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
	}

	public Servlet01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jdb = config.getInitParameter("jdbc");
		String db = config.getInitParameter("username");
		System.out.println(jdb+"-------"+db);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

	}

}
