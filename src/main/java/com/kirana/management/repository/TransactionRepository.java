/**
 * The {@code TransactionRepository} interface provides access to transaction-related data
 * through Spring Data JPA. It extends {@code JpaRepository} to inherit CRUD (Create, Read, Update, Delete)
 * operations for the {@code Transaction} entity with the primary key of type {@code Long}.
 * <p>
 * The interface includes the following query methods:
 * - {@code findByType}: Retrieves a list of transactions based on the specified type.
 * - {@code findByDate}: Retrieves a list of transactions based on the specified date.
 * <p>
 * These query methods are automatically implemented by Spring Data JPA based on their method signatures.
 *
 * @author Dhruv Kumar
 * @version 1.0
 * @since 2024-01-04
 */
package com.kirana.management.repository;

import com.kirana.management.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction , Long> {

    /**
     * Retrieves a list of transactions based on the specified type.
     *
     * @param type The type of transactions to retrieve.
     * @return List of transactions matching the specified type.
     */
    List<Transaction> findByType(String type);

    /**
     * Retrieves a list of transactions based on the specified date.
     *
     * @param date The date on which transactions occurred.
     * @return List of transactions on the specified date.
     */
    List<Transaction> findByDate(LocalDate date);

}
