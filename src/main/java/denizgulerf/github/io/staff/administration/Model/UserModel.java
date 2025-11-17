package denizgulerf.github.io.staff.administration.Model;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.couchbase.core.mapping.Document;

import java.time.Instant;

@Data
@Document
public class UserModel {
    @Id
    private String id;

    private String username;
    private String password;
    private String email;
    private String role;
    private String name;
    private String surname;
    private String classId;
    private String studentNumber;
    @CreatedDate
    private Instant createdAt;
    @LastModifiedDate
    private Instant updatedAt;
}
