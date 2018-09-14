package com.Nine.Sky_lnn.common;

/**
 * 分页sql工具
 * @author thinker
 * 2017年8月10日
 */
public class PagerCommon {
	private static final String DB_ORACLE = "oracle";
	private static final String DB_MYSQL = "mysql";
	private static final String DB = JdbcProperties.getDb();
	
	/**
	 * 获取分页sql语句
	 * @param sql 需要拼接分页sql的原始查询sql语句
	 * @param pager 分页对象
	 * @return 分页sql语句
	 */
	public static String getPagerSql(String sql,Pager pager){
		String pagerSql = "";
		if(DB.equals(DB_ORACLE)){
			pagerSql = getOraclePagerSql(sql,pager);
		}else if(DB.equals(DB_MYSQL)){
			pagerSql = getMySQLPagerSql(sql,pager);
		}
		return pagerSql;
	}
	
	/**
	 * 获取oracle 分页sql语句
	 */
	private static String getOraclePagerSql(String sql,Pager pager){
		StringBuffer pagerSql = new StringBuffer();
		pagerSql.append("select t.* from(")
			.append("select f.*,rownum rn from(")
			.append(sql)
			.append(")f where rownum <=  ").append(pager.getEndRowNum())
			.append(")t where t.rn >=  ").append(pager.getStartRowNum());
		return pagerSql.toString();
	}
	
	/**
	 * 获取mysql 分页sql语句
	 */
	private static String getMySQLPagerSql(String sql,Pager pager){
		return new StringBuffer(sql)
			.append(" limit ").append(pager.getStartRowNum()).append(",").append(pager.getPageSize())
			.toString();
	}
	
}
