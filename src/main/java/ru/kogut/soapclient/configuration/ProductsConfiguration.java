package ru.kogut.soapclient.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import ru.kogut.soapclient.products.wsdl.ProductsClient;

@Configuration
public class ProductsConfiguration {

    @Bean
    public Jaxb2Marshaller marshallerProduct() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("ru.kogut.soapclient.products.wsdl");
        return marshaller;
    }

    @Bean
    public ProductsClient productsClient(Jaxb2Marshaller marshaller) {
        ProductsClient product = new ProductsClient();
        product.setDefaultUri("http://localhost:8080/ws");
        product.setMarshaller(marshaller);
        product.setUnmarshaller(marshaller);
        return product;
    }

}
