package org.example;


import javax.annotation.Resource;

/**
 *  默认根据属性字段名称查找对应的bean对象 （属性字段的名称与bean标签的id属性值相等）
 */
public class UserService {

    // @Resource注解实现自动注入（反射）
    @Resource
    private UserDao userDao; // 属性字段的名称与bean标签的id属性值相等


//    1. 属性可以提供set方法，也可以不提供set方法
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Resource // 注解也可设置在set方法上
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