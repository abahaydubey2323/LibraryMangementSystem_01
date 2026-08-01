package library.management.LibraryManagementSystem_1.entity;

import jakarta.persistence.*;
import lombok.*;

//import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;




@Entity
@Table(name = "authors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author extends BaseEntity {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, length = 100)
        private String name;

        @Column(length = 1000)
        private String biography;

        @Builder.Default
        @OneToMany(mappedBy = "author",
                cascade = CascadeType.ALL,
                orphanRemoval = true,
                fetch = FetchType.LAZY)
        private List<Book> books = new ArrayList<>();


}
