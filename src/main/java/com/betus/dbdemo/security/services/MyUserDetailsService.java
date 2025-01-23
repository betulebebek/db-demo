package com.betus.dbdemo.security.services;

//import com.betus.dbdemo.security.models.User;
//import com.betus.dbdemo.security.models.UserPrincipal;
//import com.betus.dbdemo.security.repository.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
import com.betus.dbdemo.security.models.UserPrincipal;
import com.betus.dbdemo.security.models.UserTable;
import com.betus.dbdemo.security.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserTable user= repo.findByUsername(username);
        if (user == null) {
            System.out.println("User not found");
            throw new UsernameNotFoundException("User not found");
        }
        return new UserPrincipal(user);
////        return User.builder()
////                .username(user.getUsername())
////                .password(user.getPassword())
////                .roles(user.getRole().replace("ROLE","USER"))
////                .roles(user.getRole().replace("ROLE","EMPLOYEE"))
////                .build();
//    return new UserPrincipal(user);
//    }
}
}
