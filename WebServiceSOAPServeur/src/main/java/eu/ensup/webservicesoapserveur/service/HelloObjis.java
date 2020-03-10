package eu.ensup.webservicesoapserveur.service;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface = "eu.ensup.webservicesoapserveur.service.IHelloObjis")
@HandlerChain(file = "LogMessageHandler.xml")
public class HelloObjis implements IHelloObjis {

	@Override
	public String ditBonjour(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name + " !";
	}

}
