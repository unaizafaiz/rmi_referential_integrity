import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import static java.lang.Thread.sleep;

public class Server{

    public Server() {
        super();
    }

    public static void main(String args[]) {

        try {

            //Name for the remote object
            String name = "RemoteObjectCheck";

            //Creating an instance of the remote object
            ReferencialIntegrityInterface engine = new RMIRefIntegrityCheck();
            ReferencialIntegrityInterface stub =
                    (ReferencialIntegrityInterface) UnicastRemoteObject.exportObject(engine, 0);

            //Creating the registry if the registry is not already in use
            Registry registry;
            if((registry = LocateRegistry.getRegistry(5000))!=null)
                 registry = LocateRegistry.createRegistry(5000);

            //Rebinding the name to the stub
            registry.rebind(name, stub);

            System.out.println("Server started");


        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }


}
