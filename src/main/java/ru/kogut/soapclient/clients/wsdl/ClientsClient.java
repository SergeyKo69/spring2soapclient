package ru.kogut.soapclient.clients.wsdl;

import com.sun.xml.internal.txw2.annotation.XmlNamespace;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;

public class ClientsClient extends WebServiceGatewaySupport {

    private final String URI = "http://localhost:8080/ws";
    private final String SAVE_ACTION = "http://kogut.ru/ws/clients/ClientsPort/saveClientRequest";
    private final String UPDATE_ACTION = "http://kogut.ru/ws/clients/ClientsPort/updateClientRequest";
    private final String DELETE_ACTION = "http://kogut.ru/ws/clients/ClientsPort/deleteClientRequest";
    private final String GET_ALL_ACTION = "http://kogut.ru/ws/clients/ClientsPort/getAllClientsRequest";
    private final String GET_BY_ID_ACTION = "http://kogut.ru/ws/clients/ClientsPort/getClientByIdRequest";

    @ResponseBody
    public GetAnswerResponse saveClient(final SaveClientRequest client) {

        JAXBElement<GetAnswerResponse> response = (JAXBElement<GetAnswerResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(URI, client,
                        new SoapActionCallback(
                                SAVE_ACTION));

        return response.getValue();

    }

    public GetAnswerResponse updateClient(final UpdateClientRequest request) {

        JAXBElement<GetAnswerResponse> response = (JAXBElement<GetAnswerResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(URI, request,
                        new SoapActionCallback(
                                UPDATE_ACTION));

        return response.getValue();

    }

    public GetClientResponse getClientById(final GetClientByIdRequest request) {

        JAXBElement<GetClientResponse> response = (JAXBElement<GetClientResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(URI, request,
                        new SoapActionCallback(
                                GET_BY_ID_ACTION));

        return response.getValue();

    }

    public GetAllClientsResponse getAllClients() {

        JAXBElement<GetAllClientsResponse> response = (JAXBElement<GetAllClientsResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(URI, "",
                        new SoapActionCallback(
                                SAVE_ACTION));

        return response.getValue();

    }

    public GetAnswerResponse deleteClient(final DeleteClientRequest request) {

        JAXBElement<GetAnswerResponse> response = (JAXBElement<GetAnswerResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(URI, request,
                        new SoapActionCallback(
                                SAVE_ACTION));

        return response.getValue();

    }

}
