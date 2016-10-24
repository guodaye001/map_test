package com.map.platform.commons.utils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * spring工具类
 * 2016年10月11日16:58:27
 */
public class SpringUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        SpringUtil.applicationContext = applicationContext;
    }
    public static Object getBean(String beanId) {
        return applicationContext.getBean(beanId);
    }
}