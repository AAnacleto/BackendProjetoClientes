package com.allysson.clientes;

import com.allysson.clientes.model.repository.ClienteRepository;
import com.allysson.clientes.model.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

	//@Bean
	//public CommandLineRunner run(@Autowired ClienteRepository repository){
	//	return args -> {
    //        Cliente cliente = new Cliente().builder().cpf("12345678999").nome("fulano").build();
	//		repository.save(cliente);
	//	};
	//}

	public static void main(String[] args) {

		SpringApplication.run(ClientesApplication.class, args);
	}

}
