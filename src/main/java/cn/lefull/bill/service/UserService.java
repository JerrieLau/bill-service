package cn.lefull.bill.service;


import cn.lefull.bill.dao.UserDao;
import cn.lefull.bill.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> all() {
        return userDao.all();
    }

    public User get(Long id){
        return userDao.get(id);
    }


}
