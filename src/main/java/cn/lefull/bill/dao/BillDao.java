/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.dao;

import java.util.List;
import cn.lefull.bill.model.Bill;
import cn.lefull.bill.model.RunningBillVo;


/**
 * TODO 添加描述
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

public interface BillDao {

	List<Bill> all();

    Bill get(Integer id);

    int delete(Integer id);

    int update(Bill bill);

    List<RunningBillVo> queryRunningBill();

}
