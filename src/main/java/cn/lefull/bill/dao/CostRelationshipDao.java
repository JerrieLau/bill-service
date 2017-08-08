/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.dao;

import java.util.List;
import cn.lefull.bill.model.CostRelationship;



/**
 * TODO 添加描述
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

public interface CostRelationshipDao {

	List<CostRelationship> all();



    int update(CostRelationship costRelationship);

}
