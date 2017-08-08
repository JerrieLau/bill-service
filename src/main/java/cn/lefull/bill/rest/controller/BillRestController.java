/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.rest.controller;

import cn.lefull.bill.model.RunningBillVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import cn.lefull.bill.model.Bill;
import cn.lefull.bill.service.BillService;


/**
 * TODO 添加描述
 *
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

@RestController
@RequestMapping("/api/bill")
public class BillRestController {

    @Autowired
    private BillService billService;

    @RequestMapping("/")
    @ResponseBody
    public List<Bill> all() {
        return billService.all();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Bill get(@PathVariable("id") Integer id) {
        return billService.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public int delete(@PathVariable("id") Integer id) {
        return billService.delete(id);
    }

    @RequestMapping(value = "/running_bill", method = RequestMethod.GET)
    public PageInfo<RunningBillVo> queryRunningBill(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> billService.queryRunningBill());
    }


}