import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client{
    public static void main(String[] args) {

        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            Registry registry = LocateRegistry.getRegistry(5000);
            ReferencialIntegrityCheck stub = (ReferencialIntegrityCheck) registry.lookup("RemoteObjectCheck");
            ReferencialIntegrityCheck stub2 = stub;
            Boolean response = stub.checkObject(stub2,stub);
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}