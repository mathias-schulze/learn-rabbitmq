package de.msz.learnrabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnrabbitmqApplication implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(LearnrabbitmqApplication.class, args);
	}

	@Override
	public void run(String... args) {
		rabbitTemplate.convertAndSend("TestExchange", "TestRouting", "Hello RabbitMQ!");
	}
}
