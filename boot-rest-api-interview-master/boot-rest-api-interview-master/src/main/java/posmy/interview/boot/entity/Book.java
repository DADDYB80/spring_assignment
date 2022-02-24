package posmy.interview.boot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", unique = true)
    private String title;

    @Column(name = "isbn", unique = true)
    private String isbn;

    @Column(name = "thumbnailUrl", unique = true)
    private String thumbnailUrl;

    private String author;

    private String category;

    @JsonIgnore
    @ManyToMany(mappedBy = "shoppingCart")
    private List<Borrower> borrowers ;
}


