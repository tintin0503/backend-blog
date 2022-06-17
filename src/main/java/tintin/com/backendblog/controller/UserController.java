package tintin.com.backendblog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tintin.com.backendblog.dto.UserDto;
import tintin.com.backendblog.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping()
    public List<UserDto> getAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(userService.getById(id));
    }

    @PostMapping("/users")
    public void createUser(@Validated @RequestBody UserDto user) {
        //TODO: add return type
        userService.save(user);
    }

//    @PutMapping("/users/{id}")
//    public User updateUser(@PathVariable("id") Long id, @Validated @RequestBody User user) {
//        user.setId(id);
//        return userRepository.save(user);
//    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.delete(id);
    }
}
