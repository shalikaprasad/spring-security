package com.prasad.springsecurityauth2.repository;

import com.prasad.springsecurityauth2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String s) throws UsernameNotFoundException;
}
