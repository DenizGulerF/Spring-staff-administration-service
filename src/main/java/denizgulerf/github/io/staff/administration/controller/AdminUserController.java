package denizgulerf.github.io.staff.administration.controller;

import denizgulerf.github.io.staff.administration.FeignClient.UserClient;
import denizgulerf.github.io.staff.administration.dto.UserDto;
import denizgulerf.github.io.staff.administration.dto.UserRoleUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/users")
@RequiredArgsConstructor
public class AdminUserController {

    private final UserClient userClient;

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto request) {
        return ResponseEntity.ok(userClient.adminCreateUser(request));
    }

    @PatchMapping("/{id}/role")
    public ResponseEntity<?> updateRole(@PathVariable String id,
                                        @RequestBody UserRoleUpdateRequestDto request) {
        return ResponseEntity.ok(userClient.updateUserRole(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        userClient.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}

