package posmy.interview.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import posmy.interview.boot.entity.Borrower;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower, Long> {

    Borrower findByEmail(String email);
}
