package com.map.platform.commons.utils;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;

import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Title:  郭氏智能设备管理系统
 * Description:常量存放类
 * Company: GuoSw广研
 * 2016年10月11日16:27:17
 */
public class Constants {
    public static Logger LOGGER = LoggerFactory.getLogger(Constants.class);
    private static final String CONFIG_FILE = "conf/commons/config.properties";
    //启动是个线程池
    public static ExecutorService processThreadPool = Executors.newFixedThreadPool(10);
    public static PropertiesConfiguration commonConfig = null;
    //变的变量(可能更改的变量)
    /****属性文件配置错误强制抛出异常的标识，false:如果属性文件中没有配置，程序就会强制停止,true:只会提示，不会停止**/
    private static boolean errFlag = true;
    
    /***当前应用的根目录*/
    public static final String APP_ROOT_DIR;
    /****是否启动按钮权限控制(true|false)****/
    public static final boolean PERMISSION_FLAG;


    public static WebApplicationContext webApplicationContext;

    static{
        LOGGER.debug("初始化系统参数开始....");
        FileInputStream inputStream = null;
        String url = null;
        try {
            url = Constants.class.getResource("").getPath().replaceAll("%20", " ");
            String path = url.substring(0, url.indexOf("WEB-INF")) + CONFIG_FILE;
            inputStream = new FileInputStream(path);
            commonConfig = new PropertiesConfiguration();
            commonConfig.load(inputStream);
        } catch (Exception e) {
            LOGGER.error("Exception", e);
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
        

        APP_ROOT_DIR = url.substring(0, url.indexOf("WEB-INF") - 1);
        PERMISSION_FLAG=Boolean.valueOf(getString("PERMISSION_FLAG"));
        

        if(!errFlag){
            commonConfig.getString("抛出异常......").trim();
        }
        LOGGER.debug("APP_ROOT_DIR={}", APP_ROOT_DIR);
        LOGGER.debug("初始化系统参数完成...");
    }
    /**
     * 得到属性文件中的数据
     * @param key
     * @return String
     */
    public static String getString(String key){
        String str = "";
        try {
            str = StringUtils.trimToEmpty(commonConfig.getString(key));
        } catch (Exception e) {
            LOGGER.error("key：" + key + "在properties没有配置" + e);
            errFlag = false;
        }
        return str;
    }
    /**
     * 得到属性文件中的数据
     * @param key
     * @return 返回 String []
     */
    public static String [] getStringArray(String key){
        String str [] = {""};
        try {
            str = commonConfig.getStringArray(key);
        } catch (Exception e) {
            LOGGER.error("key：" + key + "在properties没有配置" + e);
            errFlag = false;
        }

        if(str == null || str.length == 0){
            LOGGER.error("key：" + key + "在properties没有配置");
            errFlag = false;
        }
        return str;
    }

    public static Set<String> getSet(String [] str){
        Set<String> set = new HashSet<String>();
        if(str != null && str.length > 0){
            for (int i = 0; i < str.length; i++) {
                set.add(str[i]);
            }
        }
        return set;
    }
    public static void getSuccessBaseRate(){
        FileInputStream inputStream = null;
        try {
            String url = Constants.class.getResource("").getPath().replaceAll("%20", " ");
            String path = url.substring(0, url.indexOf("WEB-INF")) + CONFIG_FILE;
            inputStream = new FileInputStream(path);
            commonConfig = new PropertiesConfiguration();
            commonConfig.load(inputStream);

        } catch (Exception e) {
            LOGGER.error("Exception", e);
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
    }
    
    //不变的变量(程序中定义的变量名)
    /***登录界面图片类型*/
    public static final String LOGIN_IMG_BANNER = "login_img_banner";
    
}
