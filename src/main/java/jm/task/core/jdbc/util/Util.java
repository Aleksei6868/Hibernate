package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;


public class Util {
    private static String URL = "jdbc:mysql://localhost:3306/MySqlConnection";
    private static String USERNAME = "root";
    private static String PASSWORD = "viking68";

    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static SessionFactory getSassionFactory () {
        Configuration configuration = new Configuration();
        configuration
                .addAnnotatedClass(User.class)
                .addPackage("model")
                .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
                .setProperty("hibernate.connection.url", URL)
                .setProperty("hibernate.connection.username", USERNAME)
                .setProperty("hibernate.connection.password", PASSWORD)
                .setProperty("hibernate.show_sql", "true");

        return configuration.buildSessionFactory();

    }
}