/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.service;


import cn.lefull.bill.model.RunningBillVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import cn.lefull.bill.dao.BillDao;
import cn.lefull.bill.model.Bill;




/**
 * TODO 添加描述
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

@Service
public class BillService {

    @Autowired
	private BillDao billDao;

    public List<Bill> all() {
        return billDao.all();
    }

    public Bill get(Integer id) {
        return billDao.get(id);
    }

    public int delete(Integer id) {
        return billDao.delete(id);
    }

    public List<RunningBillVo> queryRunningBill() {
        return billDao.queryRunningBill();
    }


}
