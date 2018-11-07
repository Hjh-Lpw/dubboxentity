package com.szxs.entity;


import java.io.Serializable;

public class TRecoveryBrand implements Serializable {

  private String uuid;
  private String brandCode;
  private String brandName;
  private String brandType;
  private String brandPictureId;
  private String createdBy;
  private String creationDate;
  private String lastUpdateBy;
  private String lastUpdateDate;
  private String extField1;
  private String extField2;
  private String memo;
  private String viewOrder;


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public String getBrandCode() {
    return brandCode;
  }

  public void setBrandCode(String brandCode) {
    this.brandCode = brandCode;
  }


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public String getBrandType() {
    return brandType;
  }

  public void setBrandType(String brandType) {
    this.brandType = brandType;
  }


  public String getBrandPictureId() {
    return brandPictureId;
  }

  public void setBrandPictureId(String brandPictureId) {
    this.brandPictureId = brandPictureId;
  }


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  public String getLastUpdateBy() {
    return lastUpdateBy;
  }

  public void setLastUpdateBy(String lastUpdateBy) {
    this.lastUpdateBy = lastUpdateBy;
  }


  public String getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(String lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  public String getExtField1() {
    return extField1;
  }

  public void setExtField1(String extField1) {
    this.extField1 = extField1;
  }


  public String getExtField2() {
    return extField2;
  }

  public void setExtField2(String extField2) {
    this.extField2 = extField2;
  }


  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }


  public String getViewOrder() {
    return viewOrder;
  }

  public void setViewOrder(String viewOrder) {
    this.viewOrder = viewOrder;
  }

}
