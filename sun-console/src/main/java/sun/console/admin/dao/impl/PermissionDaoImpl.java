package sun.console.admin.dao.impl;

import org.springframework.stereotype.Repository;
import sun.console.admin.dao.IPermissionDao;
import sun.console.admin.entity.TPermission;
import sun.console.admin.service.IPermissionService;
import sun.console.base.dao.impl.HibernateBaseDaoImpl;

/**
 * Created by sherlock on 2017-03-28.
 */
@Repository("permissionDao")
public class PermissionDaoImpl extends HibernateBaseDaoImpl<TPermission> implements IPermissionDao{
}
