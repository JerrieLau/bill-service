package cn.lefull.bill.model;

import lombok.Data;

import java.util.List;

@Data
public class RunningBillVo {

    //bill_id
    private Integer billId;

    //单据号
    private String documentNumber;

    //bill 应收表ID
    private Integer billReceivableId;

    //房间ID
    private Integer roomId;

    //租客姓名
    private String tenantName;

    //总金额
    private java.math.BigDecimal totalMoney;

    //实收总额
    private java.math.BigDecimal realPrice;
    //单据号

    //用于关联查询科目等数据
    private List<CostRelationshipVo> costRelationships;

}
