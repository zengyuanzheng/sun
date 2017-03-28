package sun.console.admin.dao.impl;

import org.springframework.stereotype.Repository;
import sun.console.admin.dao.IUserRoleDao;
import sun.console.admin.entity.TUserRole;
import sun.console.base.dao.impl.HibernateBaseDaoImpl;

/**
 * Created by sherlock on 2017-03-28.
 */
@Repository("userRoleDao")
public class UserRoleDaoImpl extends HibernateBaseDaoImpl<TUserRole> implements IUserRoleDao {
}
