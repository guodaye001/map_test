package com.map.platform.commons.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.map.platform.commons.dao.BaseDao;
import com.map.platform.commons.bean.BaseModel;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * Dao基类实现类封装CRUD方法
 * @author Guosw
 * 2016年4月17日23:06:59
 */
@Repository("baseDao")
public class BaseDaoImpl<T extends BaseModel> extends SqlSessionDaoSupport implements BaseDao<T> {
	protected Logger log = LoggerFactory.getLogger(BaseDaoImpl.class);
	@Resource  
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
        super.setSqlSessionFactory(sqlSessionFactory);  
    }
	
	/**
	 * 增加
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @param entity 封装数据的实体
	 * @return 返回操作结果
	 * @throws Exception 抛出所有异常
	 */
	public boolean add(String classMethod, T entity) throws Exception {
		boolean flag = false;
		try {
			//此处可以加一个判断是否输出实体属性的判断
			/*
            if("0".equals(Constants.SYSTEM_RUN_MODEL)) {
                ObjectUtils.printObjectValue(entity);
            }
            */
            int result  = this.getSqlSession().insert(classMethod, entity);
            log.info("dao add!"+classMethod + " result=" + result);
            flag = result > 0 ? true : false;
		} catch (Exception e) {
			flag = false;
			log.error("dao add:",e);
			throw e;
		}
		return flag;
	}

	/**
	 * 修改
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @param entity 封装数据的实体
	 * @return 返回操作结果
	 * @throws Exception 抛出所有异常
	 */
	public boolean edit(String classMethod, T entity) throws Exception {
		boolean flag = false;
		try {
            int result = this.getSqlSession().update(classMethod, entity);
			flag = result > 0 ? true : false;
            log.info("dao edit!"+classMethod + " result=" + result);
		} catch (Exception e) {
			log.error("dao edit:",e);
			throw e;
		}
		return flag;
	}
	
	/**
	 * 以id为条件查找对象
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @param entity 封装数据的实体
	 * @return 返回查询结果
	 * @throws Exception 抛出所有异常
	 */
	@SuppressWarnings("unchecked")
	public T get(String classMethod, T entity) throws Exception {
		T result = null;
		try {
			result = (T) this.getSqlSession().selectOne(classMethod, entity);
            log.info("dao get!"+classMethod + " result=" + (result == null ? 0 : 1));
		} catch (Exception e) {
			log.error("dao get:",e);
			throw e;
		}
		return result;
	}

	/**
	 * 删除
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @param entity 封装数据的实体
	 * @return 返回操作结果
	 * @throws Exception 抛出所有异常
	 */
	public boolean remove(String classMethod, T entity) throws Exception {
		boolean flag = false;
		try {
            int result = this.getSqlSession().delete(classMethod, entity);
            log.info("dao remvoe!"+classMethod + " result=" + result);
			flag = result > 0 ? true : false;
		} catch (Exception e) {
			flag = false;
			log.error("dao remvoe:",e);
			throw e;
		}
		return flag;
	}
	
	/**
	 * 批量删除
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @param list 要删除的数据集合
	 * @return 返回操作结果
	 * @throws Exception 抛出所有异常
	 */
	public boolean batchDelete(String classMethod,List<String>list) throws Exception{
		boolean flag = false;
		try {
            int result = this.getSqlSession().delete(classMethod,list);
            log.info("dao batchDelete!"+classMethod + " result=" + result);
			flag = result > 0 ? true : false;
		} catch (Exception e) {
			flag = false;
			log.error("dao batchDelete:",e);
			throw e;
		}
		log.debug("flag:" + flag);
		return flag;
	}
	
	
	/**
	 * 批量增加
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @param list 要增加的数据集合
	 * @return 返回操作结果
	 * @throws Exception  抛出所有异常
	 */
	public boolean batchAdd(String classMethod,List<T>list) throws Exception{
		boolean flag = false;
		try {
			for (T t : list) {
                int result = this.getSqlSession().insert(classMethod,t);
                log.info("dao batchAdd!"+classMethod + " result=" + result);
				flag = result > 0 ? true : false;
			}
		} catch (Exception e) {
			flag = false;
			log.error("dao batchAdd:",e);
			throw e;
		}
		log.debug("flag:" + flag);
		return flag;
	}

	/**
	 * 查询
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @return 返回查询结果
	 * @throws Exception 抛出所有异常
	 */
	public List<T> getAllList(String classMethod) throws Exception {
		List<T> result = null;
		try {
			result = this.getSqlSession().selectList(classMethod);
            log.info("dao getAllList!"+classMethod + " size=" + result.size());
		} catch (Exception e) {
			log.error("dao getAllList:",e);
			throw e;
		}
		return result;
	}

    /**
     * 查询
     * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity 封装数据的实体
     * @return 返回查询结果
     * @throws Exception 抛出所有异常
     */
    public List<T> getAllList(String classMethod, T entity) throws Exception {
        List<T> result = null;
        try {
            result = this.getSqlSession().selectList(classMethod,entity);
            log.info("dao getAllList!"+classMethod + " size=" + result.size());
        } catch (Exception e) {
            log.error("dao getAllList:",e);
            throw e;
        }
        return result;
    }

	/**
	 * 查询 -单个String 查询所有 如in ids 
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @param params 封装数据的实体
	 * @return 返回查询结果
	 * @throws Exception 抛出所有异常
	 */
	public List<T> getAllListByIds(String classMethod, List<String> params) throws Exception {
		List<T> result=null;
		try {
			result = this.getSqlSession().selectList(classMethod,params);

            log.info("dao getAllList!"+classMethod + " size=" + result.size());
		} catch (Exception e) {
			log.error("dao getAllList:",e);
			throw e;
		}
		return result;
	}
	
	/**
	 * 查询数量
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @param entity 封装数据的实体
	 * @return 返回查询结果
	 * @throws Exception 抛出所有异常
	 */
	public int getCount(String classMethod, T entity) throws Exception {
		int result = 0;
		try {
			result = (Integer) this.getSqlSession().selectOne(classMethod,entity);
			log.debug("dao getCount!" + classMethod + " result:" + result);
		} catch (Exception e) {
			log.error("dao getCount:",e);
			throw e;
		}
		return result;
	}

	@Override
	public String getStringResult(String classMethod) throws Exception {
		log.info("dao getStringResult!"+classMethod);
		String result = null;
		try {
			result = (String)this.getSqlSession().selectOne(classMethod);
		} catch (Exception e) {
			log.error("dao getStringResult:",e);
			throw e;
		}finally{
			this.getSqlSession().clearCache();
		}
		return result;
	}

    @Override
    public Integer getIntResult(String classMethod) throws Exception {
        log.info("dao getStringResult!"+classMethod);
        Integer result = null;
        try {
            result = (Integer)this.getSqlSession().selectOne(classMethod);
        } catch (Exception e) {
            log.error("dao getStringResult:",e);
            throw e;
        }finally{
            this.getSqlSession().clearCache();
        }
        return result;
    }

    @Override
    public Integer getIntResult(String classMethod, Object obj) throws Exception {
        log.info("dao getStringResult!"+classMethod);
        Integer result = null;
        try {
            result = (Integer)this.getSqlSession().selectOne(classMethod, obj);
        } catch (Exception e) {
            log.error("dao getStringResult:",e);
            throw e;
        }finally{
            this.getSqlSession().clearCache();
        }
        return result;
    }

    @Override
	public String getColumn(String classMethod) throws Exception {
		log.info("dao getColumn!"+classMethod);
		String result = null;
		try {
			result = (String)this.getSqlSession().selectOne(classMethod);
		} catch (Exception e) {
			log.error("dao getColumn:",e);
			throw e;
		} finally{
			this.getSqlSession().clearCache();
		}
		return result;
	}
	
	@Override
	public boolean batchDeleteT(String classMethod, List<T> list)
			throws Exception {
		boolean flag = false;
		try {
            int result = this.getSqlSession().delete(classMethod,list);
            log.info("dao batchDeleteT!"+classMethod + " result=" + result);
			flag = result > 0 ? true : false;
		} catch (Exception e) {
			flag = false;
			log.error("dao batchDeleteT:",e);
			throw e;
		}
		log.debug("flag:" + flag);
		return flag;
	}
	/**
	 * 获取单个值 如sum、count等
	 * @param classMethod  classMethod	mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @param entity 查询条件实体
	 * @return
	 * @throws Exception
	 */
	@Override
	public String getOneResult(String classMethod,T entity) throws Exception{
		String result = null;
		try {
			result = (String)this.getSqlSession().selectOne(classMethod,entity);
		} catch (Exception e) {
			log.error("dao getOneResult:",e);
			throw e;
		}
		log.debug("result:" + result);
		return result;
	}

    /**
     * 获取单个值 如sum、count等
     * @param classMethod  classMethod	mybatis配置文件里面对应的命名空间+要执行的sql语句id
     * @param entity 查询条件实体
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	@Override
    public T getOneObject(String classMethod,T entity) throws Exception{
        Object result;
        try {
            result = this.getSqlSession().selectOne(classMethod,entity);
        } catch (Exception e) {
            log.error("dao getOneResult:",e);
            throw e;
        }
        return (T) result;
    }
	
	/**
	 * 获取map集合
	 * @param classMethod  classMethod	mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @return
	 * @throws Exception
	 */
	@Override
	public Map<String, Object> getMap(String classMethod,Map<String, Object> map) throws Exception {
		log.info("dao getMap!"+classMethod);
		try {
			this.getSqlSession().selectList(classMethod, map);
		} catch (Exception e) {
			log.error("dao getMap:",e);
			throw e;
		}
		return map;
	}
	/**
	 * 获取对象 
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @return 返回查询结果
	 * @throws Exception 抛出所有异常
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T get(String classMethod,String param) throws Exception{
		log.info("dao get!"+classMethod);
		T result = null;
		try {
			result = (T)this.getSqlSession().selectOne(classMethod, param);
		} catch (Exception e) {
			log.error("dao get:",e);
			throw e;
		}
		return result;
	}
	/**
	 * 批量更新
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @return 返回操作结果
	 * @throws Exception 抛出所有异常
	 */
	public boolean bantchEdit(String classMethod,Map<String,Object> maps) throws Exception{
		boolean flag = false;
		try {
            int result = this.getSqlSession().update(classMethod, maps);
            log.info("dao edit!"+classMethod + " result=" + result);
			flag = result > 0 ? true : false;
		} catch (Exception e) {
			flag = false;
			log.error("dao edit:",e);
			throw e;
		}
		log.debug("flag:" + flag);
		return flag;
	}
	
	/**
	 * 查询
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @return 返回查询结果
	 * @throws Exception 抛出所有异常
	 */
	public List<T> getSearchList(String classMethod, Map<String, Object> params) throws Exception {
		List<T> result=null;
		try {
			result = this.getSqlSession().selectList(classMethod,params);
            log.info("dao getSearchList!"+classMethod + " size=" + result.size());
		} catch (Exception e) {
			log.error("dao getSearchList:",e);
			throw e;
		}
		return result;
	}
	/**
	 * 批量修改
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @throws Exception 抛出所有异常
	 */
	@Override
	public int batchUpdate(String classMethod, List<T> list) throws Exception {
		int flag = 0;
		try {
            if(list == null || list.size() == 0) {
                return 0;
            }
			flag = this.getSqlSession().update(classMethod,list);
            log.info("dao batchUpdate!"+classMethod + " result=" + flag);
        } catch (Exception e) {
			log.error("dao batchUpdate:",e);
			throw e;
		}
		return flag;
	}
	/**
	 * 批量修改
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @throws Exception 抛出所有异常
	 */
	@Override
	public int batchModify(String classMethod, List<String> list) throws Exception {
		int flag = 0;
		try {
            if(list == null || list.size() == 0) {
                return 0;
            }
			flag = this.getSqlSession().update(classMethod,list);
            log.info("dao batchModify!"+classMethod + " result:" + flag);
        } catch (Exception e) {
			log.error("dao batchModify:",e);
			throw e;
		}
		return flag;
	}
	
	/**
	 * 批量修改
	 * @param classMethod mybatis配置文件里面对应的命名空间+要执行的sql语句id
	 * @return 返回操作结果
	 * @throws Exception 抛出所有异常
	 * 
	 */
	public boolean batchUpdateByMap(String classMethod,
			Map<String, Object> params) throws Exception {
		log.info("dao batchUpdate!"+classMethod);
		boolean flag = false;
		int result = 0;
		try {
			result = this.getSqlSession().update(classMethod,params);
			flag = result > 0 ? true : false;
		} catch (Exception e) {
			flag = false;
			log.error("dao batchUpdate:",e);
			throw e;
		}
		log.debug("result:" + result);
		return flag;
	}

	@Override
	public List<T> getSearchListByObj(String classMethod, Object obj) throws Exception {
		List<T> result=null;
		try {
			result = this.getSqlSession().selectList(classMethod,obj);
            log.info("dao getSearchList!"+classMethod + " size=" + result.size());
		} catch (Exception e) {
			log.error("dao getSearchList:",e);
			throw e;
		}
		return result;
	}
}
