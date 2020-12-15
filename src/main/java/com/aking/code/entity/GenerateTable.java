package com.aking.code.entity;

public class GenerateTable {
    /**
     * 开关 true开启 false关闭
     */
    private boolean enable;
    /**
     * 生成目录位置
     */
    private String targetDir;
    /**
     * model文件位置
     */
    private String modelPackage;
    /**
     * mapper文件位置
     */
    private String mapperPackage;
    /**
     * example文件位置
     */
    private String examplePackage;
    /**
     * json文件位置
     */
    private String beanJsonPackage;
    /**
     * manager文件位置
     */
    private String managerPackage;
    /**
     * dao文件位置
     */
    private String daoPackage;
    /**
     * xml文件位置
     */
    private String xmlPackage;
    /**
     * query文件位置
     */
    private String queryPackage;
    /**
     * service文件位置
     */
    private String servicePackage;
    /**
     * dto文件位置
     */
    private String dtoPackage;
    /**
     * 主键
     */
    private String primaryKey;

    public String getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(String servicePackage) {
        this.servicePackage = servicePackage;
    }

    public String getQueryPackage() {
        return queryPackage;
    }

    public void setQueryPackage(String queryPackage) {
        this.queryPackage = queryPackage;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getTargetDir() {
        return targetDir;
    }

    public void setTargetDir(String targetDir) {
        this.targetDir = targetDir;
    }

    public String getModelPackage() {
        return modelPackage;
    }

    public void setModelPackage(String modelPackage) {
        this.modelPackage = modelPackage;
    }

    public String getMapperPackage() {
        return mapperPackage;
    }

    public void setMapperPackage(String mapperPackage) {
        this.mapperPackage = mapperPackage;
    }

    public String getExamplePackage() {
        return examplePackage;
    }

    public void setExamplePackage(String examplePackage) {
        this.examplePackage = examplePackage;
    }

    public String getBeanJsonPackage() {
        return beanJsonPackage;
    }

    public void setBeanJsonPackage(String beanJsonPackage) {
        this.beanJsonPackage = beanJsonPackage;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getManagerPackage() {
        return managerPackage;
    }

    public void setManagerPackage(String managerPackage) {
        this.managerPackage = managerPackage;
    }

    public String getDaoPackage() {
        return daoPackage;
    }

    public void setDaoPackage(String daoPackage) {
        this.daoPackage = daoPackage;
    }

    public String getXmlPackage() {
        return xmlPackage;
    }

    public void setXmlPackage(String xmlPackage) {
        this.xmlPackage = xmlPackage;
    }

    public String getDtoPackage() {
        return dtoPackage;
    }

    public void setDtoPackage(String dtoPackage) {
        this.dtoPackage = dtoPackage;
    }
}
