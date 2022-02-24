package posmy.interview.boot.service;

import posmy.interview.boot.entity.Book;

import java.util.List;

public interface BookService {

    Book saveBook(Book book);

    List<Book> getListBooks();

    Book getBookById(Long id);

    Book getBookByTitle(String title);

    Book getBookByISBn(String isbn);

    void deleteBook(Long id);

    Book updateBook(Book book, Long id);
}
