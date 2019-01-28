//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.28 at 10:51:02 AM MSK 
//


package ru.kogut.soapclient.clients.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clients.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllClientsRequest_QNAME = new QName("http://kogut.ru/ws/clients", "getAllClientsRequest");

    private final static QName _GetAnswerResponse_QNAME = new QName("http://kogut.ru/ws/clients", "GetAnswerResponse");

    private final static QName _GetClientResponse_QNAME = new QName("http://kogut.ru/ws/clients", "GetClientResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clients.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveClientRequest }
     * 
     */
    public SaveClientRequest createSaveClientRequest() {
        return new SaveClientRequest();
    }

    /**
     * Create an instance of {@link UpdateClientRequest }
     * 
     */
    public UpdateClientRequest createUpdateClientRequest() {
        return new UpdateClientRequest();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link GetClientByIdRequest }
     * 
     */
    public GetClientByIdRequest createGetClientByIdRequest() {
        return new GetClientByIdRequest();
    }

    /**
     * Create an instance of {@link DeleteClientRequest }
     * 
     */
    public DeleteClientRequest createDeleteClientRequest() {
        return new DeleteClientRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */

    @XmlElementDecl(namespace = "http://kogut.ru/ws/clients", name = "getAllClientsRequest")
    public JAXBElement<Object> createGetAllClientsRequest(Object value) {
        return new JAXBElement<Object>(_GetAllClientsRequest_QNAME, Object.class, null, value);
    }

    @XmlElementDecl(namespace = "http://kogut.ru/ws/clients", name = "GetAnswerResponse")
    public JAXBElement<GetAnswerResponse> createGetAnswerResponse(GetAnswerResponse value) {
        return new JAXBElement<GetAnswerResponse>(_GetAnswerResponse_QNAME, GetAnswerResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://kogut.ru/ws/clients", name = "GetClientResponse")
    public JAXBElement<GetClientResponse> createGetAnswerResponse(GetClientResponse value) {
        return new JAXBElement<GetClientResponse>(_GetAnswerResponse_QNAME, GetClientResponse.class, null, value);
    }
}
