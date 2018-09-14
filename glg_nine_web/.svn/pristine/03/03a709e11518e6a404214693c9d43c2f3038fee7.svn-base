package com.Nine.Sky_lnn.util;

import org.apache.log4j.Logger;

public class LogUtil {
	public static Logger getLogger() {
		/*
		StackTraceElement[] ss = Thread.currentThread().getStackTrace();
		for(int i = 0; i < ss.length; i++) {
			System.out.println(ss[i] + "="+ i);
		}*/
		
		return Logger.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}
	
	public static void debug(String m) {
		getLogger().debug(m);
	}
	public static void info(String m) {
		getLogger().info(m);
	}
	public static void warn(String m) {
		getLogger().warn(m);
	}
	public static void error(String m) {
		getLogger().error(m);
	}
}
