package ru.kogut.soapclient.products.wsdl;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "text"
})

@XmlRootElement(name = "GetAnswerResponse", namespace = "http://kogut.ru/ws/products")
public class GetAnswerResponse {

    @XmlElement(required = true)
    private String text;
    @XmlElement
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetAnswerResponse() {
    }

    public GetAnswerResponse(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
