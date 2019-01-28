package ru.kogut.soapclient.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import ru.kogut.soapclient.clients.wsdl.ClientsClient;

//@Configuration
public class ClientsConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("ru.kogut.soapclient.clients.wsdl");
        return marshaller;
    }

    @Bean
    public ClientsClient clientsClient(Jaxb2Marshaller marshaller) {
        ClientsClient client = new ClientsClient();
        client.setDefaultUri("http://localhost:8080/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
