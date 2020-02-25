package br.crudspring.controllers;


import br.crudspring.models.User;
import br.crudspring.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

@RestController
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/all")
    Collection<User> usuarios() {
        return userRepository.findAll();
    }

    @GetMapping("/usuario/{id}")
    ResponseEntity<?> getUser(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(response -> ResponseEntity.ok()
                .body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/novo")
    ResponseEntity<User> createUser(@RequestBody User user) throws URISyntaxException {

        User result = userRepository.save(user);
        return ResponseEntity.created(new URI("/novo" + result.getId())).body(result);
    }

    @PutMapping("/alterar/{id}")
    ResponseEntity<User> updateUser(@Valid @RequestBody User category){
        User result= userRepository.save(category);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/deletar/{id}")
    ResponseEntity<?> deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}