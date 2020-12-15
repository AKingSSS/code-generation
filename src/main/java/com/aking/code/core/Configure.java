package com.aking.code.core;

import com.aking.code.entity.GenerateTable;
import com.aking.code.utils.YamlUtils;

public class Configure {

	public Configure() {
		GenerateTable generateTable = YamlUtils.getProperties().getGenerateTable();
        this.targetDir = generateTable.getTargetDir();
        this.modelPackage = generateTable.getModelPackage();
        this.mapperPackage = generateTable.getMapperPackage();
        this.examplePackage = generateTable.getExamplePackage();
        this.beanJsonPackage = generateTable.getBeanJsonPackage();
        this.primaryKey = generateTable.getPrimaryKey();
        this.managerPackage = generateTable.getManagerPackage();
        this.daoPackage = generateTable.getDaoPackage();
        this.xmlPackage = generateTable.getXmlPackage();
        this.queryPackage = generateTable.getQueryPackage();
        this.servicePackage = generateTable.getServicePackage();
        this.dtoPackage = generateTable.getDtoPackage();
	}

	public final String templeteBase = "template/";

	private String targetDir;

	private String modelPackage;

	private String dtoPackage;

	private String mapperPackage;

	private String examplePackage;

	private String beanJsonPackage;

	private String managerPackage;

	private String daoPackage;

	private String xmlPackage;

	private String queryPackage;

	private String servicePackage;

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

	public String getBeanJsonPackage() {
		return beanJsonPackage;
	}

	public void setBeanJsonPackage(String beanJsonPackage) {
		this.beanJsonPackage = beanJsonPackage;
	}

	private String primaryKey;

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

	public String getTargetDir() {
		return targetDir;
	}

	public void setTargetDir(String targetDir) {
		this.targetDir = targetDir;
	}

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
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
