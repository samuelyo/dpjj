package main.java.com.core.baseService;

import java.util.List;

public interface BaseService<T, PK> {
	 /**
     * 插入数据
     */
    boolean insert(T entity);
    /**
     * 根据实体删除数据
     */
    boolean delete(T entity);
    /**
     * 根据ID删除数据
     */
    boolean deleteById(PK id);
    /**
     * 修改数据
     */
    boolean update(T entity);
    /**
     * 查询所有数据
     */
    List<T> findAll();
    /**
     * 根据ID查询数据
     */
    T findById(PK id);
    /**
     * 根据当前页查询数据
     */
    List<T> findNowPageInfo(int nowpage, int pagesize,String sortName,String sortOrder);
    /**
     * 返回总页数
     */
    Integer getCountPage(int pagesize);
    /**
     * 批量删除
     */
    boolean deletes(Object ids[]);
}
