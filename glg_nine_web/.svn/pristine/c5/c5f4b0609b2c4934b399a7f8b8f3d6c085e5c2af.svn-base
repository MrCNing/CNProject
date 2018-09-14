package com.Nine.Sky_lnn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.Nine.Sky_lnn.bean.Dlxxb;
import com.Nine.Sky_lnn.bean.Yhxxb;
import com.Nine.Sky_lnn.common.DatabaseCrud;
import com.Nine.Sky_lnn.common.Pager;
import com.Nine.Sky_lnn.common.PagerCommon;
import com.Nine.Sky_lnn.dao.base.BaseDaoAdapter;
import com.Nine.Sky_lnn.dao.base.IBaseDao;
import com.Nine.Sky_lnn.util.StrUtil;

public class YhxxbDao extends BaseDaoAdapter<Yhxxb> implements IBaseDao<Yhxxb> {

	@Override
	public boolean add(Yhxxb obj) {
		String sql = "insert into yhxxb(grbh,zh,yhm,xb,lxfs,zcsj) values(?,?,?,?,?,?)";
		Object[] valus = new Object[] {obj.getGrbh(),obj.getZh(),obj.getYhm(),obj.getXb(),obj.getLxfs(),obj.getZcsj()};
		return (boolean)DatabaseCrud.doCrud(sql,valus);
	}

	@Override
	public boolean deleteById(String id) {
		String sql = "delete from yhxxb where grbh = ? ";
		return (boolean)DatabaseCrud.doCrud(sql,id);
	}
	
	@Override
	public boolean delete(Yhxxb obj) {
		String sql = "delete from yhxxb where zh = ? ";
		return (boolean)DatabaseCrud.doCrud(sql,obj.getZh());
	}


	@Override
	public boolean update(Yhxxb obj) {
		String sql = "update yhxxb set xb = ?,lxfs = ? where yhm = ? ";
		return (boolean)DatabaseCrud.doCrud(sql,obj.getXb(),obj.getLxfs(),obj.getYhm());
	}
	


