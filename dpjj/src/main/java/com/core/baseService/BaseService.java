package main.java.com.core.baseService;

import java.util.List;

public interface BaseService<T, PK> {
	 /**
     * ��������
     */
    boolean insert(T entity);
    /**
     * ����ʵ��ɾ������
     */
    boolean delete(T entity);
    /**
     * ����IDɾ������
     */
    boolean deleteById(PK id);
    /**
     * �޸�����
     */
    boolean update(T entity);
    /**
     * ��ѯ��������
     */
    List<T> findAll();
    /**
     * ����ID��ѯ����
     */
    T findById(PK id);
    /**
     * ���ݵ�ǰҳ��ѯ����
     */
    List<T> findNowPageInfo(int nowpage, int pagesize,String sortName,String sortOrder);
    /**
     * ������ҳ��
     */
    Integer getCountPage(int pagesize);
    /**
     * ����ɾ��
     */
    boolean deletes(Object ids[]);
}
