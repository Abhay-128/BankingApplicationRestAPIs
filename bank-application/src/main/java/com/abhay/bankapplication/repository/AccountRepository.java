package com.abhay.bankapplication.repository;

import com.abhay.bankapplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
