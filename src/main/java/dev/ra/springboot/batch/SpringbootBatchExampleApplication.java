package dev.ra.springboot.batch;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBatchExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBatchExampleApplication.class, args);

	}

}
