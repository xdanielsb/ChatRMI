package Interface;

/**
 *
 * @author Daniel Santos
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceRMI extends Remote {
    public void showName(String name) throws RemoteException;
    public String Greet(String name) throws RemoteException;
}