	@Override
	public Yhxxb selectById(String id) {
		Yhxxb user = null;
		try {
			String sql = "select grbh,zh,yhm,xb,lxfs,zcsj from yhxxb where grbh = ?";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql, id);
			if(null != rs && rs.next()) {
				String grbh = rs.getString("grbh");
				String zh = rs.getString("zh");
				String yhm = rs.getString("yhm");
				String xb = rs.getString("xb");
				String lxfs = rs.getString("lxfs");
				String zcsj = rs.getString("zcsj");
				user=new Yhxxb(grbh, zh, yhm, xb, lxfs,zcsj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	
	
	public Yhxxb selectByZh(String id) {
		Yhxxb user = null;
		try {
			String sql = "select grbh,zh,yhm,xb,lxfs,zcsj from yhxxb where zh = ?";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql, id);
			if(null != rs && rs.next()) {
				String grbh = rs.getString("grbh");
				String zh = rs.getString("zh");
				String yhm = rs.getString("yhm");
				String xb = rs.getString("xb");
				String lxfs = rs.getString("lxfs");
				String zcsj = rs.getString("zcsj");
				user=new Yhxxb(grbh, zh, yhm, xb, lxfs,zcsj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	

	@Override
	public Yhxxb select(Yhxxb obj) {
		Yhxxb user = null;
		try {
			String sql = "select grbh,zh,yhm,xb,lxfs,zcsj from yhxxb where zh = ? and yhm = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql, obj.getZh(),obj.getYhm());
			if(null != rs && rs.next()) {
				String grbh = rs.getString("grbh");
				String zh = rs.getString("zh");
				String yhm = rs.getString("yhm");
				String xb = rs.getString("xb");
				String lxfs = rs.getString("lxfs");
				String zcsj = rs.getString("zcsj");
				user=new Yhxxb(grbh, zh, yhm, xb, lxfs,zcsj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public ArrayList<Yhxxb> listAll() {
		return listByObj(null);
	}

	@Override
	public ArrayList<Yhxxb> listByObj(Yhxxb obj) {
		ArrayList<Yhxxb> list = new ArrayList<Yhxxb>();
		try {
			ArrayList<String> params = new ArrayList<String>();
			StringBuffer sql = new StringBuffer("select grbh,zh,yhm,xb,lxfs,zcsj from yhxxb where 1 = 1");
			if(null != obj) {
				if(StrUtil.isNotEmpty(obj.getZh())) {
					sql.append(" and zh like ? ");
					params.add(obj.getZh());
				}
				if(StrUtil.isNotEmpty(obj.getZcsj())) {
					sql.append(" and zcsj like ? ");
					params.add(obj.getZcsj());
				}

			}
			
			Object[] ps = new String[params.size()];
			params.toArray(ps);
			
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql.toString(),ps);
			if(null != rs) {
				while(rs.next()) {
					String grbh = rs.getString("grbh");
					String zh = rs.getString("zh");
					String yhm = rs.getString("yhm");
					String xb = rs.getString("xb");
					String lxfs = rs.getString("lxfs");
					String zcsj = rs.getString("zcsj");
					Yhxxb user = new Yhxxb(grbh, zh, yhm, xb, lxfs,zcsj);
					list.add(user);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<Yhxxb> listByMap(Map<String, Object> map) {
		ArrayList<Yhxxb> list = new ArrayList<Yhxxb>();
		try {
			Yhxxb obj = (Yhxxb)map.get("user");	//获取用户对象
			Pager pager = (Pager)map.get("pager");	//获取分页对象
			ArrayList<String> params = null;
			Object[] ps = null;
			StringBuffer sql = new StringBuffer("select grbh,zh,yhm,xb,lxfs,zcsj from yhxxb where 1=1");
			
			//查询参数拼接
			if(null != obj) {
				params = new ArrayList<String>();
				
				if(StrUtil.isNotEmpty(obj.getZh())) {
					sql.append(" and zh like ? ");
					params.add(obj.getZh());
				}
				
				if(StrUtil.isNotEmpty(obj.getYhm())) {
					sql.append(" and yhm like ? ");
					params.add(obj.getYhm());
				}
				
				if(StrUtil.isNotEmpty(obj.getZcsj())) {
					sql.append(" and zcsj like ? ");
					params.add(obj.getZcsj());
				}
				ps = new Object[params.size()];
				params.toArray(ps);
			}
			
			//分页sql拼接
			String pagerSql = sql.toString();
			if(null != pager) {
				//获取分页sql
				pagerSql = PagerCommon.getPagerSql(pagerSql, pager);
				//获取记录总行数
				int totalRows = DatabaseCrud.getTotalRows(sql.toString(),ps);
				pager.setTotalRows(totalRows);
			}
			
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(pagerSql,ps);
			if(null != rs) {
				while(rs.next()) {
					String grbh = rs.getString("grbh");
					String zh = rs.getString("zh");
					String yhm = rs.getString("yhm");
					String xb = rs.getString("xb");
					String lxfs = rs.getString("lxfs");
					String zcsj = rs.getString("zcsj");
					Yhxxb user = new Yhxxb(grbh, zh, yhm, xb, lxfs,zcsj);
					list.add(user);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean isExist(String id) {
		boolean ret = false;
		try {
			String sql = "select 1 from yhxxb where grbh = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,id);
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

	@Override
	public boolean isExist(Yhxxb obj) {
		boolean ret = false;
		try {
			String sql = "select 1 from yhxxb where zh = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,obj.getZh());
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public boolean isExistYhm(Yhxxb obj) {
		boolean ret = false;
		try {
			String sql = "select 1 from yhxxb where yhm = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,obj.getYhm());
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	
/*
 * 	public static void main(String[] args) {
		Yhxxb obj =new Yhxxb("1111", "null", "null", null, null, null);
		String id=obj.getGrbh();
		YhxxbDao cs=new YhxxbDao();
		cs.add(obj);
		cs.deleteById(id);
		cs.delete(obj);
		cs.update(obj);
		cs.selectById(id);
		cs.select(obj);
		cs.listAll();
		cs.listByObj(obj);
		
		cs.isExist(id);
		cs.isExist(obj);
	}
 */
 
}