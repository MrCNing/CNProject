package com.Nine.Sky_lnn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.Nine.Sky_lnn.bean.Dlxxb;
import com.Nine.Sky_lnn.common.DatabaseCrud;
import com.Nine.Sky_lnn.common.Pager;
import com.Nine.Sky_lnn.common.PagerCommon;
import com.Nine.Sky_lnn.dao.base.BaseDaoAdapter;
import com.Nine.Sky_lnn.dao.base.IBaseDao;
import com.Nine.Sky_lnn.util.StrUtil;





public class DlxxbDao extends BaseDaoAdapter<Dlxxb> implements IBaseDao<Dlxxb> {

	@Override
	public boolean add(Dlxxb obj) {
		String sql = "insert into dlxxb(grbh,zh,pwd,sfbz,tx) values(?,?,?,?,?)";
		Object[] valus = new Object[] {obj.getGrbh(),obj.getZh(),obj.getPwd(),obj.getSfbz(),obj.getTx()};
		return (boolean)DatabaseCrud.doCrud(sql,valus);
	}

	@Override
	public boolean deleteById(String id) {
		String sql = "delete from dlxxb where grbh = ? ";
		return (boolean)DatabaseCrud.doCrud(sql,id);
	}



	@Override
	public boolean update(Dlxxb obj) {
		String sql = "update dlxxb set pwd =  ?,sfbz = ?,tx = ? where zh = ? ";
		return (boolean)DatabaseCrud.doCrud(sql, obj.getPwd(),obj.getSfbz(),obj.getTx(),obj.getZh());
	}
	
	public boolean updateMm(Dlxxb obj) {
		String sql = "update dlxxb set pwd =  ? where zh = ? ";
		return (boolean)DatabaseCrud.doCrud(sql, obj.getPwd(),obj.getZh());
	}

	
	public Dlxxb selectById(String id) {
		Dlxxb user = null;
		try {
			String sql = "select grbh,zh,pwd,sfbz,tx from dlxxb where grbh = ?";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql, id);
			if(null != rs && rs.next()) {
				String grbh = rs.getString("grbh");
				String zh = rs.getString("zh");
				String pwd = rs.getString("pwd");
				String sfbz = rs.getString("sfbz");
				String tx = rs.getString("tx");
				user=new Dlxxb(grbh, zh, pwd, sfbz, tx);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public Dlxxb selectByZh(String id) {
		Dlxxb user = null;
		try {
			String sql = "select grbh,zh,pwd,sfbz,tx from dlxxb where zh = ?";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql, id);
			if(null != rs && rs.next()) {
				String grbh = rs.getString("grbh");
				String zh = rs.getString("zh");
				String pwd = rs.getString("pwd");
				String sfbz = rs.getString("sfbz");
				String tx = rs.getString("tx");
				user=new Dlxxb(grbh, zh, pwd, sfbz, tx);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	

	@Override
	public Dlxxb select(Dlxxb obj) {
		Dlxxb user = null;
		try {
			String sql = "select grbh,zh,pwd,sfbz,tx from dlxxb where zh = ? and pwd = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql, obj.getZh(),obj.getPwd());
			if(null != rs && rs.next()) {
				String grbh = rs.getString("grbh");
				String zh = rs.getString("zh");
				String pwd = rs.getString("pwd");
				String sfbz = rs.getString("sfbz");
				String tx = rs.getString("tx");
				user = new Dlxxb(grbh, zh, pwd, sfbz, tx);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public Dlxxb selectbyobj(Dlxxb obj) {
		Dlxxb user = null;
		try {
			String sql = "select grbh,zh,pwd,sfbz,tx from dlxxb where zh = ?";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql, obj.getZh());
			if(null != rs && rs.next()) {
				String grbh = rs.getString("grbh");
				String zh = rs.getString("zh");
				String pwd = rs.getString("pwd");
				String sfbz = rs.getString("sfbz");
				String tx = rs.getString("tx");
				user = new Dlxxb(grbh, zh, pwd, sfbz, tx);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public ArrayList<Dlxxb> listAll() {
		return listByObj(null);
	}

	@Override
	public ArrayList<Dlxxb> listByObj(Dlxxb obj) {
		ArrayList<Dlxxb> list = new ArrayList<Dlxxb>();
		try {
			ArrayList<String> params = new ArrayList<String>();
			StringBuffer sql = new StringBuffer("select grbh,zh,pwd,sfbz,tx from dlxxb  where sfbz != 0 ");
			if(null != obj) {
				if(StrUtil.isNotEmpty(obj.getZh())) {
					sql.append(" and zh like ? ");
					params.add(obj.getZh());
				}
				if(StrUtil.isNotEmpty(obj.getSfbz())) {
					sql.append(" and sfbz = ? ");
					params.add(obj.getSfbz());
				}

			}
			
			Object[] ps = new String[params.size()];
			params.toArray(ps);
			
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql.toString(),ps);
			if(null != rs) {
				while(rs.next()) {
					String grbh = rs.getString("grbh");
					String zh = rs.getString("zh");
					String pwd = rs.getString("pwd");
					String sfbz = rs.getString("sfbz");
					String tx = rs.getString("tx");
					Dlxxb user = new Dlxxb(grbh, zh, pwd, sfbz, tx);
					list.add(user);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<Dlxxb> listByMap(Map<String, Object> map) {
		ArrayList<Dlxxb> list = new ArrayList<Dlxxb>();
		try {
			Dlxxb obj = (Dlxxb)map.get("user");	//获取用户对象
			Pager pager = (Pager)map.get("pager");	//获取分页对象
			ArrayList<String> params = null;
			Object[] ps = null;
			StringBuffer sql = new StringBuffer("select grbh,zh,pwd,sfbz,tx from dlxxb  where sfbz != 0 ");
			
			//查询参数拼接
			if(null != obj) {
				params = new ArrayList<String>();
				
				if(StrUtil.isNotEmpty(obj.getZh())) {
					sql.append(" and zh like ? ");
					params.add(obj.getZh());
				}
				if(StrUtil.isNotEmpty(obj.getSfbz())) {
					sql.append(" and sfbz = ? ");
					params.add(obj.getSfbz());
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
					String yhm = rs.getString("yhm");
					String pwd = rs.getString("pwd");
					String sfbz = rs.getString("sfbz");
					String zcsj = rs.getString("zcsj");
					Dlxxb user = new Dlxxb(grbh, yhm, pwd, sfbz, zcsj);
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
			String sql = "select 1 from dlxxb where grbh = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,id);
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

	@Override
	public boolean isExist(Dlxxb obj) {
		boolean ret = false;
		try {
			String sql = "select 1 from dlxxb where zh = ?  ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,obj.getZh());
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	
	public boolean isExistlogin(Dlxxb obj) {
		boolean ret = false;
		try {
			String sql = "select 1 from dlxxb where zh = ? and pwd = ?  ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,obj.getZh(),obj.getPwd());
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

	/**
	 * 更新用户头像
	 */
	public boolean updateYhtx(Dlxxb obj) {
		String sql = "update Dlxxb set tx = ? where zh = ? ";
		return (boolean)DatabaseCrud.doCrud(sql, obj.getTx(),obj.getZh());
	}
	
}