package com.simplilearn;

import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//I have used predefined method for spring Authentication
public class CustomAuthenticationProvider implements AuthenticationProvider {
    List<User> dummyUsers = new ArrayList<>();
     
    //I have created here one method For Authentication Credential which will be asked for authentication during accesing the server
    public CustomAuthenticationProvider() {
        dummyUsers.add(new User("ravikant", "ravimp", "ROLE_USER"));
        dummyUsers.add(new User("raviadmin", "ravi", "ROLE_ADMIN"));
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();

        //jdk 8 -- stream
        Optional<User> authenticatedUser = dummyUsers.stream().filter(
                user -> user.getName().equals(name) && user.getPassword().equals(password)
        ).findFirst();

        if(!authenticatedUser.isPresent()){
            throw new BadCredentialsException("Some Text");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(authenticatedUser.get().getRole()));
        Authentication auth = new UsernamePasswordAuthenticationToken(name, password, authorities);
        return auth;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}