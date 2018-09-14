package com.Nine.Sky_lnn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.Nine.Sky_lnn.bean.Fjxxb;
import com.Nine.Sky_lnn.common.DatabaseCrud;
import com.Nine.Sky_lnn.common.Pager;
import com.Nine.Sky_lnn.common.PagerCommon;
import com.Nine.Sky_lnn.dao.base.BaseDaoAdapter;
import com.Nine.Sky_lnn.dao.base.IBaseDao;
import com.Nine.Sky_lnn.util.StrUtil;

public class FjxxbDao extends BaseDaoAdapter<Fjxxb> implements IBaseDao<Fjxxb> {

	@Override
	public boolean add(Fjxxb obj) {
		String sql = "insert into fjxxb(fjbh,fyjs,jq,fjtp,cs,jtdz,lxfs,kzrs,clx,jdsj,zsrzts,zdrzts,rzsj,tfsj,sfsm,wx,kt,bx,xyj,ds,rs,dn,zc,zf,wsj) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] valus = new Object[] {obj.getFjbh(),obj.getFyjs(),obj.getJq(),obj.getFjtp(),obj.getCs(),obj.getJtdz(),obj.getLxfs(),obj.getKzrs(),obj.getClx(),obj.getJdsj(),obj.getZsrzts(),obj.getZdrzts(),obj.getRzsj(),obj.getTfsj(),obj.getSfsm(),obj.getWx(),obj.getKt(),obj.getBx(),obj.getXyj(),obj.getDs(),obj.getRs(),obj.getDn(),obj.getZc(),obj.getZf(),obj.getWsj()};
		return (boolean)DatabaseCrud.doCrud(sql,valus);
	}

	@Override
	public boolean deleteById(String id) {
		String sql = "delete from fjxxb where fjbh = ? ";
		return (boolean)DatabaseCrud.doCrud(sql,id);
	}

	@Override
	public boolean update(Fjxxb obj) {
		System.out.println(obj);
		String sql = "update fjxxb set fyjs = ?,jq = ?,fjtp = ?, cs = ?,jtdz = ?,lxfs = ?,kzrs = ?,clx = ?,jdsj = ?,zsrzts = ?,zdrzts = ?, rzsj = ?, tfsj = ?,sfsm = ?, wx = ?, kt = ?, bx = ?, xyj = ?,ds = ?, rs = ?, dn = ?, zc = ?, zf = ?, wsj = ? where fjbh = ? ";
		return (boolean)DatabaseCrud.doCrud(sql,obj.getFyjs(),obj.getJq(),obj.getFjtp(),obj.getCs(),obj.getJtdz(),obj.getLxfs(),obj.getKzrs(),obj.getClx(),obj.getJdsj(),obj.getZsrzts(),obj.getZdrzts(),obj.getRzsj(),obj.getTfsj(),obj.getSfsm(),obj.getWx(),obj.getKt(),obj.getBx(),obj.getXyj(),obj.getDs(),obj.getRs(),obj.getDn(),obj.getZc(),obj.getZf(),obj.getWsj(),obj.getFjbh());
	}

