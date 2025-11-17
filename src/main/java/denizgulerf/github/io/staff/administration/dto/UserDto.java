package denizgulerf.github.io.staff.administration.dto;

import lombok.Data;

import java.time.Instant;

@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
    private String email;
    private String role;
    private String name;
    private String surname;
    private String classId;
    private String studentNumber;
    private Instant createdAt;
    private Instant updatedAt;
}

