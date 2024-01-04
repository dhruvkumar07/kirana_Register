/**
 * The {@code StoreOwner} class represents a store owner in the Kirana Management System.
 * It is annotated as an entity for persistence using Jakarta Persistence API (JPA) and is mapped
 * to the "store_owner" table in the database. This class utilizes Project Lombok annotations
 * such as {@code Data}, {@code Entity}, {@code Table}, {@code AllArgsConstructor}, and {@code NoArgsConstructor}
 * to automatically generate boilerplate code for getters, setters, constructors, and other common
 * methods, reducing code verbosity.
 * <p>
 * The fields in this class include:
 * - {@code id}: An auto-generated unique identifier.
 * - {@code ownerName}: The name of the store owner.
 * - {@code storeAddress}: The address of the store owned by the store owner.
 * - {@code balanceINR}: The balance in Indian Rupees associated with the store owner.
 * <p>
 * This class facilitates the storage and retrieval of store owner-related information in the
 * Kirana Management System.
 *
 * @author Dhruv Kumar
 * @version 1.0
 * @since 2024-01-04
 */
package com.kirana.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "store_owner")
@AllArgsConstructor
@NoArgsConstructor
public class StoreOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ownerName;
    private String storeAddress;
    private BigDecimal balanceINR;

}
