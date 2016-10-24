package com.map.platform.commons.dao;

import java.util.List;
import java.util.Map;


/**
 * Dao基类实现类封装CRUD方法
 * @author Guosw
 * @date 2016年4月17日 下午11:16:57
 */
public interface BaseDao<T> {
    /**
     * 增加
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity      封装数据的实体
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public boolean add(String classMethod, T entity) throws Exception;

    /**
     * 修改
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity      封装数据的实体
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public boolean edit(String classMethod, T entity) throws Exception;

    /**
     * 删除
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity      封装数据的实体
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public boolean remove(String classMethod, T entity) throws Exception;

    /**
     * 批量删除
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param list        要删除的数据集合
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public boolean batchDelete(String classMethod, List<String> list) throws Exception;


    /**
     * 批量增加
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param list        要增加的数据集合
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public boolean batchAdd(String classMethod, List<T> list) throws Exception;

    /**
     * 以id为条件查找对象
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity      封装数据的实体
     * @return 返回查询结果
     * @throws Exception 抛出所有异常
     */
    public T get(String classMethod, T entity) throws Exception;

    /**
     * 查询
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity      封装数据的实体
     * @return 返回查询结果
     * @throws Exception 抛出所有异常
     */
    public List<T> getAllList(String classMethod, T entity) throws Exception;

    /**
     * 查询数量
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity      封装数据的实体
     * @return 返回查询结果
     * @throws Exception 抛出所有异常
     */
    public int getCount(String classMethod, T entity) throws Exception;

    /**
     * 获取seq值
     *
     * @param queryClassMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @return Integer 生成的seq值
     * @throws Exception 抛出所有异常
     */
    public String getStringResult(String queryClassMethod) throws Exception;

    public Integer getIntResult(String classMethod) throws Exception;

    /**
     * 获取getColumn值
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @return Integer 生成的seq值
     * @throws Exception 抛出所有异常
     */
    public String getColumn(String classMethod) throws Exception;

    /**
     * 批量删除
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param list        要删除的数据集合
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public boolean batchDeleteT(String classMethod, List<T> list) throws Exception;

    /**
     * 获取单个值 如sum、count等
     *
     * @param queryClassMethod queryClassMethod	mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity           查询条件实体
     * @return
     * @throws Exception
     */
    public String getOneResult(String queryClassMethod, T entity) throws Exception;

    /**
     * 获取map集合
     *
     * @param queryClassMethod queryClassMethod	mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param obj              查询条件map
     * @return
     * @throws Exception
     */
    public Map<String, Object> getMap(String queryClassMethod, Map<String, Object> obj) throws Exception;

    /**
     * 查询 -单个String 查询所有 如in ids
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param params      封装数据的实体
     * @return 返回查询结果
     * @throws Exception 抛出所有异常
     */
    public List<T> getAllListByIds(String classMethod, List<String> params) throws Exception;

    /**
     * 获取对象
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @return 返回查询结果
     * @throws Exception 抛出所有异常
     */
    public T get(String classMethod, String param) throws Exception;

    /**
     * 批量更新
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public boolean bantchEdit(String classMethod, Map<String, Object> maps) throws Exception;

    /**
     * 查询
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @return 返回查询结果
     * @throws Exception 抛出所有异常
     */
    public List<T> getSearchList(String classMethod, Map<String, Object> maps) throws Exception;
    /**
     * 查询
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @return 返回查询结果
     * @throws Exception 抛出所有异常
     */
    public List<T> getSearchListByObj(String classMethod, Object obj) throws Exception;

    /**
     * 批量修改
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param list        要修改的对象数据集合
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public int batchUpdate(String classMethod, List<T> list) throws Exception;

    /**
     * 批量修改
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param list        要修改的String数据集合
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public int batchModify(String classMethod, List<String> list) throws Exception;
    
    /**
	 * 批量修改
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @param Map 要修改的对象数据集合
	 * @return 返回操作结果
	 * @throws Exception 抛出所有异常
	 * 
	 */
	public boolean batchUpdateByMap(String classMethod,
			Map<String, Object> params) throws Exception;

    public T getOneObject(String classMethod, T entity) throws Exception;

    public Integer getIntResult(String classMethod, Object obj) throws Exception;
    
}
