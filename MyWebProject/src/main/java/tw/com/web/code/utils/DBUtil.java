package tw.com.web.code.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	//連結資料庫的DRIVER
	private final String JDBC_DRIVER ="";
	//連結資料庫的網址
	private final String JDBC_URL ="";
	//連結資料庫的帳號
	private final String JDBC_USERNAME ="root";
	//連結資料庫的密碼
	private final String JDBC_PASSWORD ="$RFV5tgb";
	
	public Connection conn;
	
	
	
	//私有化建構子
	private DBUtil(){
		
	}
	
	public static DBUtil getDBUtils() {
		return new DBUtil();
	}
	
	public Connection getConn() {
		return conn;
	}
	
	
	public void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void close(PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void close(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
