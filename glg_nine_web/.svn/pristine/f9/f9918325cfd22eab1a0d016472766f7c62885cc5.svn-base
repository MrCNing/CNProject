package com.Nine.Sky_lnn.util;

import java.util.UUID;


/**
 * <h4>描述：唯一标识生成器(生成数据库表的主键id) </h4>
 * <pre><h5>
 * author lsy
 * date 2015年4月3日
 * version V1.0
 * email lishengyuan11@foxmail.com
 * </h5></pre>
 */
public class UUIDUtil {
	/**
	 * 获取一个32位长的唯一id
	 * @return 唯一id
	 */
	public static String getUuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	/**
	 * 获取32位唯一id，uuid拼接下单时间
	 */
	public static String getUuidTime() {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid.substring(0,18) + DateUtil.getNow();
	}
}
