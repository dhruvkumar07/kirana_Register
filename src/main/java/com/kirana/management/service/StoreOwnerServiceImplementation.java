/**
 * The {@code StoreOwnerServiceImplementation} class implements the {@code StoreOwnerService} interface
 * and provides the concrete implementation of store owner-related business logic in the Kirana Management System.
 * It is annotated as a {@code Service} to indicate that it is a Spring service component.
 * <p>
 * This class includes the following method:
 * - {@code createStoreOwner}: Creates a new store owner based on the provided {@code StoreOwnerDTO}.
 * <p>
 * Dependencies are injected using the {@code Autowired} annotation, and the {@code StoreOwnerRepository}
 * is used to interact with the data layer.
 *
 * @author Dhruv Kumar
 * @version 1.0
 * @since 2024-01-04
 */
package com.kirana.management.service;

import com.kirana.management.dto.StoreOwnerDTO;
import com.kirana.management.model.StoreOwner;
import com.kirana.management.repository.StoreOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreOwnerServiceImplementation implements StoreOwnerService {
    private final StoreOwnerRepository storeOwnerRepository;
    @Autowired
    public StoreOwnerServiceImplementation(StoreOwnerRepository storeOwnerRepository){
        this.storeOwnerRepository = storeOwnerRepository;
    }

    /**
     * Creates a new store owner based on the provided {@code StoreOwnerDTO}.
     *
     * @param storeOwnerDTO The data transfer object containing store owner information.
     * @return The created {@code StoreOwnerDTO}.
     */
    @Override
    public StoreOwnerDTO createStoreOwner(StoreOwnerDTO storeOwnerDTO) {
        StoreOwner storeOwner = new StoreOwner();
        storeOwner.setOwnerName(storeOwnerDTO.getOwnerName());
        storeOwner.setStoreAddress(storeOwnerDTO.getStoreAddress());
        storeOwner.setBalanceINR(storeOwnerDTO.getBalanceINR());

        StoreOwner newStoreOwner = storeOwnerRepository.save(storeOwner);

        StoreOwnerDTO storeOwnerResponse = new StoreOwnerDTO();
        storeOwnerResponse.setId(newStoreOwner.getId());
        storeOwnerResponse.setOwnerName(newStoreOwner.getOwnerName());
        storeOwnerResponse.setStoreAddress(newStoreOwner.getStoreAddress());
        storeOwnerResponse.setBalanceINR(newStoreOwner.getBalanceINR());

        return storeOwnerResponse;
    }
}
