package com.rohini.inventorymanagementsystem.service;

import com.rohini.inventorymanagementsystem.entity.Supplier;
import com.rohini.inventorymanagementsystem.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Supplier addSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier updateSupplier(int id, Supplier supplier) {
        Supplier existingSupplier = supplierRepository.findById(id).orElseThrow();
        existingSupplier.setName(supplier.getName());
        existingSupplier.setPhoneNumber(supplier.getPhoneNumber());
        existingSupplier.setAddress(supplier.getAddress());
        return supplierRepository.save(existingSupplier);
    }

    @Override
    public void deleteSupplier(int id) {
        supplierRepository.deleteById(id);
    }
}