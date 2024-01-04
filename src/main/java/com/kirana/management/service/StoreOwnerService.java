/**
 * The {@code StoreOwnerService} interface defines the contract for handling business logic
 * related to store owner operations in the Kirana Management System.
 * <p>
 * It includes the following method:
 * - {@code createStoreOwner}: Creates a new store owner based on the provided {@code StoreOwnerDTO}.
 * <p>
 * Implementing classes are responsible for implementing the business logic for each method.
 *
 * @author Dhruv Kumar
 * @version 1.0
 * @since 2024-01-04
 */
package com.kirana.management.service;

import com.kirana.management.dto.StoreOwnerDTO;

public interface StoreOwnerService {

    /**
     * Creates a new store owner based on the provided {@code StoreOwnerDTO}.
     *
     * @param storeOwnerDTO The data transfer object containing store owner information.
     * @return The created {@code StoreOwnerDTO}.
     */
    StoreOwnerDTO createStoreOwner(StoreOwnerDTO storeOwnerDTO);
}
