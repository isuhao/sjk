package com.ijinshan.sjk.po;

// Generated 2013-3-28 14:03:03 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * MoTag generated by hbm2java
 */
@Entity
@Table(name = "Mo_Tag", catalog = "AndroidMarket", uniqueConstraints = @UniqueConstraint(columnNames = { "Catalog",
        "Name" }))
public class MoTag implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String tagDesc;
    private int pid;
    private short catalog;
    private short tagType;
    private String imgUrl = "";
    private int rank;

    private String bigPics;
    private String mediumPics;
    private String smallPics;

    public MoTag() {
    }

    public MoTag(String name, String tagDesc, int pid, short catalog, short tagType, String imgUrl, int rank) {
        this.name = name;
        this.tagDesc = tagDesc;
        this.pid = pid;
        this.catalog = catalog;
        this.tagType = tagType;
        this.imgUrl = imgUrl;
        this.rank = rank;
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

    @Column(name = "Name", nullable = false, length = 20)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "TagDesc", nullable = false, length = 100)
    public String getTagDesc() {
        return this.tagDesc;
    }

    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc;
    }

    @Column(name = "PId", nullable = false)
    public int getPid() {
        return this.pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Column(name = "Catalog", nullable = false)
    public short getCatalog() {
        return this.catalog;
    }

    public void setCatalog(short catalog) {
        this.catalog = catalog;
    }

    @Column(name = "TagType", nullable = false)
    public short getTagType() {
        return this.tagType;
    }

    public void setTagType(short tagType) {
        this.tagType = tagType;
    }

    @Column(name = "ImgUrl", nullable = false, length = 200)
    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        if (imgUrl == null) {
            return;
        }
        this.imgUrl = imgUrl;
    }

    @Column(name = "Rank", nullable = false)
    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Column(name = "BigPics")
    public String getBigPics() {
        return bigPics;
    }

    public void setBigPics(String bigPics) {
        this.bigPics = bigPics;
    }

    @Column(name = "MediumPics")
    public String getMediumPics() {
        return mediumPics;
    }

    public void setMediumPics(String mediumPics) {
        this.mediumPics = mediumPics;
    }

    @Column(name = "SmallPics")
    public String getSmallPics() {
        return smallPics;
    }

    public void setSmallPics(String smallPics) {
        this.smallPics = smallPics;
    }
}
