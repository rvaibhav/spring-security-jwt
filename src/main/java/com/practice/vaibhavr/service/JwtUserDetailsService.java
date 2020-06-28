package com.practice.vaibhavr.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class JwtUserDetailsService implements UserDetailsService {

    private static final String USER_NAME="javainuse";

    private static final String PASSWORD="$2a$10$Oq2KVmKzBscZv4c0J2Jdtubga0.78AsTf8HeDPb8LObJRy1xfPuuK";

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if("javainuse".equals(username)) {
            return new User(USER_NAME, PASSWORD, new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username " + username);
        }
    }
}
