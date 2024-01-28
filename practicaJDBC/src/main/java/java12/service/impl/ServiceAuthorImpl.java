package java12.service.impl;

import java12.dao.AuthorDao;
import java12.dao.impl.AuthorDaoImpl;
import java12.models.Author;
import java12.service.ServiceAuthor;

import java.util.List;

public class ServiceAuthorImpl implements ServiceAuthor {
   private final AuthorDaoImpl authorDao = new AuthorDaoImpl();


    @Override
    public boolean createAuthorTable() {
        return authorDao.createAuthorTable();
    }

    @Override
    public String saveAuthor(Author newAuthor) {
        return authorDao.saveAuthor(newAuthor);
    }

    @Override
    public String updateAuthorById(Long id, Author author) {
       return authorDao.updateAuthorById(id, author);
    }

    @Override
    public Author findAuthorById(Long id) {
        return null;
    }

    @Override
    public void deleteAuthorById(Long id) {
        authorDao.deleteAuthorById(id);
    }

    @Override
    public List<Author> findAllAuthors() {
        return authorDao.findAllAuthors();
    }

    @Override
    public void dropAuthorTable() {
      authorDao.dropAuthorTable();
    }

    @Override
    public boolean cleanTable() {
        return authorDao.cleanTable();
    }

    @Override
    public List<Author> sortByDateOfBirth() {
        return authorDao.sortByDateOfBirth();
    }
}
