package com.example.demo;

import java.util.Optional;

//import com.example.demo.User;
//import com.example.demo.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService {


    @Autowired
    private repository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(username);
 

        user.orElseThrow(() -> new UsernameNotFoundException("User Not Found" + username));

        return user.map(Myuserdetails::new).get();
    }

    
}
