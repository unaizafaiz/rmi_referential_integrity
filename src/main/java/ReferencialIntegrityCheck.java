import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReferencialIntegrityCheck extends Remote {
    Boolean checkObject(Object a, Object b) throws RemoteException;
}
