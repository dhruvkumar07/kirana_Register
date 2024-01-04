package com.kirana.management.model;

/**
 * The {@code Transaction} class represents a financial transaction in the Kirana Management System.
 * It is annotated as an entity for persistence using Jakarta Persistence API (JPA) and is mapped
 * to the "transactions" table in the database. This class utilizes Project Lombok annotations
 * such as {@code Data}, {@code Entity}, {@code Table}, {@code AllArgsConstructor}, and {@code NoArgsConstructor}
 * to automatically generate boilerplate code for getters, setters, constructors, and other common
 * methods, reducing code verbosity.
 * <p>
 * The fields in this class include:
 * - {@code id}: A unique identifier generated using the {@code GenerationType.SEQUENCE}.
 * - {@code type}: The type of the transaction.
 * - {@code amountBeforeTransaction}: The amount before the transaction.
 * - {@code transactionAmount}: The amount involved in the transaction.
 * - {@code balanceAmount}: The balance amount after the transaction.
 * - {@code balanceAmountUSD}: The balance amount in USD currency.
 * - {@code date}: The date of the transaction, annotated with {@code DateTimeFormat} to specify the
 *   expected date pattern "yyyy-MM-dd".
 * <p>
 * This class facilitates the storage and retrieval of transaction-related information in the
 * Kirana Management System.
 *
 * @author Dhruv Kumar
 * @version 1.0
 * @since 2024-01-04
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "transactions")
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String type;
    private BigDecimal amountBeforeTransaction;
    private BigDecimal transactionAmount;
    private BigDecimal balanceAmount;

    private BigDecimal balanceAmountUSD;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

}