	@Override
	public Fjxxb selectById(String id) {
		Fjxxb user = null;
		try {
			String sql = "select fjbh,fyjs,jq,fjtp,cs,jtdz,lxfs,kzrs,clx,jdsj,zsrzts,zdrzts,rzsj,tfsj,sfsm,wx,kt,bx,xyj,ds,rs,dn,zc,zf,wsj from fjxxb where fjbh = ?";
			ResultSet rs1 = (ResultSet)DatabaseCrud.doCrud(sql, id);
			if(null != rs1 && rs1.next()) {
				String fjbh = rs1.getString("fjbh");
				String fyjs = rs1.getString("fyjs");
				Integer jq = Integer.valueOf(rs1.getString("jq"));
				String fjtp = rs1.getString("fjtp");
				String cs = rs1.getString("cs");
				String jtdz = rs1.getString("jtdz");
				String lxfs = rs1.getString("lxfs");
				Integer kzrs = Integer.valueOf(rs1.getString("kzrs"));
				String clx = rs1.getString("clx");
				String jdsj = rs1.getString("jdsj");
				String zsrzts = rs1.getString("zsrzts");
				String zdrzts = rs1.getString("zdrzts");
				String rzsj = rs1.getString("rzsj");
				String tfsj = rs1.getString("tfsj");
				String sfsm = rs1.getString("sfsm");
				String wx = rs1.getString("wx");
				String kt = rs1.getString("kt");
				String bx = rs1.getString("bx");
				String xyj = rs1.getString("xyj");
				String ds = rs1.getString("ds");
				String rs = rs1.getString("rs");
				String dn = rs1.getString("dn");
				String zc = rs1.getString("zc");
				String zf = rs1.getString("zf");
				String wsj = rs1.getString("wsj");
				user=new Fjxxb(fjbh,fyjs,jq,fjtp,cs,jtdz,lxfs,kzrs,clx,jdsj,zsrzts,zdrzts,rzsj,tfsj,sfsm,wx,kt,bx,xyj,ds,rs,dn,zc,zf,wsj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public Fjxxb select(Fjxxb obj) {
		Fjxxb user = null;
		try {
			String sql = "select fjbh,fyjs,jq,fjtp,cs,jtdz,lxfs,kzrs,clx,jdsj,zsrzts,zdrzts,rzsj,tfsj,sfsm,wx,kt,bx,xyj,ds,rs,dn,zc,zf,wsj from fjxxb where cs = ?";
			ResultSet rs1 = (ResultSet)DatabaseCrud.doCrud(sql, obj.getCs());
			if(null != rs1 && rs1.next()) {
				String fjbh = rs1.getString("fjbh");
				String fyjs = rs1.getString("fyjs");
				Integer jq = Integer.valueOf(rs1.getString("jq"));
				String fjtp = rs1.getString("fjtp");
				String cs = rs1.getString("cs");
				String jtdz = rs1.getString("jtdz");
				String lxfs = rs1.getString("lxfs");
				Integer kzrs = Integer.valueOf(rs1.getString("kzrs"));
				String clx = rs1.getString("clx");
				String jdsj = rs1.getString("jdsj");
				String zsrzts = rs1.getString("zsrzts");
				String zdrzts = rs1.getString("zdrzts");
				String rzsj = rs1.getString("rzsj");
				String tfsj = rs1.getString("tfsj");
				String sfsm = rs1.getString("sfsm");
				String wx = rs1.getString("wx");
				String kt = rs1.getString("kt");
				String bx = rs1.getString("bx");
				String xyj = rs1.getString("xyj");
				String ds = rs1.getString("ds");
				String rs = rs1.getString("rs");
				String dn = rs1.getString("dn");
				String zc = rs1.getString("zc");
				String zf = rs1.getString("zf");
				String wsj = rs1.getString("wsj");
				user=new Fjxxb(fjbh,fyjs,jq,fjtp,cs,jtdz,lxfs,kzrs,clx,jdsj,zsrzts,zdrzts,rzsj,tfsj,sfsm,wx,kt,bx,xyj,ds,rs,dn,zc,zf,wsj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public ArrayList<Fjxxb> listAll() {
		return listByObj(null);
	}

	@Override
	public ArrayList<Fjxxb> listByObj(Fjxxb obj) {
		ArrayList<Fjxxb> list = new ArrayList<Fjxxb>();
		try {
			ArrayList<String> params = new ArrayList<String>();
			StringBuffer sql = new StringBuffer("select fjbh,fyjs,jq,fjtp,cs,jtdz,lxfs,kzrs,clx,jdsj,zsrzts,zdrzts,rzsj,tfsj,sfsm,wx,kt,bx,xyj,ds,rs,dn,zc,zf,wsj from fjxxb where 1=1");
			if(null != obj) {
				if(StrUtil.isNotEmpty(obj.getCs())) {
					sql.append(" and cs like ? ");
					params.add(obj.getCs());
				}
				if(StrUtil.isNotEmpty(obj.getFyjs())) {
					sql.append(" and fyjs like ? ");
					params.add(obj.getFyjs());
				}
			}
			
			Object[] ps = new String[params.size()];
			params.toArray(ps);
			
			ResultSet rs1 = (ResultSet)DatabaseCrud.doCrud(sql.toString(),ps);
			if(null != rs1) {
				while(rs1.next()) {
					String fjbh = rs1.getString("fjbh");
					String fyjs = rs1.getString("fyjs");
					Integer jq = Integer.valueOf(rs1.getString("jq"));
					String fjtp = rs1.getString("fjtp");
					String cs = rs1.getString("cs");
					String jtdz = rs1.getString("jtdz");
					String lxfs = rs1.getString("lxfs");
					Integer kzrs = Integer.valueOf(rs1.getString("kzrs"));
					String clx = rs1.getString("clx");
					String jdsj = rs1.getString("jdsj");
					String zsrzts = rs1.getString("zsrzts");
					String zdrzts = rs1.getString("zdrzts");
					String rzsj = rs1.getString("rzsj");
					String tfsj = rs1.getString("tfsj");
					String sfsm = rs1.getString("sfsm");
					String wx = rs1.getString("wx");
					String kt = rs1.getString("kt");
					String bx = rs1.getString("bx");
					String xyj = rs1.getString("xyj");
					String ds = rs1.getString("ds");
					String rs = rs1.getString("rs");
					String dn = rs1.getString("dn");
					String zc = rs1.getString("zc");
					String zf = rs1.getString("zf");
					String wsj = rs1.getString("wsj");
					Fjxxb user=new Fjxxb(fjbh,fyjs,jq,fjtp,cs,jtdz,lxfs,kzrs,clx,jdsj,zsrzts,zdrzts,rzsj,tfsj,sfsm,wx,kt,bx,xyj,ds,rs,dn,zc,zf,wsj);
					list.add(user);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<Fjxxb> listByMap(Map<String, Object> map) {
		ArrayList<Fjxxb> list = new ArrayList<Fjxxb>();
		try {
			Fjxxb obj = (Fjxxb)map.get("user");	//获取用户对象
			Pager pager = (Pager)map.get("pager");	//获取分页对象
			ArrayList<String> params = null;
			Object[] ps = null;
			StringBuffer sql = new StringBuffer("select fjbh,fyjs,jq,fjtp,cs,jtdz,lxfs,kzrs,clx,jdsj,zsrzts,zdrzts,rzsj,tfsj,sfsm,wx,kt,bx,xyj,ds,rs,dn,zc,zf,wsj from fjxxb where 1=1");
			
			//查询参数拼接
			if(null != obj) {
				params = new ArrayList<String>();
				
				if(StrUtil.isNotEmpty(obj.getCs())) {
					sql.append(" and cs like ? ");
					params.add(obj.getCs());
				}
				if(StrUtil.isNotEmpty(obj.getFyjs())) {
					sql.append(" and fyjs like ? ");
					params.add(obj.getFyjs());
				}

				
				ps = new Object[params.size()];
				params.toArray(ps);
			}
//			System.out.println(sql);
			
			//分页sql拼接
			String pagerSql = sql.toString();
			if(null != pager) {
				//获取分页sql
				pagerSql = PagerCommon.getPagerSql(pagerSql, pager);
				//获取记录总行数
				int totalRows = DatabaseCrud.getTotalRows(sql.toString(),ps);
				pager.setTotalRows(totalRows);
			}
			
			ResultSet rs1 = (ResultSet)DatabaseCrud.doCrud(pagerSql,ps);
			if(null != rs1) {
				while(rs1.next()) {
					String fjbh = rs1.getString("fjbh");
					String fyjs = rs1.getString("fyjs");
					Integer jq = Integer.valueOf(rs1.getString("jq"));
					String fjtp = rs1.getString("fjtp");
					String cs = rs1.getString("cs");
					String jtdz = rs1.getString("jtdz");
					String lxfs = rs1.getString("lxfs");
					Integer kzrs = Integer.valueOf(rs1.getString("kzrs"));
					String clx = rs1.getString("clx");
					String jdsj = rs1.getString("jdsj");
					String zsrzts = rs1.getString("zsrzts");
					String zdrzts = rs1.getString("zdrzts");
					String rzsj = rs1.getString("rzsj");
					String tfsj = rs1.getString("tfsj");
					String sfsm = rs1.getString("sfsm");
					String wx = rs1.getString("wx");
					String kt = rs1.getString("kt");
					String bx = rs1.getString("bx");
					String xyj = rs1.getString("xyj");
					String ds = rs1.getString("ds");
					String rs = rs1.getString("rs");
					String dn = rs1.getString("dn");
					String zc = rs1.getString("zc");
					String zf = rs1.getString("zf");
					String wsj = rs1.getString("wsj");
					Fjxxb user=new Fjxxb(fjbh,fyjs,jq,fjtp,cs,jtdz,lxfs,kzrs,clx,jdsj,zsrzts,zdrzts,rzsj,tfsj,sfsm,wx,kt,bx,xyj,ds,rs,dn,zc,zf,wsj);
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
			String sql = "select 1 from fjxxb where fjbh = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,id);
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

	@Override
	public boolean isExist(Fjxxb obj) {
		boolean ret = false;
		try {
			String sql = "select 1 from fjxxb where fjbh = ? ";
			ResultSet rs = (ResultSet)DatabaseCrud.doCrud(sql,obj.getFjbh());
			ret = rs != null && rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	/*
	 * 	public static void main(String[] args) {
		Fjxxb obj=new Fjxxb("1111", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		String id=obj.getFjbh();
		FjxxbDao cs=new FjxxbDao();
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
