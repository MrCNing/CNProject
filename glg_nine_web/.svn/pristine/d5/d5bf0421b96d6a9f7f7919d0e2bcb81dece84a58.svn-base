package com.Nine.Sky_lnn.util;

public class StrUtil {
	/**
	 * 判断字符串是否为""、null
	 * @param str 待测字符串
	 * @return str为空串则返回true，非空返回false
	 */
	public static boolean isEmpty(String str){
		return null == str ? true : str.trim().equals("");
	}
	
	/**
	 * 判断字符串是否非空（""、null）
	 * @param str 待测字符串
	 * @return str非空返回true，空返回false
	 */
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}
	
	/**
	 * 判断两字符串是否  相等
	 * @param src 字符串1
	 * @param dest 字符串2
	 * @return 两串相等，返回true
	 */
	public static boolean equals(String src,String dest){
		return src == null ? dest == null : src.equals(dest) ;
	}
	
	/**
	 * 判断两字符串是否不等
	 * @return 两串不等，返回true；相等返回false
	 */
	public static boolean isNotEquals(String src,String dest){
		return !equals(src, dest);
	}
	
	/**
	 * 去掉字符串str首尾空格，如果str为null或"null",则返回""(空串).
	 * @param str 待去空字符串
	 * @return 去掉了首尾空格的字符串
	 */
	public static String trim(String str){
		if(null == str)
			return "";
		str = str.trim();
		if(str.equalsIgnoreCase("null"))
			return "";
		return str;
	}
	
	/**
	 * 判断字符串str是否是纯数字串(0-9).
	 * @param str 待判断字符串
	 * @return 字符串为纯数字串，返回true；否则返回false；
	 */
	public static boolean isNumber(String str){
		return str==null?false:str.matches("\\d+");
	}
	
	/**
	 * 将字符串首字母小写
	 * @param str
	 * @return Str
	 */
	public static String toLowerTitle(String str){
		if(isEmpty(str))
			return str;
		char ch = str.charAt(0);
		if(ch>='A'&&ch<='Z')
			ch += 32;
		return ch+str.substring(1);
	}
	
}
