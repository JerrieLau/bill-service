/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import cn.lefull.bill.dao.CostRelationshipDao;
import cn.lefull.bill.model.CostRelationship;




/**
 * TODO 添加描述
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

@Service
public class CostRelationshipService {

    @Autowired
	private CostRelationshipDao costRelationshipDao;

    public List<CostRelationship> all() {
        return costRelationshipDao.all();
    }


}
