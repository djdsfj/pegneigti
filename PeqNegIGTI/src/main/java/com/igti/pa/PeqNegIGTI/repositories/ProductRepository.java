package com.igti.pa.PeqNegIGTI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igti.pa.PeqNegIGTI.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findByid(long id); 
}