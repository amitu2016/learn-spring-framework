package com.amitu.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {}
record Address(String firstLine, String city) {}

@Configuration
public class HelloSpringConfiguration {
	
	@Bean
	public String name() {
		return "Amit";
	}
	
	@Bean
	public int age() {
		return 27;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 14, new Address("Kharghar", "Mumbai"));
	}
	
	@Bean
	public Person person2() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean
	public Address address() {
		return new Address("Nilmatha", "Lucknow");
	}
	
	@Bean
	public Address address3() {
		return new Address("Aminabad", "Lucknow");
	}

}
