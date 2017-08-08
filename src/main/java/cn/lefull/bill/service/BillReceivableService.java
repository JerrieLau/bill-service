/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import cn.lefull.bill.dao.BillReceivableDao;
import cn.lefull.bill.model.BillReceivable;




/**
 * TODO 添加描述
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

@Service
public class BillReceivableService {

    @Autowired
	private BillReceivableDao billReceivableDao;

    public List<BillReceivable> all() {
        return billReceivableDao.all();
    }

    public BillReceivable get(Integer id) {
        return billReceivableDao.get(id);
    }

    public int delete(Integer id) {
        return billReceivableDao.delete(id);
    }
}
