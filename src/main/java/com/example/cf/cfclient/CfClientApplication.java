package com.example.cf.cfclient;

import org.cloudfoundry.client.CloudFoundryClient;
import org.cloudfoundry.operations.CloudFoundryOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CfClientApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(CfClientApplication.class, args);
    }

    @Autowired
    private CloudFoundryOperations cloudFoundryOperations;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        cloudFoundryOperations.applications().list().subscribe(System.out::println);
    }
}
