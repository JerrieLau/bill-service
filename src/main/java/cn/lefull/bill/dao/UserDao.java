package cn.lefull.bill.dao;


import cn.lefull.bill.model.User;

import java.util.List;


public interface UserDao {

    List<User> all();

    User get(Long id);

    int delete(Long id);

    int update(User user);

}
