/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import cn.lefull.bill.model.CostRelationship;
import cn.lefull.bill.service.CostRelationshipService;



/**
 * TODO 添加描述
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

@RestController
@RequestMapping("/api/cost_relationship")
public class CostRelationshipController {

    @Autowired
    private CostRelationshipService costRelationshipService;

    @RequestMapping("/")
    @ResponseBody
    public List<CostRelationship> all() {
        return costRelationshipService.all();
    }




}