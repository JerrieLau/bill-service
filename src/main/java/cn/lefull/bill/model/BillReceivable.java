/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.model;

import lombok.Data;



/**
 * TODO 添加描述
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

@Data
public class BillReceivable {


	//columns START
    //bill_receivable_id
	private Integer billReceivableId;
    //来源表id
	private Integer tableId;
    //来源表
	private String tableName;
    //租客ID
	private Integer tenantId;
    //业务代码
	private String serviceCode;
    //合同ID
	private Integer contractId;
    //门店ID
	private Integer apartmentId;
    //房间ID
	private Integer roomId;
    //是否分期; 0: 否; 1: 是
	private Boolean isIous;
    //当前分期到第几期
	private Byte currentTerm;
    //一次性支付了几期
	private Byte onetimeTerm;
    //是否是第一次月付分期
	private Boolean isFirstIousTerm;
    //父应收ID
	private Integer parentBillReceivableId;
    //计划时间
	private Integer planTime;
    //记账时间
	private Integer storeBillingTime;
    //月付服务费
	private Integer serviceFee;
    //应收金额
	private Integer receivableMoney;
    //备注
	private String remarks;
    //创建时间
	private Integer createTime;
    //修改时间
	private Integer updateTime;
    //删除时间
	private Integer deleteTime;
    //是否删除
	private Boolean isDelete;
	//columns END


}

