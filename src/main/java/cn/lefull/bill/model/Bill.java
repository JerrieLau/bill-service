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
public class Bill {


	//columns START
    //bill_id
	private Integer billId;
    //bill 应收表ID
	private Integer billReceivableId;
    //公司ID
	private Integer companyId;
    //门店ID
	private Integer apartmentId;
    //产生账单的表名称
	private String tableName;
    //现金金额
	private java.math.BigDecimal cashMoney;
    //现金凭证
	private String cashCertificate;
    //银行卡开户行ID
	private Integer bankCardId;
    //银行卡卡号
	private String bankCardNumber;
    //银行卡金额
	private java.math.BigDecimal bankCardMoney;
    //银行卡凭证
	private String bankCardCertificate;
    //挂账金额
	private java.math.BigDecimal lossesMoney;
    //挂账凭证
	private String lossesCertificate;
    //挂账公寓ID
	private Integer lossesApartmentId;
    //挂账银行卡行
	private String lossesBankCardNumber;
    //挂账开户号
	private Integer lossesBankCardId;
    //挂账开户名
	private String lossesBankCardAccount;
    //挂账状态
	private Boolean lossesStatus;
    //支付宝金额
	private java.math.BigDecimal alipayMoney;
    //支付宝凭证
	private String alipayCertificate;
    //微信金额
	private java.math.BigDecimal weixinMoney;
    //微信凭证
	private String weixinCertificate;
    //优惠券金额
	private java.math.BigDecimal couponMoney;
    //优惠券码
	private String couponNumber;
    //租客钱包
	private java.math.BigDecimal balanceMoney;
    //月份服务方金额
	private java.math.BigDecimal iousSupplierMoney;
    //月份服务方凭证
	private String iousSupplierCertificate;
    //转让服务费
	private java.math.BigDecimal transferServiceMoney;
    //转让服务费备注说明
	private String transferServiceMark;
    //乐惠金额
	private java.math.BigDecimal lehuiMoney;
    //乐惠凭证
	private String lehuiCertificate;
    //靠浦e付
	private java.math.BigDecimal spdQrcodeMoney;
    //月付补贴
	private java.math.BigDecimal subsidyMoney;
    //月付补贴备注
	private String subsidyCertificate;
    //靠谱e付备注
	private String spdQrcodeCertificate;
    //总金额
	private java.math.BigDecimal totalMoney;
    //实收总额
	private java.math.BigDecimal realPrice;
    //单据号
	private String documentNumber;
    //记账时间
	private Integer storeBillingTime;
    //支票转账金额
	private java.math.BigDecimal checkMoney;
    //支票转账备注
	private String checkRemarks;
    //前方支付金额
	private java.math.BigDecimal qianfangMoney;
    //钱方支付备注
	private String qianfangRemarks;
    //账单类型(0:收入,1:支出)
	private Boolean billType;
    //是否通过日夜审核
	private Boolean audit;
    //是否通过单条确定
	private Boolean auditAlone;
    //夜审核人ID
	private Integer auditEmployeeId;
    //单条确定人ID
	private Integer auditAloneEmployeeId;
    //财务是否审核
	private Boolean financeAudit;
    //财务审核人员ID
	private Integer financeEmployeeId;
    //结账
	private Boolean isClearing;
    //关账
	private Boolean isClosing;
    //结账操作人
	private Integer clearingEmployeeId;
    //关账操作人
	private Integer closingEmployeeId;
    //核销状态
	private Boolean isWriteOff;
    //退款挂账状态
	private Boolean isRefund;
    //驳回状态
	private Boolean isReject;
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

