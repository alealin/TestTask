package testwork.rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import testwork.rest_api.entity.Client;
import testwork.rest_api.service.Impl.ClientServiceImpl;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class RestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
        Client test = new Client(1,"Test Testov");
        ClientServiceImpl.getRep().put(1,test);
        System.out.println(ClientServiceImpl.getRep().get(1));

    }



    }
