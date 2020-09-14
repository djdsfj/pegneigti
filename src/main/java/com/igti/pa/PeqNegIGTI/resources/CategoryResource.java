package com.igti.pa.PeqNegIGTI.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igti.pa.PeqNegIGTI.entities.Category;
import com.igti.pa.PeqNegIGTI.repositories.CategoryRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/categories")
@Api(value="API REST Categorias")
@CrossOrigin(origins = "*")
public class CategoryResource {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping
	@ApiOperation(value="Retorna uma lista de Categorias")
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = categoryRepository.findAll(); 
				
				
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	@ApiOperation(value="Retorna uma id de Categorias")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}