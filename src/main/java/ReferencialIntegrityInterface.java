import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReferencialIntegrityInterface extends Remote {

    //Checks referntial integrity of objects passed as parameter
    Boolean checkObject(Client a, Client b) throws RemoteException;
}
