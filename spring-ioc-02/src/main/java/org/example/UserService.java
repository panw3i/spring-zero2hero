package org.example;

public class UserService {

    private UserDao userDao; // JavaBean 对象
    private CountDao countDao; // JavaBean 对象

    private String name;// 属性

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserService(UserDao userDao,CountDao countDao) {
        this.userDao = userDao;
        this.countDao = countDao;
    }

    public UserService(UserDao userDao,CountDao countDao,String name) {
        this.userDao = userDao;
        this.countDao = countDao;
        this.name = name;
    }

    public  void  test(){
        System.out.println("UserService Test...");

        userDao.test();
        countDao.test();
    }

}