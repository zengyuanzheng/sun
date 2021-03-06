package sun.console.admin.entity;

import javax.persistence.*;

/**
 * Created by sherlock on 2017-03-28.
 */
@Entity
@Table(name = "user_role", schema = "starter")
public class TUserRole {
    private String uuid;
    private String userUuid;
    private String roleUuid;
    private String createTime;
    private String createUserUuid;

    @Id
    @Column(name = "uuid")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "user_uuid")
    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    @Basic
    @Column(name = "role_uuid")
    public String getRoleUuid() {
        return roleUuid;
    }

    public void setRoleUuid(String roleUuid) {
        this.roleUuid = roleUuid;
    }

    @Basic
    @Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "create_user_uuid")
    public String getCreateUserUuid() {
        return createUserUuid;
    }

    public void setCreateUserUuid(String createUserUuid) {
        this.createUserUuid = createUserUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUserRole tUserRole = (TUserRole) o;

        if (uuid != null ? !uuid.equals(tUserRole.uuid) : tUserRole.uuid != null) return false;
        if (userUuid != null ? !userUuid.equals(tUserRole.userUuid) : tUserRole.userUuid != null) return false;
        if (roleUuid != null ? !roleUuid.equals(tUserRole.roleUuid) : tUserRole.roleUuid != null) return false;
        if (createTime != null ? !createTime.equals(tUserRole.createTime) : tUserRole.createTime != null) return false;
        if (createUserUuid != null ? !createUserUuid.equals(tUserRole.createUserUuid) : tUserRole.createUserUuid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (userUuid != null ? userUuid.hashCode() : 0);
        result = 31 * result + (roleUuid != null ? roleUuid.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserUuid != null ? createUserUuid.hashCode() : 0);
        return result;
    }
}
