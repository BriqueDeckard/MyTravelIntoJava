package edu.deq4.spring_core;

import edu.deq4.spring_core.beans.MyComponent;
import edu.deq4.spring_core.beans.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
		MyService myService = new MyService(new MyComponent());
		myService.doSomething();
	}

}
