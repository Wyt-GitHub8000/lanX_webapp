package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 mcn_games
 * 
 * @author ruoyi
 * @date 2020-11-11
 */
public class McnGames extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 应用id */
    @Excel(name = "应用id")
    private String appId;

    /** 应用名称 */
    @Excel(name = "应用名称")
    private String appName;

    /** 应用头像 */
    @Excel(name = "应用头像")
    private String appIcon;

    /** 标题名称 */
    @Excel(name = "标题名称")
    private String title;

    /** 概要描述 */
    @Excel(name = "概要描述")
    private String summary;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 游戏厂商 */
    @Excel(name = "游戏厂商")
    private String factory;

    /** 安卓下载地址 */
    @Excel(name = "安卓下载地址")
    private String andoridUrl;

    /** 苹果下载地址 */
    @Excel(name = "苹果下载地址")
    private String appleUrl;

    /** 体验地址 */
    @Excel(name = "体验地址")
    private String experieUrl;

    /** 安装包大小 */
    @Excel(name = "安装包大小")
    private String appSize;

    /** 版本 */
    @Excel(name = "版本")
    private String appVersion;

    /** 更新时间 */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date appUpdatedAt;

    /** 状态 0未审核 1 通过 2 不通过 */
    @Excel(name = "状态 0未审核 1 通过 2 不通过")
    private Integer status;

    /** 封面图 */
    @Excel(name = "封面图")
    private String appCover;

    /** 游戏宣传图 */
    @Excel(name = "游戏宣传图")
    private String gameCover;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 更新时间 */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedAt;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setAppId(String appId) 
    {
        this.appId = appId;
    }

    public String getAppId() 
    {
        return appId;
    }
    public void setAppName(String appName) 
    {
        this.appName = appName;
    }

    public String getAppName() 
    {
        return appName;
    }
    public void setAppIcon(String appIcon) 
    {
        this.appIcon = appIcon;
    }

    public String getAppIcon() 
    {
        return appIcon;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setSummary(String summary) 
    {
        this.summary = summary;
    }

    public String getSummary() 
    {
        return summary;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setFactory(String factory) 
    {
        this.factory = factory;
    }

    public String getFactory() 
    {
        return factory;
    }
    public void setAndoridUrl(String andoridUrl) 
    {
        this.andoridUrl = andoridUrl;
    }

    public String getAndoridUrl() 
    {
        return andoridUrl;
    }
    public void setAppleUrl(String appleUrl) 
    {
        this.appleUrl = appleUrl;
    }

    public String getAppleUrl() 
    {
        return appleUrl;
    }
    public void setExperieUrl(String experieUrl) 
    {
        this.experieUrl = experieUrl;
    }

    public String getExperieUrl() 
    {
        return experieUrl;
    }
    public void setAppSize(String appSize) 
    {
        this.appSize = appSize;
    }

    public String getAppSize() 
    {
        return appSize;
    }
    public void setAppVersion(String appVersion) 
    {
        this.appVersion = appVersion;
    }

    public String getAppVersion() 
    {
        return appVersion;
    }
    public void setAppUpdatedAt(Date appUpdatedAt) 
    {
        this.appUpdatedAt = appUpdatedAt;
    }

    public Date getAppUpdatedAt() 
    {
        return appUpdatedAt;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setAppCover(String appCover) 
    {
        this.appCover = appCover;
    }

    public String getAppCover() 
    {
        return appCover;
    }
    public void setGameCover(String gameCover) 
    {
        this.gameCover = gameCover;
    }

    public String getGameCover() 
    {
        return gameCover;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }
    public void setUpdatedAt(Date updatedAt) 
    {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() 
    {
        return updatedAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("appId", getAppId())
            .append("appName", getAppName())
            .append("appIcon", getAppIcon())
            .append("title", getTitle())
            .append("summary", getSummary())
            .append("description", getDescription())
            .append("factory", getFactory())
            .append("andoridUrl", getAndoridUrl())
            .append("appleUrl", getAppleUrl())
            .append("experieUrl", getExperieUrl())
            .append("appSize", getAppSize())
            .append("appVersion", getAppVersion())
            .append("appUpdatedAt", getAppUpdatedAt())
            .append("status", getStatus())
            .append("appCover", getAppCover())
            .append("gameCover", getGameCover())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .toString();
    }
}
