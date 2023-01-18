package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        //Endpoint.publish("http://localhost:9191",new BanqueService());
        String url="http://0.0.0.0:9191/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service déployé sur "+url );
    }
}
