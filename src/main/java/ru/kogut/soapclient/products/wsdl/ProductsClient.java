package ru.kogut.soapclient.products.wsdl;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import ru.kogut.soapclient.products.wsdl.*;

import javax.xml.bind.JAXBElement;

public class ProductsClient extends WebServiceGatewaySupport {

    private final String URI = "http://localhost:8080/ws";
    private final String SAVE_ACTION = "http://kogut.ru/ws/products/ProductsPort/saveProductRequest";
    private final String UPDATE_ACTION = "http://kogut.ru/ws/products/ProductsPort/updateProductRequest";
    private final String DELETE_ACTION = "http://kogut.ru/ws/products/ProductsPort/deleteProductRequest";
    private final String GET_ALL_ACTION = "http://kogut.ru/ws/products/ProductsPort/getAllProductsRequest";
    private final String GET_BY_ID_ACTION = "http://kogut.ru/ws/products/ProductsPort/getProductByIdRequest";

    @ResponseBody
    public GetAnswerResponse saveProduct(final SaveProductRequest product) {

        JAXBElement<GetAnswerResponse> response =
                (JAXBElement<GetAnswerResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(URI, product,
                        new SoapActionCallback(
                                SAVE_ACTION));

        return response.getValue();

    }

    public GetAnswerResponse updateProduct(final UpdateProductRequest request) {

        JAXBElement<GetAnswerResponse> response = (JAXBElement<GetAnswerResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(URI, request,
                        new SoapActionCallback(
                                UPDATE_ACTION));

        return response.getValue();

    }

    public GetProductResponse getProductById(final GetProductByIdRequest request) {

        JAXBElement<GetProductResponse> response = (JAXBElement<GetProductResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(URI, request,
                        new SoapActionCallback(
                                GET_BY_ID_ACTION));

        return response.getValue();

    }

    public GetAllProductsResponse getAllProducts() {

        JAXBElement<GetAllProductsResponse> response = (JAXBElement<GetAllProductsResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(URI, "",
                        new SoapActionCallback(
                                SAVE_ACTION));

        return response.getValue();

    }

    public GetAnswerResponse deleteProduct(final DeleteProductRequest request) {

        JAXBElement<GetAnswerResponse> response = (JAXBElement<GetAnswerResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(URI, request,
                        new SoapActionCallback(
                                SAVE_ACTION));

        return response.getValue();

    }
}
