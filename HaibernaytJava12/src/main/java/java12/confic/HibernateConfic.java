package java12.confic;

import jakarta.persistence.EntityManagerFactory;
import java12.entity.Student;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateConfic {
    public static SessionFactory getSession(){
        Properties properties = new Properties();
        properties.put(Environment.JAKARTA_JDBC_DRIVER, "org.postgresql.Driver" );
        properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:postgresql://localhost:5432/postgres" );
        properties.put(Environment.JAKARTA_JDBC_USER, "postgres" );
        properties.put(Environment.JAKARTA_JDBC_PASSWORD, "1234" );
        properties.put(Environment.HBM2DDL_AUTO, "create" );
        properties.put(Environment.DIALECT, "org.hibernate,dialect.PostgreSQLDialect" );
        properties.put(Environment.SHOW_SQL, "true" );

        Configuration configuration = new Configuration();
        configuration.addProperties(properties);
        configuration.addAnnotatedClass(Student.class);
        return configuration.buildSessionFactory();
    }
    public static EntityManagerFactory getEntityManager(){
        try {
            Properties properties = new Properties();
            properties.put(Environment.JAKARTA_JDBC_DRIVER, "org.postgresql.Driver");
            properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:postgresql://localhost:5432/postgres");
            properties.put(Environment.JAKARTA_JDBC_USER, "postgres");
            properties.put(Environment.JAKARTA_JDBC_PASSWORD, "1234");
            properties.put(Environment.HBM2DDL_AUTO, "update");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
            properties.put(Environment.SHOW_SQL, "true");
            properties.put(Environment.FORMAT_SQL, "true");
            Configuration configuration = new Configuration();
            configuration.addProperties(properties);
            configuration.addAnnotatedClass(Student.class);
            return configuration.buildSessionFactory().unwrap(EntityManagerFactory.class);
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
