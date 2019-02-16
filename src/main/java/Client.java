import java.io.Serializable;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import static java.lang.Thread.sleep;

public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    int a =10;

    Client(int c){
        a = c;
    }

    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            sleep(1000);
            //Get the registry where the RMI is located
            Registry registry = LocateRegistry.getRegistry(5000);

            //Looking up the remote object by name
            ReferencialIntegrityInterface stub = (ReferencialIntegrityInterface) registry.lookup("RemoteObjectCheck");

            Client client =  new Client(20);
            Client alias = client;
            //Passing the two objects to the remote method
            Boolean response = stub.checkObject(client, alias);

            //If the response returned is true then the objects passed retain the same reference
            // and hence the referential integrity constrain is maintained
            System.out.println("response: " + response);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}