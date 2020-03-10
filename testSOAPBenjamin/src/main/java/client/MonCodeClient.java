package client;

public class MonCodeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloObjisWSService monService = new HelloObjisWSService();
		IHelloObjis port = monService.getHelloObjisWSPort();
		String resultat = port.ditBonjour("Objis zbeuzbeub");

		System.out.println(resultat);
	}

}
