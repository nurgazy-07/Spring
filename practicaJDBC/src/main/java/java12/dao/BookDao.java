package java12.dao;

import java12.models.Book;

public interface BookDao {
    String creatBookTable();
    boolean saveBook(Long author, Book book);

}
