package com.map.platform.commons.utils.tld;

import org.springframework.context.ApplicationContext;
import com.map.platform.commons.utils.Constants;
import com.map.platform.commons.utils.SpringUtil;

/**
 * @author Guo
 * 自定义标签权限许可标签tld
 */
public class PermissionFunction {
	/**
	 * 验证是否有权限
	 * @param id
	 * @return
	 */
	public static boolean check(String id){
		boolean result = false;
		if(Constants.PERMISSION_FLAG){
			ApplicationContext ac = SpringUtil.getApplicationContext();
		}else{
			result = true;
		}
		return result;
	}
	
	/**
	 * 格式化字符串日期
	 * @param date
	 * @return
	 */
	public static String format(String date){
		String result = "";
		if(date != null && !"".equals(date)){
			if(date.length() == 8){
				result = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8);
			}else if(date.length() == 14){
				result = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8) + " " + date.substring(8, 10) + ":" + date.substring(10, 12) + ":" + date.substring(12, 14);
			}else{
				result = date;
			}
		}
		return result;
	}
}
