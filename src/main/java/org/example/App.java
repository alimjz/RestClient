package org.example;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriBuilder;
import org.glassfish.jersey.client.ClientConfig;

import java.net.URI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        WebTarget webTarget = client.target(getBaseUrl());
        System.out.println(webTarget.request().accept(MediaType.APPLICATION_JSON).get(String.class));
    }

    private static URI getBaseUrl() {
        return UriBuilder.fromUri("http://localhost:8080/RestServer_war_exploded/rest/users").build();
    }
}
