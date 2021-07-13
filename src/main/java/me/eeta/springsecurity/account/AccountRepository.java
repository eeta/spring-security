package me.eeta.springsecurity.account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    void findByUsername(String username);
}