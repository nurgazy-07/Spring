package java12.service;

import java12.models.Author;

import java.util.List;

public interface ServiceAuthor {
    boolean createAuthorTable();
    String saveAuthor(Author newAuthor);
    String updateAuthorById(Long id, Author author);
    Author findAuthorById(Long id);
    void deleteAuthorById(Long id);
    List<Author> findAllAuthors();
    void dropAuthorTable();
    boolean cleanTable();
    List<Author> sortByDateOfBirth();
}
