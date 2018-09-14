package com.Nine.Sky_lnn.dao.base;

import java.util.ArrayList;
import java.util.Map;

public interface IBaseDao<E> {
	/**
	 * 增加一条记录
	 * @param obj 待增加对象（记录）
	 * @return 添加成功返回true，否则返回false
	 */
	boolean add(E obj);
	
	/**
	 * 根据“主键id”删除一条记录
	 * @param id 主键id
	 * @return 删除成功返回true，否则返回false
	 */
	boolean deleteById(String id);
	
	/**
	 * 删除一条记录
	 * @param obj 待删除对象（记录）
	 * @return 删除成功返回true，否则返回false
	 */
	boolean delete(E obj);
	
	/**
	 * 批量删除
	 * @param list 参数集合
	 * @return 删除成功返回true，否则返回false
	 */
	boolean deleteList(ArrayList<String> list);
	
	/**
	 * 更新一条记录
	 * @param obj 待更新对象（记录）
	 * @return 更新成功返回true，否则返回false
	 */
	boolean update(E obj);
	
	/**
	 * 根据“主键id”获取一条记录
	 * @param id 主键id
	 * @return 满足条件的记录对象
	 */
	E selectById(String id);
	
	/**
	 * 根据参数对象获取一条记录
	 * @param obj 封装有查询参数的对象
	 * @return 满足查询条件的记录对象
	 */
	E select(E obj);
	
	/**
	 * 查询所有记录(不分页)
	 * @return 所有记录对象
	 */
	ArrayList<E> listAll();
	
	/**
	 * 根据对象参数获取记录集
	 * @param obj 封装有查询参数的对象
	 * @return 满足条件的 记录对象集
	 */
	ArrayList<E> listByObj(E obj);
	
	/**
	 * 根据Map对象参数获取记录集
	 * @param map 封装有一个或多个对象参数的Map集合，比如“查询参数对象”、“分页信息对象”等，是对{@link IBaseDao#listByObj(Object)}方法的扩展和补充
	 * @return
	 */
	ArrayList<E> listByMap(Map<String, Object> map);
	
	/**
	 * 根据主键判断记录是否存在
	 * @param id 主键id
	 * @return 记录存在返回true，否则返回false
	 */
	boolean isExist(String id);
	
	/**
	 * 判断记录是否存在
	 * @param obj 待判断对象（记录）
	 * @return 记录存在返回true，否则返回false
	 */
	boolean isExist(E obj);
}
