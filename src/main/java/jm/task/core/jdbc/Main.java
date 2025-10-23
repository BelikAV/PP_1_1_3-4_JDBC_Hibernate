package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        try {
            userService.createUsersTable();
            userService.saveUser("Alex", "Belik", (byte) 23);
            userService.saveUser("Alina", "Petrova", (byte) 55);
            userService.saveUser("Sergo", "Onischenco", (byte) 33);
            userService.saveUser("Vasi", "Leo", (byte) 25);
            userService.getAllUsers().forEach(System.out::println);
            userService.cleanUsersTable();
            userService.dropUsersTable();

        } finally {
            Util.closeResources();
        }

    }
}
