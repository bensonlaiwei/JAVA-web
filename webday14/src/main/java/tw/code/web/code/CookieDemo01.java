package tw.code.web.code;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * Cookie 使用端的技術
 * Session 服務器端的技術
 *
 *
 *
 */
@WebServlet("/cookieDemo01")
public class CookieDemo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie c = new Cookie("key", "這是中文");//會將此key value種至我們的瀏覽器 Cookie之中
		//現在cookie的存在時間，瀏覽器至瀏覽器關閉銷毀
		Cookie c1 = new Cookie("two", "12456");//會將此key value種至我們的瀏覽器 Cookie之中
		c.setMaxAge(60*60);//設定cookie在瀏覽器停留的時間，一個小時
		response.addCookie(c);
		response.addCookie(c1);
		c.setPath("webday14");
//		c.setPath("/");//虛擬目錄，但不太會使用
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
