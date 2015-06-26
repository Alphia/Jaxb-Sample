package com.hg.learning;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;


public class CustomMarshaller<T> {
    private final Marshaller marshaller;
    private T obj;

    public CustomMarshaller(T object) throws JAXBException {
        this.obj = object;
        JAXBContext responseContext = JAXBContext.newInstance(obj.getClass());
        marshaller = responseContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
    }

    public String marshal() throws JAXBException {
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj, writer);
        return writer.toString();
    }
}
