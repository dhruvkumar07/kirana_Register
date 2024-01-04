/**
 * The {@code TransactionService} interface defines the contract for handling business logic
 * related to transaction operations in the Kirana Management System.
 * <p>
 * It includes the following methods:
 * - {@code addNewTransaction}: Adds a new transaction based on the provided {@code TransactionDTO}.
 * - {@code allTransactionByType}: Retrieves a list of transactions based on the specified type.
 * - {@code allTransactionByDate}: Retrieves a list of transactions on the specified date.
 * <p>
 * Implementing classes are responsible for implementing the business logic for each method.
 *
 * @author Dhruv Kumar
 * @version 1.0
 * @since 2024-01-04
 */
package com.kirana.management.service;

import com.kirana.management.dto.TransactionDTO;

import java.time.LocalDate;
import java.util.List;

public interface TransactionService {

    /**
     * Adds a new transaction based on the provided {@code TransactionDTO}.
     *
     * @param transactionDTO The data transfer object containing transaction information.
     * @return The created {@code TransactionDTO}.
     * @throws Exception If an error occurs during transaction creation.
     */
    TransactionDTO addNewTransaction(TransactionDTO transactionDTO) throws Exception;

    /**
     * Retrieves a list of transactions based on the specified type.
     *
     * @param type The type of transactions to retrieve.
     * @return List of transactions matching the specified type.
     */
    List<TransactionDTO> allTransactionByType(String type);

    /**
     * Retrieves a list of transactions on the specified date.
     *
     * @param date The date on which transactions occurred.
     * @return List of transactions on the specified date.
     */
    List<TransactionDTO> allTransactionByDate(LocalDate date);
}
