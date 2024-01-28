package java12.dao.impl;

import java12.config.jdbcConfig;
import java12.dao.BookDao;
import java12.models.Book;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDaoImpl implements BookDao {
    private final Connection connection = jdbcConfig.genConnection();
    @Override
    public String creatBookTable() {
        String query = """
                create table if not exists books(
                id serial primary key,
                name varchar,
                country varchar,
                published_year int,
                price int,
                author_id int references authors(id);
                
                """;
        try (Statement statement = connection.createStatement()){
            statement.executeUpdate(query);
            return "Book table is created!";
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return "not add";
    }

    @Override
    public boolean saveBook(Long author, Book book) {
        return false;
    }
}
