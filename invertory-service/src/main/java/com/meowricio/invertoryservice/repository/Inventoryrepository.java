package com.meowricio.invertoryservice.repository;

import com.meowricio.invertoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Inventoryrepository extends JpaRepository<Inventory, Long> {

    Optional<Inventory> findBySkuCode();
}
