package com.Nine.Sky_lnn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.Nine.Sky_lnn.bean.Ddxxb;
import com.Nine.Sky_lnn.common.DatabaseCrud;
import com.Nine.Sky_lnn.common.Pager;
import com.Nine.Sky_lnn.common.PagerCommon;
import com.Nine.Sky_lnn.dao.base.IBaseDao;
import com.Nine.Sky_lnn.service.base.BaseServiceAdapter;
import com.Nine.Sky_lnn.util.StrUtil;

public class DdxxbDao extends BaseServiceAdapter<Ddxxb> implements IBaseDao<Ddxxb>{

	@Override
	public boolean add(Ddxxb obj) {
		String sql = "insert into ddxxb(ddbh,fjbh,grbh,ddzt,rzsj,tfsj,rzrs,xm,lxfs,xb,sfzh,clr) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] valus = new Object[] {obj.getDdbh(),obj.getFjbh(),obj.getGrbh(),obj.getDdzt(),obj.getRzsj(),obj.getTfsj(),obj.getRzrs(),obj.getXm(),obj.getLxfs(),obj.getXb(),obj.getSfzh(),obj.getClr()};
		return (boolean)DatabaseCrud.doCrud(sql,valus);
	}

	@Override
	public boolean deleteById(String id) {
		String sql = "delete from ddxxb where ddbh = ? ";
		return (boolean)DatabaseCrud.doCrud(sql,id);
	}

	@Override
	public boolean delete(Ddxxb obj) {
		String sql = "delete from ddxxb where xm = ? ";
		return (boolean)DatabaseCrud.doCrud(sql,obj.getXm());
	}

	@Override
	public boolean update(Ddxxb obj) {
		System.out.println(obj);
		String sql = "update ddxxb set ddzt = ?, rzsj = ?, tfsj = ?, rzrs =?, xm = ?, lxfs = ?, xb = ?, sfzh = ?, clr =? where ddbh = ? ";
		Object[] values = new Object[] {obj.getDdzt(),obj.getRzsj(),obj.getTfsj(),obj.getRzrs(),obj.getXm(),obj.getLxfs(),obj.getXb(),obj.getSfzh(),obj.getClr(),obj.getDdbh()};
		return (boolean)DatabaseCrud.doCrud(sql,values);
	}

