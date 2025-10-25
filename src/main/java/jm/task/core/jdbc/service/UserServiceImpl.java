package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao usd = new UserDaoJDBCImpl();

    @Override
    public void createUsersTable() {
        usd.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        usd.dropUsersTable();

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        usd.saveUser(name, lastName, age);
        System.out.println("User с именем - " + name + " добавлен в базу данных");
    }


    @Override
    public void removeUserById(long id) {
        usd.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return usd.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        usd.cleanUsersTable();
    }
}
