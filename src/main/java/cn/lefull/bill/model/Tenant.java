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
public class Tenant {


	//columns START
    //tenant_id
	private Integer tenantId;
    //手机号码
	private String phone;
    //紧急联系人电话
	private String emergencyPhone;
    //租客姓名
	private String name;
    //紧急联系人
	private String emergencyContact;
    //证件号
	private String idcard;
    //证件号类型
	private String idcardType;
    //紧急联系人关系id
	private Integer interpersonalRelationConfigurationId;
    //性别（1男,2女）
	private Boolean gender;
    //密码
	private String password;
    //微信openid
	private String weixinOpenid;
    //是否是虚拟1是0否
	private Boolean isVirtual;
    //租客备注
	private String remarks;
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

