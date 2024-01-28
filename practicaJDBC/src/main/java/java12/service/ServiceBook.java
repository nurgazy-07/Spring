package java12.service;

import java12.models.Book;

public interface ServiceBook {
    String creatBookTable();
    boolean saveBook(Long author, Book book);
}
