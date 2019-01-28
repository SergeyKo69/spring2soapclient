package ru.kogut.soapclient;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.kogut.soapclient.clients.wsdl.*;
import ru.kogut.soapclient.clients.wsdl.GetAnswerResponse;
import ru.kogut.soapclient.products.wsdl.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SoaPclientApplicationTests {

	@Autowired
	ClientsClient clientsClient;

	@Autowired
	ProductsClient productsClient;

	@Test
	public void clientsTest() {
		SaveClientRequest clientRequest = new SaveClientRequest();
		clientRequest.setTitle("title client");
		clientRequest.setAddress("addres client");
		clientRequest.setDelete(false);
		GetAnswerResponse response = clientsClient.saveClient(clientRequest);
		Assert.assertEquals("OK", response.getText());
		Assert.assertFalse(response.getId() == null);
		GetClientByIdRequest getClientByIdRequest = new GetClientByIdRequest();
		getClientByIdRequest.setId(response.getId());
		GetClientResponse clientResponse = clientsClient.getClientById(getClientByIdRequest);
		Assert.assertNotNull(clientResponse.getClient());
		DeleteClientRequest deleteClientRequest = new DeleteClientRequest();
		deleteClientRequest.setClient(clientResponse.getClient());
		clientsClient.deleteClient(deleteClientRequest);
		clientResponse = clientsClient.getClientById(getClientByIdRequest);
		Assert.assertNull(clientResponse.getClient());
	}

	@Test
	public void productsTest() {
		SaveProductRequest productRequest = new SaveProductRequest();
		productRequest.setTitle("title client");
		productRequest.setDiscription("discr client");
		productRequest.setDelete(false);
		ru.kogut.soapclient.products.wsdl.GetAnswerResponse response = productsClient.saveProduct(productRequest);
		Assert.assertEquals("OK", response.getText());
		Assert.assertFalse(response.getId() == null);
		GetProductByIdRequest getProductByIdRequest = new GetProductByIdRequest();
		getProductByIdRequest.setId(response.getId());
		GetProductResponse productResponse = productsClient.getProductById(getProductByIdRequest);
		Assert.assertNotNull(productResponse.getProduct());
		DeleteProductRequest deleteProductRequest = new DeleteProductRequest();
		deleteProductRequest.setProduct(productResponse.getProduct());
		productsClient.deleteProduct(deleteProductRequest);
		productResponse = productsClient.getProductById(getProductByIdRequest);
		Assert.assertNull(productResponse.getProduct());
	}

}

