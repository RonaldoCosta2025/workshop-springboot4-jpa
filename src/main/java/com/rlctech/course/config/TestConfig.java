package com.rlctech.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rlctech.course.entities.Category;
import com.rlctech.course.entities.Order;
import com.rlctech.course.entities.User;
import com.rlctech.course.entities.enums.OrderStatus;
import com.rlctech.course.repoitories.CategoryRepository;
import com.rlctech.course.repoitories.OrderRepository;
import com.rlctech.course.repoitories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	// INJEÇÃO DE DEPENDENCIA COM USEREPOSITORY
	// @Autowired - ASSOCIA UMA INSTANCIA DE USERREPOSITORY
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	// instanciando objetos e salvando no bd
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		//salva os dados no bd
		categoryRepository.saveAll(Arrays.asList(cat1));
		categoryRepository.saveAll(Arrays.asList(cat2));
		categoryRepository.saveAll(Arrays.asList(cat3));
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERD, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u1);

	

		// salva os dados
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	
	}

}
