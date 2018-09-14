package com.Nine.Sky_lnn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.Nine.Sky_lnn.bean.Dlxxb;
import com.Nine.Sky_lnn.bean.Glyxxb;
import com.Nine.Sky_lnn.common.DatabaseCrud;
import com.Nine.Sky_lnn.common.Pager;
import com.Nine.Sky_lnn.common.PagerCommon;
import com.Nine.Sky_lnn.dao.base.BaseDaoAdapter;
import com.Nine.Sky_lnn.dao.base.IBaseDao;
import com.Nine.Sky_lnn.util.StrUtil;

public class GlyxxbDao extends BaseDaoAdapter<Glyxxb> implements IBaseDao<Glyxxb> {

	@Override
	public boolean add(Glyxxb obj) {
		String sql = "insert into glyxxb(grbh,zh,yhm,lxfs) values(?,?,?,?)";
		Object[] valus = new Object[] {obj.getGrbh(),obj.getZh(),obj.getYhm(),obj.getLxfs()};
		return (boolean)DatabaseCrud.doCrud(sql,valus);
	}

	@Override
	public boolean deleteById(String id) {
		String sql = "delete from glyxxb where grbh = ? ";
		return (boolean)DatabaseCrud.doCrud(sql,id);
	}


	@Override
	public boolean update(Glyxxb obj) {
		String sql = "update glyxxb set lxfs = ? where yhm = ? ";
		return (boolean)DatabaseCrud.doCrud(sql,obj.getLxfs(),obj.getYhm());
	}
	
	public boolean updatejbxx(Glyxxb obj) {
		String sql = "update glyxxb set lxfs = ? ,yhm=? where zh = ? ";
		return (boolean)DatabaseCrud.doCrud(sql,obj.getLxfs(),obj.getYhm(),obj.getZh());
	}

	@Override
	public Glyxxb selectById(String id) {
		Glyxxb user = null;
		try {
			String sql = "select grbh,zh,yhm,lxfs from glyxxb where grbh = ?";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql, id);
			if(null != rs && rs.next()) {
				String grbh = rs.getString("grbh");
				String zh = rs.getString("zh");
				String yhm = rs.getString("yhm");
				String lxfs = rs.getString("lxfs");
				user=new Glyxxb(grbh, zh, yhm,lxfs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public Glyxxb select(Glyxxb obj) {
		Glyxxb user = null;
		try {
			String sql = "select grbh,zh,yhm,lxfs from glyxxb where zh = ?";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql, obj.getZh());
			if(null != rs && rs.next()) {
				String grbh = rs.getString("grbh");
				String zh = rs.getString("zh");
				String yhm = rs.getString("yhm");
				String lxfs = rs.getString("lxfs");
				user=new Glyxxb(grbh, zh, yhm,lxfs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public ArrayList<Glyxxb> listAll() {
		return listByObj(null);
	}

	@Override
	public ArrayList<Glyxxb> listByObj(Glyxxb obj) {
		ArrayList<Glyxxb> list = new ArrayList<Glyxxb>();
		try {
			ArrayList<String> params = new ArrayList<String>();
			StringBuffer sql = new StringBuffer("select grbh,zh,yhm,lxfs from Glyxxb where 1=1");
			if(null != obj) {
				if(StrUtil.isNotEmpty(obj.getZh())) {
					sql.append(" and zh like ? ");
					params.add(obj.getZh());
				}
				if(StrUtil.isNotEmpty(obj.getYhm())) {
					sql.append(" and yhm like ? ");
					params.add(obj.getYhm());
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
					String lxfs = rs.getString("lxfs");
					Glyxxb user = new Glyxxb(grbh, zh, yhm,lxfs);
					list.add(user);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<Glyxxb> listByMap(Map<String, Object> map) {
		ArrayList<Glyxxb> list = new ArrayList<Glyxxb>();
		try {
			Glyxxb obj = (Glyxxb)map.get("user");	//获取用户对象
			Pager pager = (Pager)map.get("pager");	//获取分页对象
			ArrayList<String> params = null;
			Object[] ps = null;
			StringBuffer sql = new StringBuffer("select grbh,zh,yhm,lxfs from Glyxxb where 1=1");
			
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
					String lxfs = rs.getString("lxfs");
					Glyxxb user = new Glyxxb(grbh, zh, yhm,lxfs);
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
			String sql = "select 1 from glyxxb where grbh = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,id);
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public boolean isExistZh(String id) {
		boolean ret = false;
		try {
			String sql = "select 1 from glyxxb where zh = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,id);
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

	@Override
	public boolean isExist(Glyxxb obj) {
		boolean ret = false;
		try {
			String sql = "select 1 from glyxxb where zh = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,obj.getZh());
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

	/*
	 * 	public static void main(String[] args) {
		Glyxxb obj =new Glyxxb("1111", "1111", null, null);
		String id=obj.getGrbh();
		GlyxxbDao cs=new GlyxxbDao();
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