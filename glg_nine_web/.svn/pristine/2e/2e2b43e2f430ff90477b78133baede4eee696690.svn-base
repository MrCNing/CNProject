package com.Nine.Sky_lnn.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseCrud {
	/**
	 * @param sql 
	 * @param values sql占位符参数值
	 * @return 如果是查询，成功返回结果集，失败返回null；如果是增删改，成功返回true，失败返回false；
	 */
	public static Object doCrud(String sql ,Object... values){
		//判断sql是否是select查询
		boolean isSelect = sql.trim().toLowerCase().startsWith("select");
		
		try {
			Connection conn = JdbcCommon.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			if(null != values && 0 != values.length){
				for (int i = 0; i < values.length; i++) {
					//给sql中的占位符（?）设置值
					pstmt.setObject(i+1, values[i]);
				}
			}
			
			//如果是select,则执行查询；否则做增、删、改操作
			return isSelect ? pstmt.executeQuery() : pstmt.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return isSelect ? null : false;
		}
	}
	
	/**
	 * 获取记录条数
	 * @param sql 查询sql
	 * @param values 参数
	 * @return 返回记录条数, 无则返回0, 查询失败返回-1
	 */
	public static int getTotalRows(String sql,Object... values) {
		try {
			int fromIndex = sql.indexOf("from");
			sql = "select count(1) " + sql.substring(fromIndex);
			ResultSet rs = (ResultSet)doCrud(sql, values);
			if(rs != null && rs.next()) {
				return rs.getInt(1);
			}else {
				return 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

}
