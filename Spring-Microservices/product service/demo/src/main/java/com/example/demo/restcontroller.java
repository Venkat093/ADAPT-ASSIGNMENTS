package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcontroller {
    
 @Autowired
 private repository Repository;
 
 
//   @Autowired
   //private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome</h1>";
    }


    @PostMapping("/signUp")
    public ResponseEntity<?> signUp(@RequestBody User user) {
        Repository.save(user);
        return ResponseEntity.ok("Added User to the Database with id: " + user.getId());
    }
    @GetMapping("/allUsers")
    public List<User> getAllUsers() {
        return Repository.findAll();
    }

    @GetMapping("/allUsers/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return Repository.findById(id);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) throws Exception {
        Repository.deleteById(id);
        return ResponseEntity.ok("deleted User to the Database with id: " + id);
    }
}
