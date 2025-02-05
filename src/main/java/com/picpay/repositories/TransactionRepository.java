package com.picpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpay.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
