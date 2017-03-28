package sun.console.base.dao;

import java.util.List;

/**
 * Created by sherlock on 2017-03-28.
 */
public interface IRedisDao {
    public void delete(byte[] key);
    public void delete(String key);
    public void set(byte[] key,byte[] value,int liveTime);
    public void set(String key,String value,int liveTime);
    public void set(String key,String value);


}
