/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import cn.lefull.bill.model.BillReceivable;
import cn.lefull.bill.service.BillReceivableService;



/**
 * TODO 添加描述
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

@RestController
@RequestMapping("/api/bill_receivable")
public class BillReceivableController {

    @Autowired
    private BillReceivableService billReceivableService;

    @RequestMapping("/")
    @ResponseBody
    public List<BillReceivable> all() {
        return billReceivableService.all();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public BillReceivable get(@PathVariable("id") Integer id) {
        return billReceivableService.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public int delete(@PathVariable("id") Integer id) {
        return billReceivableService.delete(id);
    }


}