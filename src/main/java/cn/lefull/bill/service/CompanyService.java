/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import cn.lefull.bill.dao.CompanyDao;
import cn.lefull.bill.model.Company;




/**
 * TODO 添加描述
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

@Service
public class CompanyService {

    @Autowired
	private CompanyDao companyDao;

    public List<Company> all() {
        return companyDao.all();
    }

    public Company get(Integer id) {
        return companyDao.get(id);
    }

    public int delete(Integer id) {
        return companyDao.delete(id);
    }
}
