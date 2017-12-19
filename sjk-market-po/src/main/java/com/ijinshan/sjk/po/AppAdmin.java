package com.ijinshan.sjk.po;

// Generated 2013-3-29 14:49:30 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import com.ijinshan.sjk.po.marketmerge.ComparableBaseApp;

/**
 * App generated by hbm2java
 */
@Entity
@Table(name = "App", catalog = "AndroidMarket")
public class AppAdmin extends ComparableBaseApp implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String version;
    private int marketAppId;
    private String marketName;
    private String name;
    private String engName;
    private short catalog;
    private int subCatalog;
    private int size;
    private long freeSize;
    private String downloadUrl;
    private String logoUrl;
    private String description;
    private String updateInfo;
    private String publisherShortName;
    private Short minsdkversion;
    private long versionCode;
    private String osversion;
    private String pkname;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastFetchTime;
    private String detailUrl;
    private float price;
    private String screens;
    private String models;
    private String keywords;
    private float starRating;
    private int viewCount;
    private int downloadRank;
    private short supportpad;
    private String enumStatus;
    private String strImageUrls;
    private boolean auditCatalog;
    private boolean hidden;
    private String pageUrl;
    private String shortDesc;
    private String indexImgUrl;
    private String notice;
    private String officeHomepage;
    private String language;
    private boolean audit;
    private byte pathStatus;
    private String permissions;
    private String signatureSha1;
    private String officialSigSha1;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date apkScanTime;
    private String advertises;
    private String adActionTypes;
    private String adPopupTypes;
    private byte adRisk;
    private int realDownload;
    private int deltaDownload;
    private int lastDayDownload;
    private int lastDayDelta;
    private int lastWeekDownload;
    private int lastWeekDelta;
    private byte virusKind;
    private String virusBehaviors;
    private String virusName;
    private String md5;
    private int appId;
    private int apkId;
    private String logo1url;
    private int status;
    private boolean autoCover;
    private int auditStatus;

    public AppAdmin() {
    }

    public AppAdmin(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public AppAdmin(int marketAppId, String marketName, String name, short catalog, int subCatalog, int size,
            long freeSize, String downloadUrl, String logoUrl, String description, String publisherShortName,
            long versionCode, String osversion, String pkname, Date lastUpdateTime, Date lastFetchTime, float price,
            String keywords, float starRating, int viewCount, int downloadRank, short supportpad, String enumStatus,
            boolean auditCatalog, boolean hidden, String indexImgUrl, String language, boolean audit, byte pathStatus,
            byte adRisk, int realDownload, int deltaDownload, int lastDayDownload, int lastDayDelta,
            int lastWeekDownload, int lastWeekDelta, byte virusKind, int appId, int apkId, int status, boolean autoCover) {
        this.marketAppId = marketAppId;
        this.marketName = marketName;
        this.name = name;
        this.catalog = catalog;
        this.subCatalog = subCatalog;
        this.size = size;
        this.freeSize = freeSize;
        this.downloadUrl = downloadUrl;
        this.logoUrl = logoUrl;
        this.description = description;
        this.publisherShortName = publisherShortName;
        this.versionCode = versionCode;
        this.osversion = osversion;
        this.pkname = pkname;
        this.lastUpdateTime = lastUpdateTime;
        this.lastFetchTime = lastFetchTime;
        this.price = price;
        this.keywords = keywords;
        this.starRating = starRating;
        this.viewCount = viewCount;
        this.downloadRank = downloadRank;
        this.supportpad = supportpad;
        this.enumStatus = enumStatus;
        this.auditCatalog = auditCatalog;
        this.hidden = hidden;
        this.indexImgUrl = indexImgUrl;
        this.language = language;
        this.audit = audit;
        this.pathStatus = pathStatus;
        this.adRisk = adRisk;
        this.realDownload = realDownload;
        this.deltaDownload = deltaDownload;
        this.lastDayDownload = lastDayDownload;
        this.lastDayDelta = lastDayDelta;
        this.lastWeekDownload = lastWeekDownload;
        this.lastWeekDelta = lastWeekDelta;
        this.virusKind = virusKind;
        this.appId = appId;
        this.apkId = apkId;
        this.status = status;
        this.autoCover = autoCover;
    }

    public AppAdmin(int marketAppId, String marketName, String name, String engName, short catalog, int subCatalog,
            int size, long freeSize, String downloadUrl, String logoUrl, String description, String updateInfo,
            String publisherShortName, Short minsdkversion, long versionCode, String osversion, String pkname,
            Date lastUpdateTime, Date lastFetchTime, String detailUrl, float price, String screens, String models,
            String keywords, float starRating, int viewCount, int downloadRank, short supportpad, String enumStatus,
            String strImageUrls, boolean auditCatalog, boolean hidden, String pageUrl, String shortDesc,
            String indexImgUrl, String notice, String officeHomepage, String language, boolean audit, byte pathStatus,
            String permissions, String signatureSha1, String officialSigSha1, Date apkScanTime, String advertises,
            String adActionTypes, String adPopupTypes, byte adRisk, int realDownload, int deltaDownload,
            int lastDayDownload, int lastDayDelta, int lastWeekDownload, int lastWeekDelta, byte virusKind,
            String virusBehaviors, String virusName, String md5, int appId, int apkId, String logo1url, int status,
            boolean autoCover) {
        this.marketAppId = marketAppId;
        this.marketName = marketName;
        this.name = name;
        this.engName = engName;
        this.catalog = catalog;
        this.subCatalog = subCatalog;
        this.size = size;
        this.freeSize = freeSize;
        this.downloadUrl = downloadUrl;
        this.logoUrl = logoUrl;
        this.description = description;
        this.updateInfo = updateInfo;
        this.publisherShortName = publisherShortName;
        this.minsdkversion = minsdkversion;
        this.versionCode = versionCode;
        this.osversion = osversion;
        this.pkname = pkname;
        this.lastUpdateTime = lastUpdateTime;
        this.lastFetchTime = lastFetchTime;
        this.detailUrl = detailUrl;
        this.price = price;
        this.screens = screens;
        this.models = models;
        this.keywords = keywords;
        this.starRating = starRating;
        this.viewCount = viewCount;
        this.downloadRank = downloadRank;
        this.supportpad = supportpad;
        this.enumStatus = enumStatus;
        this.strImageUrls = strImageUrls;
        this.auditCatalog = auditCatalog;
        this.hidden = hidden;
        this.pageUrl = pageUrl;
        this.shortDesc = shortDesc;
        this.indexImgUrl = indexImgUrl;
        this.notice = notice;
        this.officeHomepage = officeHomepage;
        this.language = language;
        this.audit = audit;
        this.pathStatus = pathStatus;
        this.permissions = permissions;
        this.signatureSha1 = signatureSha1;
        this.officialSigSha1 = officialSigSha1;
        this.apkScanTime = apkScanTime;
        this.advertises = advertises;
        this.adActionTypes = adActionTypes;
        this.adPopupTypes = adPopupTypes;
        this.adRisk = adRisk;
        this.realDownload = realDownload;
        this.deltaDownload = deltaDownload;
        this.lastDayDownload = lastDayDownload;
        this.lastDayDelta = lastDayDelta;
        this.lastWeekDownload = lastWeekDownload;
        this.lastWeekDelta = lastWeekDelta;
        this.virusKind = virusKind;
        this.virusBehaviors = virusBehaviors;
        this.virusName = virusName;
        this.md5 = md5;
        this.appId = appId;
        this.apkId = apkId;
        this.logo1url = logo1url;
        this.status = status;
        this.autoCover = autoCover;
    }

    @Override
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    @Column(name = "Version", nullable = false, length = 125)
    public String getVersion() {
        return this.version;
    }

    @Override
    public void setVersion(String version) {
        this.version = version;
    }

    @Column(name = "MarketAppId", nullable = false)
    public int getMarketAppId() {
        return this.marketAppId;
    }

    public void setMarketAppId(int marketAppId) {
        this.marketAppId = marketAppId;
    }

    @Override
    @Column(name = "MarketName", nullable = false, length = 20)
    public String getMarketName() {
        return this.marketName;
    }

    @Override
    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    @Column(name = "Name", nullable = false, length = 80)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "EngName", length = 45)
    public String getEngName() {
        return this.engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    @Column(name = "Catalog", nullable = false)
    public short getCatalog() {
        return this.catalog;
    }

    public void setCatalog(short catalog) {
        this.catalog = catalog;
    }

    @Column(name = "SubCatalog", nullable = false)
    public int getSubCatalog() {
        return this.subCatalog;
    }

    public void setSubCatalog(int subCatalog) {
        this.subCatalog = subCatalog;
    }

    @Column(name = "Size", nullable = false)
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Column(name = "FreeSize", nullable = false)
    public long getFreeSize() {
        return this.freeSize;
    }

    public void setFreeSize(long freeSize) {
        this.freeSize = freeSize;
    }

    @Override
    @Column(name = "DownloadUrl", nullable = false, length = 200)
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Override
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Column(name = "LogoUrl", nullable = false, length = 200)
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @Column(name = "Description", nullable = false, length = 65535)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "UpdateInfo", length = 65535)
    public String getUpdateInfo() {
        return this.updateInfo;
    }

    public void setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
    }

    @Column(name = "PublisherShortName", nullable = false, length = 145)
    public String getPublisherShortName() {
        return this.publisherShortName;
    }

    public void setPublisherShortName(String publisherShortName) {
        this.publisherShortName = publisherShortName;
    }

    @Column(name = "Minsdkversion")
    public Short getMinsdkversion() {
        return this.minsdkversion;
    }

    public void setMinsdkversion(Short minsdkversion) {
        this.minsdkversion = minsdkversion;
    }

    @Override
    @Column(name = "VersionCode", nullable = false)
    public long getVersionCode() {
        return this.versionCode;
    }

    @Override
    public void setVersionCode(long versionCode) {
        this.versionCode = versionCode;
    }

    @Column(name = "OSVersion", nullable = false, length = 80)
    public String getOsversion() {
        return this.osversion;
    }

    public void setOsversion(String osversion) {
        this.osversion = osversion;
    }

    @Override
    @Column(name = "Pkname", nullable = false, length = 200)
    public String getPkname() {
        return this.pkname;
    }

    @Override
    public void setPkname(String pkname) {
        this.pkname = pkname;
    }

    @Override
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LastUpdateTime", nullable = false, length = 19)
    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @Override
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LastFetchTime", nullable = false, length = 19)
    public Date getLastFetchTime() {
        return this.lastFetchTime;
    }

    public void setLastFetchTime(Date lastFetchTime) {
        this.lastFetchTime = lastFetchTime;
    }

    @Column(name = "DetailUrl", length = 450)
    public String getDetailUrl() {
        return this.detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    @Column(name = "Price", nullable = false, precision = 5)
    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Column(name = "Screens", length = 200)
    public String getScreens() {
        return this.screens;
    }

    public void setScreens(String screens) {
        this.screens = screens;
    }

    @Column(name = "Models", length = 65535)
    public String getModels() {
        return this.models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    @Column(name = "Keywords", nullable = false, length = 65535)
    public String getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Column(name = "StarRating", nullable = false, precision = 3, scale = 1)
    public float getStarRating() {
        return this.starRating;
    }

    public void setStarRating(float starRating) {
        this.starRating = starRating;
    }

    @Column(name = "ViewCount", nullable = false)
    public int getViewCount() {
        return this.viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    @Column(name = "DownloadRank", nullable = false)
    public int getDownloadRank() {
        return this.downloadRank;
    }

    public void setDownloadRank(int downloadRank) {
        this.downloadRank = downloadRank;
    }

    @Column(name = "Supportpad", nullable = false)
    public short getSupportpad() {
        return this.supportpad;
    }

    public void setSupportpad(short supportpad) {
        this.supportpad = supportpad;
    }

    @Column(name = "EnumStatus", nullable = false, length = 6)
    public String getEnumStatus() {
        return this.enumStatus;
    }

    public void setEnumStatus(String enumStatus) {
        this.enumStatus = enumStatus;
    }

    @Column(name = "StrImageUrls", length = 65535)
    public String getStrImageUrls() {
        return this.strImageUrls;
    }

    public void setStrImageUrls(String strImageUrls) {
        this.strImageUrls = strImageUrls;
    }

    @Column(name = "AuditCatalog", nullable = false)
    public boolean isAuditCatalog() {
        return this.auditCatalog;
    }

    public void setAuditCatalog(boolean auditCatalog) {
        this.auditCatalog = auditCatalog;
    }

    @Column(name = "Hidden", nullable = false)
    public boolean isHidden() {
        return this.hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    @Column(name = "PageUrl", length = 450)
    public String getPageUrl() {
        return this.pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    @Column(name = "ShortDesc", length = 45)
    public String getShortDesc() {
        return this.shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    @Column(name = "IndexImgUrl", nullable = false, length = 200)
    public String getIndexImgUrl() {
        return this.indexImgUrl;
    }

    public void setIndexImgUrl(String indexImgUrl) {
        this.indexImgUrl = indexImgUrl;
    }

    @Column(name = "Notice", length = 65535)
    public String getNotice() {
        return this.notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Column(name = "OfficeHomepage")
    public String getOfficeHomepage() {
        return this.officeHomepage;
    }

    public void setOfficeHomepage(String officeHomepage) {
        this.officeHomepage = officeHomepage;
    }

    @Column(name = "Language", nullable = false, length = 10)
    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Column(name = "Audit", nullable = false)
    public boolean isAudit() {
        return this.audit;
    }

    public void setAudit(boolean audit) {
        this.audit = audit;
    }

    @Column(name = "PathStatus", nullable = false)
    public byte getPathStatus() {
        return this.pathStatus;
    }

    public void setPathStatus(byte pathStatus) {
        this.pathStatus = pathStatus;
    }

    @Column(name = "Permissions", length = 65535)
    public String getPermissions() {
        return this.permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    @Column(name = "SignatureSHA1", length = 40)
    public String getSignatureSha1() {
        return this.signatureSha1;
    }

    public void setSignatureSha1(String signatureSha1) {
        this.signatureSha1 = signatureSha1;
    }

    @Column(name = "OfficialSigSHA1", length = 40)
    public String getOfficialSigSha1() {
        return this.officialSigSha1;
    }

    public void setOfficialSigSha1(String officialSigSha1) {
        this.officialSigSha1 = officialSigSha1;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ApkScanTime", nullable = false, length = 19)
    public Date getApkScanTime() {
        return this.apkScanTime;
    }

    public void setApkScanTime(Date apkScanTime) {
        this.apkScanTime = apkScanTime;
    }

    @Column(name = "Advertises", length = 65535)
    public String getAdvertises() {
        return this.advertises;
    }

    public void setAdvertises(String advertises) {
        this.advertises = advertises;
    }

    @Column(name = "AdActionTypes", length = 45)
    public String getAdActionTypes() {
        return this.adActionTypes;
    }

    public void setAdActionTypes(String adActionTypes) {
        this.adActionTypes = adActionTypes;
    }

    @Column(name = "AdPopupTypes", length = 45)
    public String getAdPopupTypes() {
        return this.adPopupTypes;
    }

    public void setAdPopupTypes(String adPopupTypes) {
        this.adPopupTypes = adPopupTypes;
    }

    @Transient
    @Column(name = "AdRisk", nullable = false)
    public byte getAdRisk() {
        return this.adRisk;
    }

    public void setAdRisk(byte adRisk) {
        this.adRisk = adRisk;
    }

    @Column(name = "RealDownload", nullable = false)
    public int getRealDownload() {
        return this.realDownload;
    }

    public void setRealDownload(int realDownload) {
        this.realDownload = realDownload;
    }

    @Column(name = "DeltaDownload", nullable = false)
    public int getDeltaDownload() {
        return this.deltaDownload;
    }

    public void setDeltaDownload(int deltaDownload) {
        this.deltaDownload = deltaDownload;
    }

    @Transient
    @Column(name = "LastDayDownload", nullable = false)
    public int getLastDayDownload() {
        return this.lastDayDownload;
    }

    public void setLastDayDownload(int lastDayDownload) {
        this.lastDayDownload = lastDayDownload;
    }

    @Transient
    @Column(name = "LastDayDelta", nullable = false)
    public int getLastDayDelta() {
        return this.lastDayDelta;
    }

    public void setLastDayDelta(int lastDayDelta) {
        this.lastDayDelta = lastDayDelta;
    }

    @Transient
    @Column(name = "LastWeekDownload", nullable = false)
    public int getLastWeekDownload() {
        return this.lastWeekDownload;
    }

    public void setLastWeekDownload(int lastWeekDownload) {
        this.lastWeekDownload = lastWeekDownload;
    }

    @Transient
    @Column(name = "LastWeekDelta", nullable = false)
    public int getLastWeekDelta() {
        return this.lastWeekDelta;
    }

    public void setLastWeekDelta(int lastWeekDelta) {
        this.lastWeekDelta = lastWeekDelta;
    }

    @Column(name = "VirusKind", nullable = false)
    public byte getVirusKind() {
        return this.virusKind;
    }

    public void setVirusKind(byte virusKind) {
        this.virusKind = virusKind;
    }

    @Column(name = "VirusBehaviors", length = 65535)
    public String getVirusBehaviors() {
        return this.virusBehaviors;
    }

    public void setVirusBehaviors(String virusBehaviors) {
        this.virusBehaviors = virusBehaviors;
    }

    @Column(name = "VirusName")
    public String getVirusName() {
        return this.virusName;
    }

    public void setVirusName(String virusName) {
        this.virusName = virusName;
    }

    @Column(name = "Md5", length = 32)
    public String getMd5() {
        return this.md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Column(name = "AppId", nullable = false)
    public int getAppId() {
        return this.appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Column(name = "ApkId", nullable = false)
    public int getApkId() {
        return this.apkId;
    }

    public void setApkId(int apkId) {
        this.apkId = apkId;
    }

    @Column(name = "Logo1Url", length = 200)
    public String getLogo1url() {
        return this.logo1url;
    }

    public void setLogo1url(String logo1url) {
        this.logo1url = logo1url;
    }

    @Column(name = "Status", nullable = false)
    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Column(name = "AutoCover", nullable = false)
    public boolean isAutoCover() {
        return this.autoCover;
    }

    public void setAutoCover(boolean autoCover) {
        this.autoCover = autoCover;
    }

    @Transient
    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }

}
