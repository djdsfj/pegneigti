package com.igti.pa.PeqNegIGTI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igti.pa.PeqNegIGTI.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	Category findByid(long id); 

}