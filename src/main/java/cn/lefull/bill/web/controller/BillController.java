/*
 * Copyright 2017 [CompanyName], Inc. All rights reserved.
 * Website: http://www.lefull.cn/
 */
package cn.lefull.bill.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import cn.lefull.bill.service.BillService;
import org.springframework.ui.Model;


/**
 * TODO 添加描述
 *
 * @author liujie email:liujie@lefull.cn
 * @version 1.0
 * @since 1.0
 */

@Controller
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService billService;

    @RequestMapping(value = "/running_bill", method = RequestMethod.GET)
    public String queryRunningBill(Model mode, @RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<Object> pageInfo = PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> billService.queryRunningBill());
        mode.addAttribute("paging", pageInfo);
        return "bill/running_bill";
    }


}