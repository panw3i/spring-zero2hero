package org.example;


import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 *  默认根据属性字段名称查找对应的bean对象 （属性字段的名称与bean标签的id属性值相等）
 */
public class UserService {

    // @Autowired注解实现自动注入（反射）
    @Autowired
    private UserDao userDao; // 属性字段的名称与bean标签的id属性值相等


//    1. 属性可以提供set方法，也可以不提供set方法
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Autowired // 注解也可设置在set方法上
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void test() {
        // 调用UserDao的方法
        userDao.test();
    }

    public void test01(){
        System.out.println("UserService.test01()");
    }
}