package library.management.LibraryManagementSystem_1.entity;


import jakarta.persistence.*;
import library.management.LibraryManagementSystem_1.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
// import com.library.entity.BaseEntity;

//import javax.management.relation.Role;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "users")
@Data
public class User extends BaseEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 225, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;



    @Column(nullable = false)
    @Builder.Default
    private boolean enabled = true;


}
