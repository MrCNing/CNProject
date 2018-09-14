package com.Nine.Sky_lnn.service;

import java.util.ArrayList;
import java.util.Map;

import com.Nine.Sky_lnn.bean.Fjxxb;
import com.Nine.Sky_lnn.dao.FjxxbDao;
import com.Nine.Sky_lnn.service.base.BaseServiceAdapter;
import com.Nine.Sky_lnn.service.base.IBaseService;
import com.Nine.Sky_lnn.util.UUIDUtil;

public class FjxxbService extends BaseServiceAdapter<Fjxxb>implements IBaseService<Fjxxb> {
	private FjxxbDao fjxxbDao=new FjxxbDao();
	@Override
	public boolean add(Fjxxb obj) {
		/*生成房间编号*/
		String fjbh = UUIDUtil.getUuid();
		obj.setFjbh(fjbh);
		return fjxxbDao.add(obj);
	}

	@Override
	public boolean deleteById(String id) {
		return fjxxbDao.deleteById(id);
	}

	@Override
	public boolean delete(Fjxxb obj) {
		return fjxxbDao.delete(obj);
	}

	@Override
	public boolean update(Fjxxb obj) {
		return fjxxbDao.update(obj);
	}

	@Override
	public Fjxxb selectById(String id) {
		return fjxxbDao.selectById(id);
	}

	@Override
	public Fjxxb select(Fjxxb obj) {
		return fjxxbDao.select(obj);
	}

	@Override
	public ArrayList<Fjxxb> listAll() {
		ArrayList<Fjxxb> list = fjxxbDao.listAll();
		return list;
	}

	@Override
	public ArrayList<Fjxxb> listByObj(Fjxxb obj) {
		
		String cs = obj.getCs();
		if(null != cs) {
			cs = "%" + cs + "%";
			obj.setCs(cs);
		}
		
		String fyjs = obj.getFyjs();
		if(null != fyjs) {
			fyjs = "%" + fyjs + "%";
			obj.setFyjs(fyjs);
		}
		
		ArrayList<Fjxxb> list = fjxxbDao.listByObj(obj);
		return list;
	}

	@Override
	public ArrayList<Fjxxb> listByMap(Map<String, Object> map) {
		Fjxxb obj = (Fjxxb)map.get("user");
		
		String cs = obj.getCs();
		if(null != cs) {
			cs = "%" + cs + "%";
			obj.setCs(cs);
		}
		String fyjs = obj.getFyjs();
		if(null != fyjs) {
			fyjs = "%" + fyjs + "%";
			obj.setFyjs(fyjs);
		}
		
		ArrayList<Fjxxb> list =  fjxxbDao.listByMap(map);
		return list;
	}

	@Override
	public boolean isExist(String id) {
		return fjxxbDao.isExist(id);
	}

	@Override
	public boolean isExist(Fjxxb obj) {
		return fjxxbDao.isExist(obj);
	}
	
}
