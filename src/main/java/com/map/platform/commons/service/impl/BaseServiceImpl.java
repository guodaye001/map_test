package com.map.platform.commons.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.map.platform.commons.bean.BaseModel;
import com.map.platform.commons.dao.BaseDao;
import com.map.platform.commons.service.BaseService;

/**
 * Service基类实现类封装CRUD方法
 * @author Guosw
 * @date 2016年4月17日 下午11:17:31
 */
@Service("baseService")
public class BaseServiceImpl<T extends BaseModel> implements BaseService<T> {
    protected static Logger log = LoggerFactory.getLogger(BaseServiceImpl.class);
    @Autowired
    BaseDao<T> baseDao;

    /**
     * 增加
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity      封装数据的实体
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public boolean add(String classMethod, T entity) throws Exception {
        return baseDao.add(classMethod, entity);
    }

    /**
     * 修改
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity      封装数据的实体
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public boolean edit(String classMethod, T entity) throws Exception {
        return baseDao.edit(classMethod, entity);
    }

    /**
     * 删除
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity      封装数据的实体
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public boolean remove(String classMethod, T entity) throws Exception {
        return baseDao.remove(classMethod, entity);
    }

    /**
     * 批量删除
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param list        要删除的数据集合
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public boolean batchDelete(String classMethod, List<String> list) throws Exception {
        return baseDao.batchDelete(classMethod, list);
    }

    /**
     * 批量增加
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param list        要增加的数据集合
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public boolean batchAdd(String classMethod, List<T> list) throws Exception {
        return baseDao.batchAdd(classMethod, list);
    }

    /**
     * 以id为条件查找对象
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity      封装数据的实体
     * @return 返回查询结果
     * @throws Exception 抛出所有异常
     */
    public T get(String classMethod, T entity) throws Exception {
        return baseDao.get(classMethod, entity);
    }

    /**
     * 查询
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity      封装数据的实体
     * @return 返回查询结果
     * @throws Exception 抛出所有异常
     */
    public List<T> getAllList(String classMethod, T entity) throws Exception {
        return baseDao.getAllList(classMethod, entity);
    }

    /**
     * 查询数量
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity      封装数据的实体
     * @return 返回查询结果
     * @throws Exception 抛出所有异常
     */
    public int getCount(String classMethod, T entity) throws Exception {
        return baseDao.getCount(classMethod, entity);
    }

    @Override
    public String getSeq(String queryClassMethod) throws Exception {
        return baseDao.getStringResult(queryClassMethod);
    }

    @Override
    public boolean batchDeleteT(String classMethod, List<T> list)
            throws Exception {
        return baseDao.batchDeleteT(classMethod, list);
    }

    @Override
    public List<T> getAllListByIds(String classMethod, List<String> params) throws Exception {
        return baseDao.getAllListByIds(classMethod, params);
    }

    /**
     * 修改
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param params      封装数据的实体
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    @Override
    public boolean edit(String classMethod, Map<String, Object> params) throws Exception {
        return baseDao.bantchEdit(classMethod, params);
    }

    /**
     * 获取getColumn值
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @return Integer 生成的seq值
     * @throws Exception 抛出所有异常
     */
    @Override
    public String getColumn(String classMethod) throws Exception {
        return baseDao.getColumn(classMethod);
    }

    /**
     * 获取单个值 如sum、count等
     *
     * @param queryClassMethod queryClassMethod	mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity           查询条件实体
     * @return
     * @throws Exception
     */
    @Override
    public String getOneResult(String queryClassMethod, T entity) throws Exception {
        return baseDao.getOneResult(queryClassMethod, entity);
    }


    /**
     * 获取session 中username
     *
     * @return
     */
    public String getSessionUserName() {
//        return (String) ActionContext.getContext().getSession()
//                .get(Constants.SESSION_USERNAME);
    	return "";
    }

    public List<T> getSearchList(String classMethod, Map<String, Object> params) throws Exception {
        return baseDao.getSearchList(classMethod, params);
    }

    /**
     * 批量修改
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param list        要修改的对象数据集合
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public int batchUpdate(String classMethod, List<T> list) throws Exception {
        return baseDao.batchUpdate(classMethod, list);
    }

    /**
     * 批量修改
     *
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param list        要修改的String数据集合
     * @return 返回操作结果
     * @throws Exception 抛出所有异常
     */
    public int batchModify(String classMethod, List<String> list) throws Exception {
        return baseDao.batchModify(classMethod, list);
    }
}
