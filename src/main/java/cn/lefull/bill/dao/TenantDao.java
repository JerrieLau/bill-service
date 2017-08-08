/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.dao;

import java.util.List;
import cn.lefull.bill.model.Tenant;



/**
 * TODO 添加描述
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

public interface TenantDao {

	List<Tenant> all();

    Tenant get(Integer id);

    int delete(Integer id);

    int update(Tenant tenant);

}
