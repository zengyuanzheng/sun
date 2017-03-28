package sun.console.admin.dao.impl;

import org.springframework.stereotype.Repository;
import sun.console.admin.dao.IUserDao;
import sun.console.admin.entity.TUser;
import sun.console.base.dao.impl.HibernateBaseDaoImpl;

/**
 * Created by sherlock on 2017-03-28.
 */
@Repository("userDao")
public class UserDaoImpl extends HibernateBaseDaoImpl<TUser> implements IUserDao {
}
