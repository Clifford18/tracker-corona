package io.javaprojcts.trackercorona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication

// helps wrap the schedule method in a proxy and run it at the specified frequency
@EnableScheduling
public class TrackerCoronaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackerCoronaApplication.class, args);
	}

}
