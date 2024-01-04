/**
 * The {@code StoreOwnerController} class handles HTTP requests related to store owner operations
 * in the Kirana Management System. It is annotated as a {@code RestController} and specifies
 * the base request mapping as "/api/". This class contains methods to create a new store owner.
 * <p>
 * The class includes the following methods:
 * - {@code createStoreOwner}: Handles HTTP POST requests to create a new store owner. It accepts
 *   a {@code StoreOwnerDTO} as the request body and returns a {@code ResponseEntity} containing
 *   the created {@code StoreOwnerDTO} with HTTP status {@code CREATED (201)}.
 * <p>
 * Dependencies are injected using the {@code Autowired} annotation, and the {@code StoreOwnerService}
 * is used to perform store owner-related business logic.
 *
 * @author Dhruv Kumar
 * @version 1.0
 * @since 2024-01-04
 */
package com.kirana.management.controller;

import com.kirana.management.dto.StoreOwnerDTO;
import com.kirana.management.service.StoreOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class StoreOwnerController {

    private final StoreOwnerService storeOwnerService;
    @Autowired
    public StoreOwnerController(StoreOwnerService storeOwnerService){
        this.storeOwnerService = storeOwnerService;
    }

    /**
     * Handles HTTP POST requests to create a new store owner.
     *
     * @param storeOwnerDTO The data transfer object containing store owner information.
     * @return ResponseEntity with the created StoreOwnerDTO and HTTP status CREATED (201).
     */
    @PostMapping("storeOwner/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<StoreOwnerDTO> createStoreOwner(@RequestBody StoreOwnerDTO storeOwnerDTO){
        StoreOwnerDTO storeOwnerDTOCreated = storeOwnerService.createStoreOwner(storeOwnerDTO);
        return new ResponseEntity<>(storeOwnerDTOCreated , HttpStatus.CREATED);
    }
}
