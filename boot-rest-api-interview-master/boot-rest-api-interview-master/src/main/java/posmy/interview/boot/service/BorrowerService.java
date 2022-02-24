package posmy.interview.boot.service;

import posmy.interview.boot.entity.Borrower;

import java.util.List;

public interface BorrowerService {

    Borrower saveBorrower(Borrower borrower);

    List<Borrower> getListOfBorrowers();

    Borrower getBorrowerById(Long id);

    Borrower getBorrowerByEmail(String email);

    void deleteBorrower(Long id);

    Borrower updateBorrower(Borrower borrower, Long id);

    Borrower addBookToShoppingCart(Long borrowerId, Long bookId);

    Borrower removeBookFromShoppingCart(Long borrowerId, Long bookId);
}
