package posmy.interview.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import posmy.interview.boot.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByTitle(String title);
    Book findByIsbn(String isbn);

}
