package com.example.demo.configuration;

import org.apache.tinkerpop.gremlin.driver.Cluster;
import org.apache.tinkerpop.gremlin.driver.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GremlinConfig {
    @Bean
    public Client gremlinClient() {
        Cluster cluster = Cluster.build()
                .addContactPoint("localhost")
                .port(8182)
                .create();
        return cluster.connect();
    }
}
