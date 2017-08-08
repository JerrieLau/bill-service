package cn.lefull.bill.model;


import lombok.Data;

@Data
public class CostRelationshipVo {

    //应收账单ID
    private Integer billReceivableId;

    //费用名称
    private String costName;

    //费用类型(0:收入,1:支出)
    private Boolean costType;

    //新增时间
    private Integer createTime;

}
