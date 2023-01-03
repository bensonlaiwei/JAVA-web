package tw.com.web.code.dao;

import java.util.List;


/*
 * 每個實體都會使用的資料庫四種功能
 * CRUD
 * 
 */

public interface DAO<T> {
	
	//新增
	public void add(T t);
	//刪除
	public void delete(Integer id);
	//更新
	public void update(T t);
	
	//搜尋
	public List<T> getAll();

}
