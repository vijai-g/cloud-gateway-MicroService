package ai.vijai.clouldgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ClouldGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClouldGatewayApplication.class, args);
	}
	/*
	 * @Bean public ReactiveResilience4JCircuitBreakerFactory
	 * reactiveResilience4JCircuitBreakerFactory(CircuitBreakerRegistry
	 * circuitBreakerRegistry) { ReactiveResilience4JCircuitBreakerFactory
	 * reactiveResilience4JCircuitBreakerFactory = new
	 * ReactiveResilience4JCircuitBreakerFactory();
	 * reactiveResilience4JCircuitBreakerFactory.configureCircuitBreakerRegistry(
	 * circuitBreakerRegistry); return reactiveResilience4JCircuitBreakerFactory; }
	 */
}
