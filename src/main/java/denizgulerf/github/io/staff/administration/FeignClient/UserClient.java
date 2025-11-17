package denizgulerf.github.io.staff.administration.FeignClient;

import denizgulerf.github.io.staff.administration.dto.UserDto;
import denizgulerf.github.io.staff.administration.dto.UserLoginRequestDto;
import denizgulerf.github.io.staff.administration.dto.UserRoleUpdateRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(
        name = "restfull-app",
        url = "${AUTH_SERVICE_URL:http://localhost:8080}",
        path = "/api"
)
public interface UserClient {

    // Public endpoints
    @PostMapping("/auth/register")
    UserDto register(@RequestBody UserDto userDto);

    @PostMapping("/auth/login")
    Map<String, String> login(@RequestBody UserLoginRequestDto request);

    @GetMapping("/user")
    UserDto getUser(@RequestParam("username") String username);

    @GetMapping("/users")
    List<UserDto> getAllUsers();

    // Admin endpoints
    @PostMapping("/admin/users")
    UserDto adminCreateUser(@RequestBody UserDto userDto);

    @PatchMapping("/admin/users/{id}/role")
    Map<String, String> updateUserRole(@PathVariable("id") String id,
                                       @RequestBody UserRoleUpdateRequestDto request);

    @DeleteMapping("/admin/users/{id}")
    void deleteUser(@PathVariable("id") String id);
}
