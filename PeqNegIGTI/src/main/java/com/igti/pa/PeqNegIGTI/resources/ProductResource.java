package com.igti.pa.PeqNegIGTI.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igti.pa.PeqNegIGTI.entities.Product;
import com.igti.pa.PeqNegIGTI.repositories.ProductRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/products")
@Api(value="API REST Produtos")
@CrossOrigin(origins = "*")
public class ProductResource {

	@Autowired
	private ProductRepository ProductRepository;
	
	//metodos atualizados
	@GetMapping
	@ApiOperation(value="Retorna uma lista de Produtos")
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = ProductRepository.findAll(); 
				
				
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	@ApiOperation(value="Retorna um id de Produtos")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product cat = ProductRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	
	@PostMapping("/produto")
	@ApiOperation(value="Salva produto")
	public Product salvaProduto(@RequestBody Product product){
		return ProductRepository.save(product);
		
	}
	
	@DeleteMapping("/produto")
	@ApiOperation(value="Deleta produto")
	public void deletaProduto(@RequestBody Product product){
		ProductRepository.delete(product);;
	}

	@PutMapping("/produto")
	@ApiOperation(value="Atualiza um produto")
	public Product atualizaProduto(@RequestBody Product product){
		return ProductRepository.save(product);
		
	}
}