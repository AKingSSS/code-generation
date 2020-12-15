package com.aking.code.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
	
	public static final char UNDERLINE = '_';
	
	/**
	 * 首字符转大写
	 * 
	 * @param val
	 * @return
	 */
	public static String toUpperCaseFirst(String val) {
		StringBuffer sb = new StringBuffer(val);
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		val = sb.toString();
		return val;
	}

	public static String toLowerCaseFirst(String val) {
		StringBuffer sb = new StringBuffer(val);
		sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
		val = sb.toString();
		return val;
	}

	

	public static String camelToUnderline(String param) {
		if (param == null || "".equals(param.trim())) {
			return "";
		}
		int len = param.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			char c = param.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(UNDERLINE);
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static String underLineToCamel(String param) {
		if (param == null || "".equals(param.trim())) {
			return "";
		}
		int len = param.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			char c = param.charAt(i);
			if (c == UNDERLINE) {
				if (++i < len) {
					sb.append(Character.toUpperCase(param.charAt(i)));
				}
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static String underLineToCamel2(String param) {
		if (param == null || "".equals(param.trim())) {
			return "";
		}
		StringBuilder sb = new StringBuilder(param);
		Matcher mc = Pattern.compile("_").matcher(param);
		int i = 0;
		while (mc.find()) {
			int position = mc.end() - (i++);
			sb.replace(position - 1, position + 1, sb.substring(position, position + 1).toUpperCase());
		}
		return sb.toString();
	}
	public static String underLineToCamel3(String param) {
		return underLineToCamel2(param.replace(".",""));
	}


}
