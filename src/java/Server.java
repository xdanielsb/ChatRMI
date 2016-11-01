import Interface.InterfaceRMI;
import java.rmi.Naming;
/**
 *
 * @author Daniel Santos
 */
public class Server {

    public Server() {
        try {
            InterfaceRMI i = new ImplementationRMI();
            //Bound to the registry
            Naming.rebind("MessageSystem", i);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    public static void main(String[] args) {
        new Server();
        System.out.println("The Server has started.");
        System.out.println("The Server is listening...");
    }

}
