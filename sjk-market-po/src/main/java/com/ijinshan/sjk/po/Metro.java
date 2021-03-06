package com.ijinshan.sjk.po;

// Generated 2013-3-28 14:03:03 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Metro generated by hbm2java
 */
@Entity
@Table(name = "Metro", catalog = "AndroidMarket")
public class Metro implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String type;
    private String pics;
    private boolean hidden;
    private String tabname;
    private String shortDesc;
    private String url;
    private Date time;
    private boolean deleted;
    private Date opTime;

    public Metro() {
    }

    public Metro(String name, String type, String pics, boolean hidden, String tabname, String shortDesc, String url,
            boolean deleted, Date opTime) {
        this.name = name;
        this.type = type;
        this.pics = pics;
        this.hidden = hidden;
        this.tabname = tabname;
        this.shortDesc = shortDesc;
        this.url = url;
        this.deleted = deleted;
        this.opTime = opTime;
    }

    public Metro(String name, String type, String pics, boolean hidden, String tabname, String shortDesc, String url,
            Date time, boolean deleted, Date opTime) {
        this.name = name;
        this.type = type;
        this.pics = pics;
        this.hidden = hidden;
        this.tabname = tabname;
        this.shortDesc = shortDesc;
        this.url = url;
        this.time = time;
        this.deleted = deleted;
        this.opTime = opTime;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "Name", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "Type", nullable = false, length = 2)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "Pics", nullable = false, length = 65535)
    public String getPics() {
        return this.pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    @Column(name = "Hidden", nullable = false)
    public boolean isHidden() {
        return this.hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    @Column(name = "Tabname", nullable = false, length = 10)
    public String getTabname() {
        return this.tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname;
    }

    @Column(name = "ShortDesc", nullable = false, length = 200)
    public String getShortDesc() {
        return this.shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    @Column(name = "Url", nullable = false, length = 200)
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Time", length = 10)
    public Date getTime() {
        return this.time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Column(name = "Deleted", nullable = false)
    public boolean isDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "OpTime", nullable = false, length = 19)
    public Date getOpTime() {
        return this.opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

}
