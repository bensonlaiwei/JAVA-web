package tw.com.web.code.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tw.com.web.code.dao.DAO;
import tw.com.web.code.dbutils.DbUtil;
import tw.com.web.code.model.Number;



public class NumberDaoImpl implements DAO<Number>{

	@Override
	public void add(Number number) {
		
		
		//新增Number
		Connection conn =  DbUtil.getDbUtil().getConn();
		PreparedStatement ps = null;
		String addSQL =
				"insert into webmvc.number(nName,nEmail,nPass,nSex)values(?,?,?,?);";
		try {
			ps = conn.prepareStatement(addSQL);
			ps.setString(1, number.getnName());
			ps.setString(2, number.getnEmail());
			ps.setString(3, number.getnPass());
			ps.setString(4, number.getnSex());
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
		
		
		
	}

	@Override
	public void update(Number number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Number> getAll() {
		
		Connection conn =  DbUtil.getDbUtil().getConn();
		PreparedStatement ps = null;
		ArrayList<Number> list = new ArrayList<>();
		ResultSet rs = null;
		String getallSQL =
				"SELECT * FROM webmvc.number order by nId desc";
		try {
			ps = conn.prepareCall(getallSQL);
			rs = ps.executeQuery();
			while(rs.next())
			{
				Number nm = new Number();
				nm.setnId(rs.getInt("nId"));
				nm.setnName(rs.getString("nName"));
				nm.setnEmail(rs.getString("nEmail"));
				nm.setnSex(rs.getString("nSex"));
				list.add(nm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public ResultSet loginNumber(String email,String pass) {
		Connection conn =  DbUtil.getDbUtil().getConn();
		PreparedStatement ps = null;
		ArrayList<Number> list = new ArrayList<>();
		ResultSet rs = null;
		String loginSQL =
				"SELECT * FROM webmvc.number where nEmail=? and nPass=?";
		try {
			ps = conn.prepareStatement(loginSQL);
			ps.setString(1,email);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
		
		
		
	}
	
	

}
