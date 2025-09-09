package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;


public class Main {

    public static void main(String[] args) {
//        UserDao userDao = new UserDaoJDBCImpl();
//
//        userDao.createUsersTable();
//        userDao.saveUser("Name1", "LastName1", (byte) 20);
//        userDao.saveUser("Name2", "LastName2", (byte) 25);
//        userDao.saveUser("Name3", "LastName3", (byte) 30);
//        userDao.saveUser("Name4", "LastName4", (byte) 35);
//
//        List<User> resalt = userDao.getAllUsers();
//        for (User u: resalt){
//            System.out.println(u);
//        }
//
//        userDao.cleanUsersTable();
//        userDao.dropUsersTable();


        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Name1", "LastName1", (byte) 20);
        userService.saveUser("Name2", "LastName2", (byte) 25);
        userService.saveUser("Name3", "LastName3", (byte) 30);
        userService.saveUser("Name4", "LastName4", (byte) 35);

        List<User> resalt = userService.getAllUsers();
        for (User u: resalt){
            System.out.println(u);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

