/**
 * The {@code StoreOwnerRepository} interface provides access to store owner-related data
 * through Spring Data JPA. It extends {@code JpaRepository} to inherit CRUD (Create, Read, Update, Delete)
 * operations for the {@code StoreOwner} entity with the primary key of type {@code Integer}.
 * <p>
 * This interface does not include additional query methods as it relies on the default CRUD operations
 * provided by Spring Data JPA for basic repository functionality.
 *
 * @author Dhruv Kumar
 * @version 1.0
 * @since 2024-01-04
 */
package com.kirana.management.repository;
import com.kirana.management.model.StoreOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreOwnerRepository extends JpaRepository<StoreOwner , Integer> {

}
