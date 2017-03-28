package sun.console.admin.dao.impl;

import org.springframework.stereotype.Repository;
import sun.console.admin.dao.IRolePermissionDao;
import sun.console.admin.entity.TRolePermission;
import sun.console.base.dao.impl.HibernateBaseDaoImpl;

/**
 * Created by sherlock on 2017-03-28.
 */
@Repository("rolePermissionDao")
public class RolePermissionDaoImpl extends HibernateBaseDaoImpl<TRolePermission> implements IRolePermissionDao {
}
