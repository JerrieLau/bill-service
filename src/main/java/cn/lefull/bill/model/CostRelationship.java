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
public class CostRelationship {


	//columns START
    //费用ID
	private Integer costConfigurationId;
    //公司ID
	private Integer companyId;
    //应收账单ID
	private Integer billReceivableId;
    //费用名称
	private String costName;
    //费用金额
	private java.math.BigDecimal costMoney;
    //产生费用的表名称
	private String tableName;
    //产生费用的表ID
	private Integer tableId;
    //费用类型(0:收入,1:支出)
	private Boolean costType;
    //操作人
	private Integer operatorEmployeeId;
    //新增时间
	private Integer createTime;
    //修改时间
	private Integer updateTime;
    //是否删除
	private Boolean isDelete;
    //删除时间
	private Integer deleteTime;
	//columns END


}

