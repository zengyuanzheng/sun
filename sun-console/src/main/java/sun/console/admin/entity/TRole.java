package sun.console.admin.entity;

import javax.persistence.*;

/**
 * Created by sherlock on 2017-03-28.
 */
@Entity
@Table(name = "role", schema = "starter")
public class TRole {
    private String uuid;
    private String name;
    private String remark;
    private String createTime;
    private String createUserUuid;
    private String updateTime;
    private String updateUserUuid;
    private int state;

    @Id
    @Column(name = "uuid")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    @Basic
    @Column(name = "update_time")
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "update_user_uuid")
    public String getUpdateUserUuid() {
        return updateUserUuid;
    }

    public void setUpdateUserUuid(String updateUserUuid) {
        this.updateUserUuid = updateUserUuid;
    }

    @Basic
    @Column(name = "state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TRole tRole = (TRole) o;

        if (state != tRole.state) return false;
        if (uuid != null ? !uuid.equals(tRole.uuid) : tRole.uuid != null) return false;
        if (name != null ? !name.equals(tRole.name) : tRole.name != null) return false;
        if (remark != null ? !remark.equals(tRole.remark) : tRole.remark != null) return false;
        if (createTime != null ? !createTime.equals(tRole.createTime) : tRole.createTime != null) return false;
        if (createUserUuid != null ? !createUserUuid.equals(tRole.createUserUuid) : tRole.createUserUuid != null)
            return false;
        if (updateTime != null ? !updateTime.equals(tRole.updateTime) : tRole.updateTime != null) return false;
        if (updateUserUuid != null ? !updateUserUuid.equals(tRole.updateUserUuid) : tRole.updateUserUuid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserUuid != null ? createUserUuid.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserUuid != null ? updateUserUuid.hashCode() : 0);
        result = 31 * result + state;
        return result;
    }
}