	@Override
	public Ddxxb selectById(String id) {
		Ddxxb user = null;
		try {
			String sql = "select ddbh,fjbh,grbh,ddzt,rzsj,tfsj,rzrs,xm,lxfs,xb,sfzh,clr from ddxxb where ddbh = ?";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql, id);
			if(null != rs && rs.next()) {
				String ddbh = rs.getString("ddbh");
				String fjbh = rs.getString("fjbh");
				String grbh = rs.getString("grbh");
				String ddzt = rs.getString("ddzt");
				String rzsj = rs.getString("rzsj");
				String tfsj = rs.getString("tfsj");
				Integer rzrs = Integer.valueOf(rs.getString("rzrs"));
				String xm = rs.getString("xm");
				String lxfs = rs.getString("lxfs");
				String xb = rs.getString("xb");
				String sfzh = rs.getString("sfzh");
				String clr = rs.getString("clr");
				user=new Ddxxb(ddbh, fjbh, grbh, ddzt, rzsj, tfsj, rzrs, xm, lxfs, xb, sfzh, clr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	/**查询订单处理人*/
	public ArrayList<Ddxxb> selectByClr(Map<String, Object> map) {
		ArrayList<Ddxxb> list = new ArrayList<Ddxxb>();
		try {
			Ddxxb obj = (Ddxxb)map.get("user");	//获取用户对象
			Pager pager = (Pager)map.get("pager");	//获取分页对象
			ArrayList<String> params = null;
			Object[] ps = null;
			
			StringBuffer sql = new StringBuffer("select ddbh,fjbh,grbh,ddzt,rzsj,tfsj,rzrs,xm,lxfs,xb,sfzh,clr from ddxxb where clr = ? ");
			
			//查询参数拼接
			params = new ArrayList<String>();
			params.add(obj.getGrbh());
			if(null != obj) {
				if(StrUtil.isNotEmpty(obj.getDdzt())) {
					sql.append(" and ddzt like ? ");
					params.add(obj.getDdzt());
				}
				if(StrUtil.isNotEmpty(obj.getXm())) {
					sql.append(" and xm like ? ");
					params.add(obj.getXm());
				}
				if(StrUtil.isNotEmpty(obj.getLxfs())) {
					sql.append(" and lxfs like ? ");
					params.add(obj.getLxfs());
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
			while(null != rs && rs.next()) {
				String ddbh = rs.getString("ddbh");
				String fjbh = rs.getString("fjbh");
				String grbh = rs.getString("grbh");
				String ddzt = rs.getString("ddzt");
				String rzsj = rs.getString("rzsj");
				String tfsj = rs.getString("tfsj");
				Integer rzrs = Integer.valueOf(rs.getString("rzrs"));
				String xm = rs.getString("xm");
				String lxfs = rs.getString("lxfs");
				String xb = rs.getString("xb");
				String sfzh = rs.getString("sfzh");
				String clr = rs.getString("clr");
				Ddxxb user=new Ddxxb(ddbh, fjbh, grbh, ddzt, rzsj, tfsj, rzrs, xm, lxfs, xb, sfzh, clr);
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public Ddxxb select(Ddxxb obj) {
		Ddxxb user = null;
		try {
			String sql = "select ddbh,fjbh,grbh,ddzt,rzsj,tfsj,rzrs,xm,lxfs,xb,sfzh,clr from ddxxb where xm = ?";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql, obj.getXm());
			if(null != rs && rs.next()) {
				String ddbh = rs.getString("ddbh");
				String fjbh = rs.getString("fjbh");
				String grbh = rs.getString("grbh");
				String ddzt = rs.getString("ddzt");
				String rzsj = rs.getString("rzsj");
				String tfsj = rs.getString("tfsj");
				Integer rzrs = Integer.valueOf(rs.getString("rzrs"));
				String xm = rs.getString("xm");
				String lxfs = rs.getString("lxfs");
				String xb = rs.getString("xb");
				String sfzh = rs.getString("sfzh");
				String clr = rs.getString("clr");
				user=new Ddxxb(ddbh, fjbh, grbh, ddzt, rzsj, tfsj, rzrs, xm, lxfs, xb, sfzh, clr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public ArrayList<Ddxxb> listAll() {
		return listByObj(null);
	}

	@Override
	public ArrayList<Ddxxb> listByObj(Ddxxb obj) {
		ArrayList<Ddxxb> list = new ArrayList<Ddxxb>();
		try {
			ArrayList<String> params = new ArrayList<String>();
			StringBuffer sql = new StringBuffer("select ddbh,fjbh,grbh,ddzt,rzsj,tfsj,rzrs,xm,lxfs,xb,sfzh,clr from ddxxb where 1=1");
			if(null != obj) {
				
				if(StrUtil.isNotEmpty(obj.getDdzt())) {
					sql.append(" and ddzt like ? ");
					params.add(obj.getDdzt());
				}
				if(StrUtil.isNotEmpty(obj.getXm())) {
					sql.append(" and xm like ? ");
					params.add(obj.getXm());
				}
				if(StrUtil.isNotEmpty(obj.getLxfs())) {
					sql.append(" and lxfs like ? ");
					params.add(obj.getLxfs());
				}
			}
			
			Object[] ps = new String[params.size()];
			params.toArray(ps);
			
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql.toString(),ps);
			if(null != rs) {
				while(rs.next()) {
					String ddbh = rs.getString("ddbh");
					String fjbh = rs.getString("fjbh");
					String grbh = rs.getString("grbh");
					String ddzt = rs.getString("ddzt");
					String rzsj = rs.getString("rzsj");
					String tfsj = rs.getString("tfsj");
					Integer rzrs = Integer.valueOf(rs.getString("rzrs"));
					String xm = rs.getString("xm");
					String lxfs = rs.getString("lxfs");
					String xb = rs.getString("xb");
					String sfzh = rs.getString("sfzh");
					String clr = rs.getString("clr");
					Ddxxb user=new Ddxxb(ddbh, fjbh, grbh, ddzt, rzsj, tfsj, rzrs, xm, lxfs, xb, sfzh, clr);
					list.add(user);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//根据用户个人编号查询所有订单
	public ArrayList<Ddxxb> listById(String id) {
		ArrayList<Ddxxb> list = new ArrayList<Ddxxb>();
		try {
			ArrayList<String> params = new ArrayList<String>();
			StringBuffer sql = new StringBuffer("select ddbh,fjbh,grbh,ddzt,rzsj,tfsj,rzrs,xm,lxfs,xb,sfzh,clr from ddxxb where grbh = ?");
			
			
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql.toString(),id);
			if(null != rs) {
				while(rs.next()) {
					String ddbh = rs.getString("ddbh");
					String fjbh = rs.getString("fjbh");
					String grbh = rs.getString("grbh");
					String ddzt = rs.getString("ddzt");
					String rzsj = rs.getString("rzsj");
					String tfsj = rs.getString("tfsj");
					Integer rzrs = Integer.valueOf(rs.getString("rzrs"));
					String xm = rs.getString("xm");
					String lxfs = rs.getString("lxfs");
					String xb = rs.getString("xb");
					String sfzh = rs.getString("sfzh");
					String clr = rs.getString("clr");
					Ddxxb user=new Ddxxb(ddbh, fjbh, grbh, ddzt, rzsj, tfsj, rzrs, xm, lxfs, xb, sfzh, clr);
					list.add(user);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	

	@Override
	public ArrayList<Ddxxb> listByMap(Map<String, Object> map) {
		ArrayList<Ddxxb> list = new ArrayList<Ddxxb>();
		try {
			Ddxxb obj = (Ddxxb)map.get("user");	//获取用户对象
			Pager pager = (Pager)map.get("pager");	//获取分页对象
			ArrayList<String> params = null;
			Object[] ps = null;
			StringBuffer sql = new StringBuffer("select ddbh,fjbh,grbh,ddzt,rzsj,tfsj,rzrs,xm,lxfs,xb,sfzh,clr from ddxxb where 1=1");
			
			//查询参数拼接
			if(null != obj) {
				params = new ArrayList<String>();
				
				if(StrUtil.isNotEmpty(obj.getDdzt())) {
					sql.append(" and ddzt like ? ");
					params.add(obj.getDdzt());
				}
				if(StrUtil.isNotEmpty(obj.getXm())) {
					sql.append(" and xm like ? ");
					params.add(obj.getXm());
				}
				if(StrUtil.isNotEmpty(obj.getLxfs())) {
					sql.append(" and lxfs like ? ");
					params.add(obj.getLxfs());
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
					String ddbh = rs.getString("ddbh");
					String fjbh = rs.getString("fjbh");
					String grbh = rs.getString("grbh");
					String ddzt = rs.getString("ddzt");
					String rzsj = rs.getString("rzsj");
					String tfsj = rs.getString("tfsj");
					Integer rzrs = Integer.valueOf(rs.getString("rzrs"));
					String xm = rs.getString("xm");
					String lxfs = rs.getString("lxfs");
					String xb = rs.getString("xb");
					String sfzh = rs.getString("sfzh");
					String clr = rs.getString("clr");
					Ddxxb user=new Ddxxb(ddbh, fjbh, grbh, ddzt, rzsj, tfsj, rzrs, xm, lxfs, xb, sfzh, clr);
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
			String sql = "select 1 from ddxxb where ddbh = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,id);
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	

	@Override
	public boolean isExist(Ddxxb obj) {
		boolean ret = false;
		try {
			String sql = "select 1 from ddxxb where xm = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,obj.getXm());
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
/*
 * 	public static void main(String[] args) {
		Ddxxb obj=new Ddxxb("111","111","111", null, null, null, null, null, null, null, null, null) ;
		String id=obj.getDdbh();
		DdxxbDao cs=new DdxxbDao();
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
