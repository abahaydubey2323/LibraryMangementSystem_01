package library.management.LibraryManagementSystem_1.dto.response;




import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponse {

    private String token;

    private String tokenType;

    private String username;

    private String role;

    private Long expiresIn;

}