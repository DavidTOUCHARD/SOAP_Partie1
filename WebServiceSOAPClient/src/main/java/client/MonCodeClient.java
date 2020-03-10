package client;

public class MonCodeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloObjisService monService = new HelloObjisService();
		IHelloObjis port = monService.getHelloObjisPort();
		String resultat = port.ditBonjour("Objis");

		System.out.println(resultat);
	}

}
