package com.Nine.Sky_lnn.service;

import java.util.ArrayList;
import java.util.Map;

import com.Nine.Sky_lnn.bean.Ddxxb;
import com.Nine.Sky_lnn.bean.Dlxxb;
import com.Nine.Sky_lnn.bean.Fjxxb;
import com.Nine.Sky_lnn.dao.DdxxbDao;
import com.Nine.Sky_lnn.service.base.BaseServiceAdapter;
import com.Nine.Sky_lnn.service.base.IBaseService;
import com.Nine.Sky_lnn.util.UUIDUtil;

public class DdxxbService extends BaseServiceAdapter<Ddxxb> implements IBaseService<Ddxxb> {
	private DdxxbDao ddxxbDao=new DdxxbDao();
	@Override
	public boolean add(Ddxxb obj) {
		obj.setDdbh(UUIDUtil.getUuidTime()); //uuid+nowtime
		return ddxxbDao.add(obj);
	}

	@Override
	public boolean deleteById(String id) {
		return ddxxbDao.deleteById(id);
	}

	@Override
	public boolean delete(Ddxxb obj) {
		return ddxxbDao.delete(obj);
	}

	@Override
	public boolean update(Ddxxb obj) {
		return ddxxbDao.update(obj);
	}

	@Override
	public Ddxxb selectById(String id) {
		return ddxxbDao.selectById(id);
	}
	
	public ArrayList<Ddxxb> selectByClr(Map<String, Object> map) {
		Ddxxb obj = (Ddxxb)map.get("user");
		
		String ddzt = obj.getDdzt();
		if(null != ddzt) {
			ddzt = "%" + ddzt + "%";
			obj.setDdzt(ddzt);
		}
		String xm = obj.getXm();
		if(null != xm) {
			xm = "%" + xm + "%";
			obj.setXm(xm);
		}
		String lxfs = obj.getLxfs();
		if(null != lxfs) {
			lxfs = "%" + lxfs + "%";
			obj.setLxfs(lxfs);
		}
		return ddxxbDao.selectByClr(map);
	}

	@Override
	public Ddxxb select(Ddxxb obj) {
		return ddxxbDao.select(obj);
	}

	@Override
	public ArrayList<Ddxxb> listAll() {
		ArrayList<Ddxxb> list = ddxxbDao.listAll();
		return list;
	}

	@Override
	public ArrayList<Ddxxb> listByObj(Ddxxb obj) {

		String ddzt = obj.getDdzt();
		if(null != ddzt) {
			ddzt = "%" + ddzt + "%";
			obj.setDdzt(ddzt);
		}
		String xm = obj.getXm();
		if(null != xm) {
			xm = "%" + xm + "%";
			obj.setXm(xm);
		}
		String lxfs = obj.getLxfs();
		if(null != lxfs) {
			lxfs = "%" + lxfs + "%";
			obj.setLxfs(lxfs);
		}
		
		ArrayList<Ddxxb> list = ddxxbDao.listByObj(obj);
		return list;
	}

	@Override
	public ArrayList<Ddxxb> listByMap(Map<String, Object> map) {
		Ddxxb obj = (Ddxxb)map.get("user");
		
		String ddzt = obj.getDdzt();
		if(null != ddzt) {
			ddzt = "%" + ddzt + "%";
			obj.setDdzt(ddzt);
		}
		String xm = obj.getXm();
		if(null != xm) {
			xm = "%" + xm + "%";
			obj.setXm(xm);
		}
		String lxfs = obj.getLxfs();
		if(null != lxfs) {
			lxfs = "%" + lxfs + "%";
			obj.setLxfs(lxfs);
		}
		ArrayList<Ddxxb> list =  ddxxbDao.listByMap(map);
		return list;
	}

	@Override
	public boolean isExist(String id) {
		return ddxxbDao.isExist(id);
	}

	@Override
	public boolean isExist(Ddxxb obj) {
		return ddxxbDao.isExist(obj);
	}

}
