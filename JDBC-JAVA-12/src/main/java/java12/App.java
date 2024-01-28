package java12;

import java12.configuration.JdbcConfig;
import java12.dao.impl.StudentDaoImpl;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        JdbcConfig.getConnection();
        StudentDaoImpl studentDao
    }
}

