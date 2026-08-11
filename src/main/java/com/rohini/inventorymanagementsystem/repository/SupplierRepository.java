package com.rohini.inventorymanagementsystem.repository;

import com.rohini.inventorymanagementsystem.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}