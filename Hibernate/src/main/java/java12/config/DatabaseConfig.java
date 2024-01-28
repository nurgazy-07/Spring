package java12.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import java.lang.module.Configuration;
import java.util.Properties;

public class DatabaseConfig {

    public static SessionFactory getSession() {
        Properties properties = new Properties();
        properties.put(Environment.JAKARTA_JDBC_DRIVER, "org.postgresql.Driver");
        properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:postgresql://localhost:5432/java12");
        properties.put(Environment.JAKARTA_JDBC_USER, "postgres");
        properties.put(Environment.JAKARTA_JDBC_PASSWORD, "postgres");
        properties.put(Environment.HBM2DDL_AUTO, "create");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        properties.put(Environment.SHOW_SQL, "true");

        Configuration configuration = new Configuration();
        configuration.addProperties(properties);
        configuration.addA



    }
}
