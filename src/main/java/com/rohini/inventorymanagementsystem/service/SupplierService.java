package com.rohini.inventorymanagementsystem.service;

import com.rohini.inventorymanagementsystem.entity.Supplier;
import java.util.List;

public interface SupplierService {
    Supplier addSupplier(Supplier supplier);
    List<Supplier> getAllSuppliers();
    Supplier updateSupplier(int id, Supplier supplier);
    void deleteSupplier(int id);
}