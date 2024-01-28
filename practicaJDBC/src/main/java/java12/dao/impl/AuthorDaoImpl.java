package java12.dao.impl;

import java12.config.jdbcConfig;
import java12.dao.AuthorDao;
import java12.models.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDaoImpl implements AuthorDao {
    private final Connection connection = jdbcConfig.genConnection();
    @Override
    public boolean createAuthorTable() {
        int execute = 0;
        String query = """
                create table if not exists authors(
                id serial primary key,
                first_name varchar,
                last_name varchar,
                email varchar,
                country varchar,
                date_of_birth date);  
                """;
        try(Statement statement = connection.createStatement()) {
            execute = statement.executeUpdate(query);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return execute == 0;
    }

    @Override
    public String saveAuthor(Author newAuthor) {
        int exi = 0;
     String query = """
             insert into authors(first_name, last_name, email, country, date_of_birth)
             values(?, ?, ?, ?, ?)
             """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, newAuthor.getFirstName());
            preparedStatement.setString(2, newAuthor.getLastName());
            preparedStatement.setString(3, newAuthor.getEmail());
            preparedStatement.setString(4, newAuthor.getCountry());
            preparedStatement.setDate(5, Date.valueOf(newAuthor.getDateOfBirth()));
          exi =  preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
      return exi == 0 ? "not added" : "added";
    }

    @Override
    public String updateAuthorById(Long id, Author author) {
        String query =
                """
                         update authors set first_name = ?,
                         last_name = ?,
                         email = ?,
                         country = ?,
                         date_of_birth = ?   where id = ?
       """;
        int execute = 0;
        try(PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, author.getFirstName());
            preparedStatement.setString(2, author.getLastName());
            preparedStatement.setString(3, author.getEmail());
            preparedStatement.setString(4, author.getCountry());
            preparedStatement.setDate(5, Date.valueOf(author.getDateOfBirth()));
            preparedStatement.setLong(6, id);
           execute = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return execute != 0 ? "success" : "error";
    }
    @Override
    public Author findAuthorById(Long id) {
        Author author = new Author();
        String query = "select * from authors;";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                author.setId(resultSet.getLong("id"));
                author.setFirstName(resultSet.getString("first_name"));
                author.setLastName(resultSet.getString("last_name"));
                author.setEmail(resultSet.getString("email"));
                author.setCountry(resultSet.getString("country"));
                author.setDateOfBirth(resultSet.getDate("date_of_birth").toLocalDate());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return author;
    }

    @Override
    public void deleteAuthorById(Long id) {
        String query = """
                delete from authors where id = ?
                """;
       try(PreparedStatement preparedStatement = connection.prepareStatement(query)) {
           preparedStatement.setLong(1, id);
           preparedStatement.executeUpdate();
       }catch (SQLException e){
           System.out.println(e.getMessage());
       }

    }
    @Override
    public List<Author> findAllAuthors() {
        List<Author> authors = new ArrayList<>();
        String query = """
                select * from authors;
                """;
       try (PreparedStatement preparedStatement = connection.prepareStatement(query)){
           ResultSet resultSet = preparedStatement.executeQuery();
           while (resultSet.next()){
               Author author = new Author();
           author.setId(resultSet.getLong("id"));
           author.setFirstName(resultSet.getString("first_name"));
           author.setLastName(resultSet.getString("last_name"));
           author.setEmail(resultSet.getString("email"));
           author.setCountry(resultSet.getString("country"));
           author.setDateOfBirth(resultSet.getDate("date_of_birth").toLocalDate());
           authors.add(author);
           }
       }catch (SQLException e){
           System.out.println(e.getMessage());
       }
       return authors;
    }
    @Override
    public void dropAuthorTable() {
        String query = """
                drop table authors;
               """;
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }

    @Override
    public boolean cleanTable() {
        boolean execute = false;
         String query = """
                 alter table authors drop column id,
                  drop column first_name, drop column last_name,
                  drop column email, drop column country,
                  drop column date_of_birth
                """;
        try {
            Statement statement = connection.createStatement();
             execute = statement.execute(query);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return  execute;
    }

    @Override
    public List<Author> sortByDateOfBirth() {
        List<Author> authors = new ArrayList<>();
        Author author = new Author();
        String query = """
                select date_of_birth from authors order by date_of_birth;
                """;
        try(Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                author.setDateOfBirth(resultSet.getDate("date_of_birth").toLocalDate());
            }
            authors.add(author);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return authors;
    }
}
