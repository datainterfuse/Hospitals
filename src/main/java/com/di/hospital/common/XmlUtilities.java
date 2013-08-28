package com.di.hospital.common;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

public class XmlUtilities {
	
	public <T> T unMarshal(String content, Class<T> clasz) throws Exception {
	  JAXBContext jc = JAXBContext.newInstance( clasz );
	  Unmarshaller u = jc.createUnmarshaller();
	  return u.unmarshal(new StreamSource( new StringReader( content )), clasz).getValue();
	}
	
	public <T> String marshal(T object) {
		 try {
		  StringWriter stringWriter = new StringWriter();
		  JAXBContext jc = JAXBContext.newInstance(object.getClass());
		  Marshaller m = jc.createMarshaller();
		  m.marshal(object, stringWriter);
		  return stringWriter.toString();
		 } catch (JAXBException e) {
			 return null;
		 }
	}

}
