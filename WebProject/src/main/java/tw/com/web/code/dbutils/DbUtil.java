package tw.com.web.code.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/*
 * 此類為 資料庫連接類
 * 
 * 
 */

public class DbUtil {
	//常數
	private final String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
	private final String JDBC_URL="jdbc:mysql://127.0.0.1:3306/webmvc";
	private final String JDBC_USER="root";
	private final String JDBC_PASS="$RFV5tgb^YHN";
	
	//請導入 package
	private Connection conn =null;
	
	//私有建構子，使用單利設計模式
	private DbUtil() { //無法建立實體
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//自行建立實體
	public Connection getConn() {
		
		try {
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	//建立靜態方法，方便進行呼叫使用 類別、方法、方式呼叫
	public static DbUtil getDbUtil() {
		return new DbUtil();
	}
	
	//關閉資料庫連接
	public void close(Connection conn) {
		if(conn!=null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void close(PreparedStatement ps) {
		if(ps!=null)
		{
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void close(Statement st) {
		if(st!=null)
		{
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void close(ResultSet rs) {
		if(rs!=null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
