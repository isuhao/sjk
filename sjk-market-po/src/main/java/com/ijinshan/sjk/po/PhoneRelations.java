package com.ijinshan.sjk.po;

// Generated 2012-7-4 12:05:31 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PhoneRelations generated by hbm2java
 */
@Entity
@Table(name = "PhoneRelations", catalog = "AndroidMarket")
public class PhoneRelations implements java.io.Serializable {

    private static final long serialVersionUID = 3066049940871205363L;
    private Integer id;
    private String productId = "";
    private String vid = "";
    private String pids = "";
    private String names = "";
    private String models = "";
    private String defaultproduct = "";
    private byte cpu;
    private transient PhoneBasicInfo phoneBasicInfo;

    public PhoneRelations() {
    }

    @Override
    public String toString() {
        return "PhoneRelations [id=" + id + ", productId=" + productId + ", vid=" + vid + ", pids=" + pids + ", names="
                + names + ", models=" + models + ", defaultproduct=" + defaultproduct + "]";
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

    @Column(name = "ProductId", nullable = false, length = 20)
    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Column(name = "VID", nullable = false, length = 10)
    public String getVid() {
        return this.vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    /**
     * @return the pids
     */
    @Column(name = "Pids", nullable = true, length = 600)
    public String getPids() {
        return pids;
    }

    /**
     * @param pids
     *            the pids to set
     */
    public void setPids(String pids) {
        this.pids = pids;
    }

    /**
     * @return the names
     */
    @Column(name = "Names", nullable = true, length = 600)
    public String getNames() {
        return names;
    }

    /**
     * @param names
     *            the names to set
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * @return the models
     */
    @Column(name = "Models", nullable = true, length = 600)
    public String getModels() {
        return models;
    }

    /**
     * @param models
     *            the models to set
     */
    public void setModels(String models) {
        this.models = models;
    }

    /**
     * @return the defaultproduct
     */
    @Column(name = "DefaultProduct", nullable = false, length = 20)
    public String getDefaultproduct() {
        return defaultproduct;
    }

    /**
     * @param defaultproduct
     *            the defaultproduct to set
     */
    public void setDefaultproduct(String defaultproduct) {
        this.defaultproduct = defaultproduct;
    }

    @Column(name = "Cpu")
    public byte getCpu() {
        return cpu;
    }

    public void setCpu(byte cpu) {
        this.cpu = cpu;
    }

    /**
     * @return the phoneBasicInfo
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PhoneId", nullable = false)
    public PhoneBasicInfo getPhoneBasicInfo() {
        return phoneBasicInfo;
    }

    /**
     * @param phoneBasicInfo
     *            the phoneBasicInfo to set
     */
    public void setPhoneBasicInfo(PhoneBasicInfo phoneBasicInfo) {
        this.phoneBasicInfo = phoneBasicInfo;
    }

}
