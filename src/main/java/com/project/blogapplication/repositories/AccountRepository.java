package com.project.blogapplication.repositories;

import com.project.blogapplication.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

 Optional<Account> findOneByEmailIgnoreCase(String email);
}