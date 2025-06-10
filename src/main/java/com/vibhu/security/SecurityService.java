package com.vibhu.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityService implements UserDetailsService {

    private final UserRepo userRepo;

    public SecurityService(UserRepo userRepo) {
        this.userRepo = userRepo;
System.out.println("SecurityService constructor called with userRepo: " + userRepo);
        // This will print the UserRepo instance to verify it's being injected correctly
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MyUser myUser = userRepo.findByUsername(username);

        if (myUser == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return myUser;
    }
}
