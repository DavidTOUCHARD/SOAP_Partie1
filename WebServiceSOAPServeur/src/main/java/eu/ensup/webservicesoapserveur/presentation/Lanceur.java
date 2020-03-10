package eu.ensup.webservicesoapserveur.presentation;

import javax.xml.ws.Endpoint;

import eu.ensup.webservicesoapserveur.service.HelloObjis;

public class Lanceur {

	public static final String URI = "http://192.168.40.211:8888/hello";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloObjis impl = new HelloObjis();

		Endpoint endpoint = Endpoint.publish(Lanceur.URI, impl);
		boolean status = endpoint.isPublished();
		System.out.println("Web Service disponible ? : " + status);

		// String name = "TEST";
		// System.out.println(webservice.ditBonjour(name));
	}

}
