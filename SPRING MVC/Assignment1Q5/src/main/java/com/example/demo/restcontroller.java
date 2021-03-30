package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.apache.catalina.User;

//import com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/")
public class restcontroller {
    @Autowired
    public repository Repositry;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/user")
    public List<user> getalluser()
    {
     return Repositry.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/users")
    public List<user> getallusers()
    {
     return Repositry.findAll();
}

     @CrossOrigin(origins = "http://localhost:3000")
     @PostMapping("/users")
     public user createUser(@RequestBody user User)
     {
        return Repositry.save(User);
     }
     @CrossOrigin(origins = "http://localhost:3000")
     @GetMapping("/users/{id}")
     public ResponseEntity<user> getuserbyid(@PathVariable Long id)

     {
         user User=Repositry.findById(id).orElseThrow(()->new exception("User not found"));
         return ResponseEntity.ok(User);
     }
    
     @CrossOrigin(origins = "http://localhost:3000")
     @PutMapping("/users/{id}")
     public ResponseEntity<user> updateuserbyid(@PathVariable Long id,@RequestBody user UserDetails)

     {
         user User=Repositry.findById(id).orElseThrow(()->new exception("User not found"));
       
         User.setFirstname(UserDetails.getFirstname());
         User.setLastname(UserDetails.getLastname());
         User.setUsername(UserDetails.getUsername());
         User.setPassword(UserDetails.getPassword());

         user updateduser=Repositry.save(User);
         return ResponseEntity.ok(updateduser);
     }

     @CrossOrigin(origins = "http://localhost:3000")
     @DeleteMapping("/users/{id}")
     public ResponseEntity<Map<String, Boolean>> deleteuser(@PathVariable Long id)
     {
          user User=Repositry.findById(id).orElseThrow(()->new exception("User not found"+ id));

            Repositry.delete(User);
         // return ResponseEntity.ok(updateduser);
           Map<String,Boolean> response=new HashMap<>();
           response.put("deleted", Boolean.TRUE);
           return ResponseEntity.ok(response);
     }
}
