package library.management.LibraryManagementSystem_1.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponse {

    private Long id;

    private String title;

    private String isbn;

    private Integer quantity;

    private Integer availableQuantity;

    private String description;

    private String authorName;

    private String categoryName;

}