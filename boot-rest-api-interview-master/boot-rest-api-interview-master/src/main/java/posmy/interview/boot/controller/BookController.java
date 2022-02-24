package posmy.interview.boot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import posmy.interview.boot.entity.Book;
import posmy.interview.boot.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService){
        super();
        this.bookService = bookService;
    }

    /*
    Get Rest EndPoints
     */
    @GetMapping("/list")
    public List<Book> getListOfBooks(){
        return bookService.getListBooks();
    }

    /*
    Post Rest EndPoints
     */
    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @GetMapping("/id/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @GetMapping("/title/{title}")
    public Book getBookByTitle(@PathVariable String title){
        return bookService.getBookByTitle(title);
    }

    @GetMapping("/isbn/{isbn}")
    public Book getBookByIsbn(@PathVariable String isbn){
        return bookService.getBookByISBn(isbn);
    }

    /*
    Delete REST EndPoints
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
        return new ResponseEntity<String>("Book Deleted", HttpStatus.OK);
    }

    /*
    Update REST EndPoints
     */
    @PutMapping("/update/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long id){
        return bookService.updateBook(book, id);
    }
}
