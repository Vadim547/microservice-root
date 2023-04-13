package com.meowricio.invertoryservice.service;

import com.meowricio.invertoryservice.repository.Inventoryrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final Inventoryrepository inventoryrepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode) {
        return inventoryrepository.findBySkuCode()
                .isPresent();
    }
}
