/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import cn.lefull.bill.dao.TenantDao;
import cn.lefull.bill.model.Tenant;




/**
 * TODO 添加描述
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

@Service
public class TenantService {

    @Autowired
	private TenantDao tenantDao;

    public List<Tenant> all() {
        return tenantDao.all();
    }

    public Tenant get(Integer id) {
        return tenantDao.get(id);
    }

    public int delete(Integer id) {
        return tenantDao.delete(id);
    }
}
