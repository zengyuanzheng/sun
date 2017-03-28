package sun.console.admin.dao.impl;

import org.springframework.stereotype.Repository;
import sun.console.admin.dao.IRoleDao;
import sun.console.admin.entity.TRole;
import sun.console.base.dao.impl.HibernateBaseDaoImpl;

/**
 * Created by sherlock on 2017-03-28.
 */
@Repository("roleDao")
public class RoleDaoImpl extends HibernateBaseDaoImpl<TRole> implements IRoleDao {
}
