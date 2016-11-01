
import Interface.InterfaceRMI;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Daniel Santos
 */
public class ImplementationRMI extends UnicastRemoteObject implements InterfaceRMI {

    public ImplementationRMI() throws RemoteException {
        super();
    }

    @Override
    public void showName(String name) throws RemoteException {
        System.out.println("Your name is: "+ name);
    }
    
    @Override
    public String Greet(String name) throws RemoteException {
        String greeting = "Hey, I am pleased to meet you "+ name;
        return greeting;
    }
}
