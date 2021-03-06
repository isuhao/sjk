package com.ijinshan.sjk.po;

// Generated 2013-3-28 14:03:03 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * AppAndTag generated by hbm2java
 */
@Entity
@Table(name = "AppAndTag", catalog = "AndroidMarket")
public class AppAndTag implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private int appId;
    private int tagId;
    private Integer rank;
    private String tagName;
    private short tagType;
    private transient Tag tag;
    private App app;

    public AppAndTag() {
    }

    public AppAndTag(int appId, int tagId, String tagName, short tagType) {
        this.appId = appId;
        this.tagId = tagId;
        this.tagName = tagName;
        this.tagType = tagType;
    }

    public AppAndTag(int appId, int tagId, Integer rank, String tagName, short tagType) {
        this.appId = appId;
        this.tagId = tagId;
        this.rank = rank;
        this.tagName = tagName;
        this.tagType = tagType;
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

    @Transient
    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    @Column(name = "AppId", nullable = false)
    public int getAppId() {
        return this.appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Column(name = "TagId", nullable = false)
    public int getTagId() {
        return this.tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    @Column(name = "Rank")
    public Integer getRank() {
        return this.rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Column(name = "TagName", nullable = false, length = 20)
    public String getTagName() {
        return this.tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Column(name = "TagType", nullable = false)
    public short getTagType() {
        return this.tagType;
    }

    public void setTagType(short tagType) {
        this.tagType = tagType;
    }

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Tag.class)
    @JoinColumn(name = "TagId", nullable = false, insertable = false, updatable = false)
    // FK
    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

}
