package com.igti.pa.PeqNegIGTI;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PeqNegIgtiApplication implements CommandLineRunner {
	
	//@Autowired
	//private CategoryRepository categoryRepository;
	//atualizaçao
	
	//@Autowired
	//private ProductRepository productrepository;
	public static void main(String[] args) {
		SpringApplication.run(PeqNegIgtiApplication.class, args);
	}


	public void run(String... args) throws Exception {
		//Category cat1 = new Category(1l, "comida");
		//Category cat2 = new Category(2l, "eletronicos");

		//Product p1 = new Product(null, "PF", 22.00, cat1);
		//Product p2 = new Product(null, "Peças de celular", 15.00, cat2);
		//Product p3 = new Product(null, "Saladas",9.99 , cat1);
		//Product p4 = new Product(null, "Guarda-chuva", 20.00, cat2);

		//cat1.getProducts().addAll(Arrays.asList(p1, p3));
		//cat2.getProducts().addAll(Arrays.asList(p2, p4));
		//categoryRepository.save(cat1);
		//categoryRepository.save(cat2);
		//productrepository.save(p1);
		//productrepository.save(p2);
		//productrepository.save(p3);
		//productrepository.save(p4);
		
	}
}
