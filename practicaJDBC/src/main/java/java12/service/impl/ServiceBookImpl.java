package java12.service.impl;

import java12.dao.impl.BookDaoImpl;
import java12.models.Book;
import java12.service.ServiceBook;

public class ServiceBookImpl implements ServiceBook {
private final BookDaoImpl bookDao = new BookDaoImpl();
    @Override
    public String creatBookTable() {
       return bookDao.creatBookTable();
    }

    @Override
    public boolean saveBook(Long author, Book book) {
        return false;
    }
}
