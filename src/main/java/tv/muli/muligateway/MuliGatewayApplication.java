package tv.muli.muligateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MuliGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuliGatewayApplication.class, args);
    }

}
