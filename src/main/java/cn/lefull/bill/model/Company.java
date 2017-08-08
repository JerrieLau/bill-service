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
public class Company {


	//columns START
    //公司ID
	private Integer companyId;
    //公司名称
	private String companyName;
    //公司名字简称缩写
	private String alias;
    //租赁模式(10：集中式，01：分散式，00：没有；11：都有)
	private String pattern;
    //联系人
	private String linkman;
    //城市ID
	private Integer cityId;
    //联系方式
	private String phone;
    //域名前缀
	private String domainPrefix;
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

