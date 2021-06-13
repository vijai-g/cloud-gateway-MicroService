package ai.vijai.clouldgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	

	
	@GetMapping("/iamFallBack")
	public String iamFallBack() {
		return "Iam has failed you" + " Try Later";
		
	}
	
	
	
	@GetMapping("/dbbmFallBack")
	public String dbbmFallBack() {
		return "Dbbm has failed you" + " Try Later";
		
	}
}
