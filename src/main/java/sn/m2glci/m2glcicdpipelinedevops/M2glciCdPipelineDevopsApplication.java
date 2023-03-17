package sn.m2glci.m2glcicdpipelinedevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class M2glciCdPipelineDevopsApplication {

	@GetMapping("/bonjour")
	public String bonjour(){
		return "Bonjour M2 Genie Logiciel";
	}
	public static void main(String[] args) {
		SpringApplication.run(M2glciCdPipelineDevopsApplication.class, args);
	}

}
