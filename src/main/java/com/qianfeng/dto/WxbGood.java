package com.qianfeng.dto;

import java.util.List;

public class WxbGood {
//主键id
  private String goodId;
  //商品名称
  private String goodName;
  //商户id
  private String customerId;
  //商品图片
  private String goodPic;
  //图片2
  private String goodPic1;
  //图片3
  private String goodPic2;
  //推广说明
  private String promoteDesc;
  //sku描述
  private String skuTitle;
  //成本
  private String skuCost;
  //价格
  private String skuPrice;
  //分成
  private String skuPmoney;
  //文案id
  private String copyIds;
  //文案说明
  private String copyDesc;
  //跳转链接
  private String forwardLink;
  //排序编号
  private long orderNo;
  //商品分类
  private String typeId;
  //标签信息
  private String tags;
  //是否有效 0 待审核 1 已上架 2 已下架
  private long state;
  //加入时间
  private java.sql.Timestamp createTime;
  //是否置顶 0 取消置顶 1 置顶
  private long toped;
  //是否推荐 0 否 1 是
  private long recomed;
  //置顶时间
  private java.sql.Timestamp topedTime;
  //推荐时间
  private java.sql.Timestamp recomedTime;
  //站内文案ID
  private String spcId;
  //空间文案ID
  private String zonId;
  //购买人数作弊值
  private long sellNum;
  //产品网址
  private String website;
  private long iswxpay;
  private long isfdfk;
  private long leixingId;
  private String kfqq;
  private List<WxbGood> wxbGoodList;

  public List<WxbGood> getWxbGoodList() {
    return wxbGoodList;
  }

  public void setWxbGoodList(List<WxbGood> wxbGoodList) {
    this.wxbGoodList = wxbGoodList;
  }

  public String getGoodId() {
    return goodId;
  }

  public void setGoodId(String goodId) {
    this.goodId = goodId;
  }


  public String getGoodName() {
    return goodName;
  }

  public void setGoodName(String goodName) {
    this.goodName = goodName;
  }


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public String getGoodPic() {
    return goodPic;
  }

  public void setGoodPic(String goodPic) {
    this.goodPic = goodPic;
  }


  public String getGoodPic1() {
    return goodPic1;
  }

  public void setGoodPic1(String goodPic1) {
    this.goodPic1 = goodPic1;
  }


  public String getGoodPic2() {
    return goodPic2;
  }

  public void setGoodPic2(String goodPic2) {
    this.goodPic2 = goodPic2;
  }


  public String getPromoteDesc() {
    return promoteDesc;
  }

  public void setPromoteDesc(String promoteDesc) {
    this.promoteDesc = promoteDesc;
  }


  public String getSkuTitle() {
    return skuTitle;
  }

  public void setSkuTitle(String skuTitle) {
    this.skuTitle = skuTitle;
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


  public String getCopyIds() {
    return copyIds;
  }

  public void setCopyIds(String copyIds) {
    this.copyIds = copyIds;
  }


  public String getCopyDesc() {
    return copyDesc;
  }

  public void setCopyDesc(String copyDesc) {
    this.copyDesc = copyDesc;
  }


  public String getForwardLink() {
    return forwardLink;
  }

  public void setForwardLink(String forwardLink) {
    this.forwardLink = forwardLink;
  }


  public long getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(long orderNo) {
    this.orderNo = orderNo;
  }


  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }


  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getToped() {
    return toped;
  }

  public void setToped(long toped) {
    this.toped = toped;
  }


  public long getRecomed() {
    return recomed;
  }

  public void setRecomed(long recomed) {
    this.recomed = recomed;
  }


  public java.sql.Timestamp getTopedTime() {
    return topedTime;
  }

  public void setTopedTime(java.sql.Timestamp topedTime) {
    this.topedTime = topedTime;
  }


  public java.sql.Timestamp getRecomedTime() {
    return recomedTime;
  }

  public void setRecomedTime(java.sql.Timestamp recomedTime) {
    this.recomedTime = recomedTime;
  }


  public String getSpcId() {
    return spcId;
  }

  public void setSpcId(String spcId) {
    this.spcId = spcId;
  }


  public String getZonId() {
    return zonId;
  }

  public void setZonId(String zonId) {
    this.zonId = zonId;
  }


  public long getSellNum() {
    return sellNum;
  }

  public void setSellNum(long sellNum) {
    this.sellNum = sellNum;
  }


  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  public long getIswxpay() {
    return iswxpay;
  }

  public void setIswxpay(long iswxpay) {
    this.iswxpay = iswxpay;
  }


  public long getIsfdfk() {
    return isfdfk;
  }

  public void setIsfdfk(long isfdfk) {
    this.isfdfk = isfdfk;
  }


  public long getLeixingId() {
    return leixingId;
  }

  public void setLeixingId(long leixingId) {
    this.leixingId = leixingId;
  }


  public String getKfqq() {
    return kfqq;
  }

  public void setKfqq(String kfqq) {
    this.kfqq = kfqq;
  }

  @Override
  public String toString() {
    return "WxbGood{" +
            "goodId='" + goodId + '\'' +
            ", goodName='" + goodName + '\'' +
            ", customerId='" + customerId + '\'' +
            ", goodPic='" + goodPic + '\'' +
            ", goodPic1='" + goodPic1 + '\'' +
            ", goodPic2='" + goodPic2 + '\'' +
            ", promoteDesc='" + promoteDesc + '\'' +
            ", skuTitle='" + skuTitle + '\'' +
            ", skuCost='" + skuCost + '\'' +
            ", skuPrice='" + skuPrice + '\'' +
            ", skuPmoney='" + skuPmoney + '\'' +
            ", copyIds='" + copyIds + '\'' +
            ", copyDesc='" + copyDesc + '\'' +
            ", forwardLink='" + forwardLink + '\'' +
            ", orderNo=" + orderNo +
            ", typeId='" + typeId + '\'' +
            ", tags='" + tags + '\'' +
            ", state=" + state +
            ", createTime=" + createTime +
            ", toped=" + toped +
            ", recomed=" + recomed +
            ", topedTime=" + topedTime +
            ", recomedTime=" + recomedTime +
            ", spcId='" + spcId + '\'' +
            ", zonId='" + zonId + '\'' +
            ", sellNum=" + sellNum +
            ", website='" + website + '\'' +
            ", iswxpay=" + iswxpay +
            ", isfdfk=" + isfdfk +
            ", leixingId=" + leixingId +
            ", kfqq='" + kfqq + '\'' +
            ", wxbGoodList=" + wxbGoodList +
            '}';
  }


}
