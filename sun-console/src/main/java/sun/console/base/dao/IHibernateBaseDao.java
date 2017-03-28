package sun.console.base.dao;

import sun.console.util.UPageBeanUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by sherlock on 2017-03-28.
 * hibernate BaseDao基类
 */
public interface IHibernateBaseDao<T> {

    /**
     * 保存对象
     * @param table
     */
    public void save(T table);

    /**
     * 保存或更新对象
     * @param table
     */
    public void saveOrUpdate(T table);

    /**
     * 查找实体对象
     * @param uuid
     * @return
     */
    public T get(String uuid);

    /**
     * 删除对象
     * @param table
     */
    public void delete(T table);

    /**
     * 根据UUID删除对象
     * @param uuid
     */
    public boolean deleteByPK(String uuid);

    /**
     * 执行Hql语句(不能使用查询语句)
     * @param hql
     * @param values
     */
    public void executeHql(String hql,Object... values);

    /**
     * 执行Sql语句(不能使用查询语句)
     * @param sql
     * @param values
     */
    public void executeSql(String sql,Object... values);

    /**
     * 根据Hql查找唯一实体
     * @param hql
     * @param values
     * @return
     */
    public T getByHql(String hql,Object... values);

    /**
     * 根据Hql查找列表
     * @param hql
     * @param values
     * @return
     */
    public List<T> getListByHql(String hql, Object... values);

    /**
     * 根据Sql查找唯一实体
     * @param sql
     * @param values
     * @return
     */
    public Map getBySql(String sql, Object... values);

    /**
     * 根据Sql查找列表
     * @param sql
     * @param values
     * @return
     */
    public List<Map> getListBySql(String sql,Object... values);

    /**
     * 刷新对象
     * 强制发送select语句，以使session缓存中对象的状态和数据表中对应的记录保持一致
     * @param table
     */
    public void refresh(T table);

    /**
     * 修改对象
     * @param table
     */
    public void update(T table);

    /**
     * 根据Hql语句得到记录数
     * @param hql
     * @param values
     * @return
     */
    public Long countByHql(String hql,Object... values);

    /**
     * 分页
     * @param hql
     * @param countHql
     * @param pageNo
     * @param pageSize
     * @param values
     * @return
     */
    public UPageBeanUtil findPageByFetchedHql(String hql, String countHql, int pageNo, int pageSize, Object... values);
}
