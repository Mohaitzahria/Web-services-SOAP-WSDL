import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJaxWs {
    public static void main(String[] args) {
        //demarer un petit serveur http
        Endpoint.publish("http://0.0.0.0/9191", new BanqueService());
        System.out.println("serveur deployé sur http//0.0.0.0/9991");
    }
}
