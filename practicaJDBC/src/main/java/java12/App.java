package java12;

import java12.config.jdbcConfig;
import java12.models.Author;
import java12.service.impl.ServiceAuthorImpl;
import java12.service.impl.ServiceBookImpl;

import java.time.LocalDate;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        jdbcConfig.genConnection();
        ServiceAuthorImpl serviceAuthor = new ServiceAuthorImpl();
//        System.out.println(serviceAuthor.createAuthorTable());
//        ServiceBookImpl serviceBook = new ServiceBookImpl();
//        System.out.println(serviceBook.creatBookTable());
//        System.out.println(serviceAuthor.saveAuthor(new Author(1L,    "nurgzy", "temiraliev", "nu@gmail.com", "kg", LocalDate.of(2000, 10, 28))));
//        System.out.println(serviceAuthor.saveAuthor(new Author(2L, "nurgzy", "temiraliev", "nu@gmail.com", "kg", LocalDate.of(2009, 11, 28))));
//        System.out.println(serviceAuthor.saveAuthor(new Author(3L, "nurgzy", "temiraliev", "nu@gmail.com", "kg", LocalDate.of(2010, 12, 28))));
//        serviceAuthor.updateAuthorById(1L, new Author(2L, "nurislam", "toygonbaev", "nur@gmail.com", "kg", LocalDate.of(2000, 12, 12)));
//        serviceAuthor.deleteAuthorById(1L);
//        System.out.println(serviceAuthor.findAllAuthors());
//        serviceAuthor.dropAuthorTable();
//        serviceAuthor.cleanTable();
//        System.out.println(serviceAuthor.sortByDateOfBirth());
    }
}
