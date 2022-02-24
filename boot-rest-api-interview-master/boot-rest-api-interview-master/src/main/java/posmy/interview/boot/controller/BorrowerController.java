package posmy.interview.boot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import posmy.interview.boot.entity.Borrower;
import posmy.interview.boot.service.BookService;
import posmy.interview.boot.service.BorrowerService;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class BorrowerController {

    private BorrowerService borrowerService;
    private BookService bookService;

    public BorrowerController(BorrowerService borrowerService, BookService bookService) {
        super();
        this.borrowerService = borrowerService;
        this.bookService = bookService;
    }

    /*
    Get RestEndPoints
     */
    @GetMapping("/list")
    public List<Borrower> getBorrowerList(){
        return borrowerService.getListOfBorrowers();
    }

    /*
        Post RestEndPoints
         */
    @PostMapping("/add")
    public Borrower addBorrower(@RequestBody Borrower borrower){
        return borrowerService.saveBorrower(borrower);
    }
    /*
    Post RestEndPoints add book to shopping Cart
     */
    @PostMapping("/cart/{borrowerId}/{bookId}")
    public Borrower addBookToShoppingCart(@PathVariable long borrowerId, @PathVariable long bookId){
        return borrowerService.addBookToShoppingCart(borrowerId, bookId);
    }

    @GetMapping("/id/{id}")
    public Borrower getBorrowerById(@PathVariable Long id){
        return borrowerService.getBorrowerById(id);
    }

    @GetMapping("/email/{email}")
    public Borrower getBorrowerByEmail(@PathVariable String email){
        return borrowerService.getBorrowerByEmail(email);
    }
    /*
    Put RestEndPoints
     */
    @PutMapping("/update/{id}")
    public Borrower updateBorrower(@RequestBody Borrower borrower, @PathVariable Long id){
        return borrowerService.updateBorrower(borrower, id);
    }

    /*
    Delete RestEndPoints
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBorrower(@PathVariable Long id){
        borrowerService.deleteBorrower(id);
        return new ResponseEntity<String>("Borrower Account Deleted", HttpStatus.OK);
    }

    @DeleteMapping("/cart/delete/{borrowerId}/book/{bookId}")
    public ResponseEntity<String> removeBookFromShoppingCart(@PathVariable Long bookId, @PathVariable Long borrowerId){
        borrowerService.removeBookFromShoppingCart(borrowerId, bookId);
        return new ResponseEntity<String>("Book had been Deleted from Shopping Cart", HttpStatus.OK);
    }
}
