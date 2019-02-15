import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

    public Server() {
        super();
    }

    public static void main(String args[]) {

        try {
            String name = "RemoteObjectCheck";
            ReferencialIntegrityCheck engine = new RMIRefIntegrityCheck();
            ReferencialIntegrityCheck stub =
                    (ReferencialIntegrityCheck) UnicastRemoteObject.exportObject(engine, 0);
            Registry registry;
            if((registry = LocateRegistry.getRegistry(5000))!=null)
                 registry = LocateRegistry.createRegistry(5000);
            registry.rebind(name, stub);
            System.out.println("Server started");

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }


}
