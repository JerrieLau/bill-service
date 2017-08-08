package cn.lefull.bill.rest.controller;


import cn.lefull.bill.model.User;
import cn.lefull.bill.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<User> all() {
        return userService.all();
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public PageInfo all(@RequestParam("currentPage") Integer currentPage, @RequestParam("pageSize") Integer pageSize) {
        PageHelper.offsetPage(currentPage, pageSize);
        List<User> all = userService.all();
        return new PageInfo(all);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User get(@PathVariable("id") Long id) {
        return userService.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public User delete(@PathVariable("id") Long id) {
        return userService.get(id);
    }

}
