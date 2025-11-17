package denizgulerf.github.io.staff.administration.controller;

import denizgulerf.github.io.staff.administration.FeignClient.UserClient;
import denizgulerf.github.io.staff.administration.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserQueryController {

    private final UserClient userClient;

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userClient.getAllUsers());
    }
}

