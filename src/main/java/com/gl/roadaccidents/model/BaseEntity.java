package com.gl.roadaccidents.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by gavin on 16-5-13.
 */
public abstract class BaseEntity implements Serializable{

    private static final long serialVersionUID = 1079866250610374768L;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    private Long oid;
    private Date createAt;
    private Date updateAt;


}
