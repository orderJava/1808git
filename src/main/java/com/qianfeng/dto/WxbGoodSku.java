package com.qianfeng.dto;


public class WxbGoodSku {
//套餐主键
  private String skuId;
  //套餐名称
  private String skuName;
  //成本
  private String skuCost;
  //价格
  private String skuPrice;
  //分成
  private String skuPmoney;
  //商品ID
  private String goodId;
  //排序
  private long orderNo;
  //客服提成
  private String serviceMoney;


  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }


  public String getSkuCost() {
    return skuCost;
  }

  public void setSkuCost(String skuCost) {
    this.skuCost = skuCost;
  }


  public String getSkuPrice() {
    return skuPrice;
  }

  public void setSkuPrice(String skuPrice) {
    this.skuPrice = skuPrice;
  }


  public String getSkuPmoney() {
    return skuPmoney;
  }

  public void setSkuPmoney(String skuPmoney) {
    this.skuPmoney = skuPmoney;
  }


  public String getGoodId() {
    return goodId;
  }

  public void setGoodId(String goodId) {
    this.goodId = goodId;
  }


  public long getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(long orderNo) {
    this.orderNo = orderNo;
  }


  public String getServiceMoney() {
    return serviceMoney;
  }

  public void setServiceMoney(String serviceMoney) {
    this.serviceMoney = serviceMoney;
  }

}
