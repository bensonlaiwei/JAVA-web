package tw.com.web.code.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;

import tw.com.web.code.dao.DAO;
import tw.com.web.code.dbutils.DbUtil;
import tw.com.web.code.model.Number;
import tw.com.web.code.model.ProductValue;

public class ProductDaoImpl  implements DAO<ProductValue>{

	/*
	 * 	private Integer pId;
	private Integer pName;
	private Integer pDoc;
	private Integer pImage;
	private Integer pPay;
	 * 
	 */

	@Override
	public void add(ProductValue product) {
		
		//新增Number
		Connection conn =  DbUtil.getDbUtil().getConn();
		PreparedStatement ps = null;
		String addSQL =
				"insert into webmvc.productvalue(pName,pDoc,pImage,pPay)values(?,?,?,?);";
		try {
			ps = conn.prepareStatement(addSQL);
			ps.setString(1, product.getpName());
			ps.setString(2, product.getpDoc());
			ps.setString(3, product.getpImage());
			ps.setString(4, product.getpPay());
			ps.execute();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DbUtil.getDbUtil().close(ps);
			DbUtil.getDbUtil().close(conn);
		}
		
	}

	@Override
	public void delete(Integer id) {
		Connection conn =  DbUtil.getDbUtil().getConn();
		PreparedStatement ps = null;
		String deleteSQL = "Delete from webmvc.productvalue where id=?";
		try {
			ps = conn.prepareStatement(deleteSQL);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DbUtil.getDbUtil().close(ps);
			DbUtil.getDbUtil().close(conn);
		}
		
		
	}

	@Override
	public void update(ProductValue product) {
		Connection conn =  DbUtil.getDbUtil().getConn();
		PreparedStatement ps = null;
		String updateSQL = "update from webmvc.productvalue set pName=? ,pDoc=? , pImage=?, pPay=? where id=?";
		try {
			ps = conn.prepareStatement(updateSQL);
			ps.setString(1,product.getpName());
			ps.setString(2,product.getpDoc());
			ps.setString(3,product.getpImage());
			ps.setString(4,product.getpPay());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DbUtil.getDbUtil().close(ps);
			DbUtil.getDbUtil().close(conn);
		}
		
	}

	@Override
	public List<ProductValue> getAll() {
		Connection conn =  DbUtil.getDbUtil().getConn();
		PreparedStatement ps = null;
		ArrayList<ProductValue> list = new ArrayList<>();
		ResultSet rs = null;
		String getallSQL =
				"SELECT * FROM webmvc.productvalue order by pId desc";
		try {
			ps = conn.prepareCall(getallSQL);
			rs = ps.executeQuery();
			while(rs.next())
			{
				ProductValue pv = new ProductValue();
				pv.setpName(rs.getString("pName"));
				pv.setpDoc(rs.getString("pDoc"));
				pv.setpImage(rs.getString("pImage"));
				pv.setpPay(rs.getString("pPay"));
				list.add(pv);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
}
