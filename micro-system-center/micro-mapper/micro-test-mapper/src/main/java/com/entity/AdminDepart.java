package com.entity;

import java.io.Serializable;
import java.util.Date;

public class AdminDepart implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table admin_depart
     *
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_depart.depart_id
     *
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    private Integer departId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_depart.parent
     *
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    private String parent;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_depart.name
     *
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    private String name;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_depart.type
     *
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    private Byte type;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_depart.create_time
     *
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    private Date createTime;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_depart.update_time
     *
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_depart.depart_id
     *
     * @return the value of admin_depart.depart_id
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    public Integer getDepartId() {
        return departId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_depart.depart_id
     *
     * @param departId the value for admin_depart.depart_id
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_depart.parent
     *
     * @return the value of admin_depart.parent
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    public String getParent() {
        return parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_depart.parent
     *
     * @param parent the value for admin_depart.parent
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_depart.name
     *
     * @return the value of admin_depart.name
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_depart.name
     *
     * @param name the value for admin_depart.name
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_depart.type
     *
     * @return the value of admin_depart.type
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_depart.type
     *
     * @param type the value for admin_depart.type
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_depart.create_time
     *
     * @return the value of admin_depart.create_time
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_depart.create_time
     *
     * @param createTime the value for admin_depart.create_time
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_depart.update_time
     *
     * @return the value of admin_depart.update_time
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_depart.update_time
     *
     * @param updateTime the value for admin_depart.update_time
     * @mbggenerated Thu Jun 01 15:52:36 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}