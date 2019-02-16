import java.io.*;

/**
 * Class implementing remote interface
 */
public class RMIRefIntegrityCheck implements ReferencialIntegrityInterface {


    //Checking referential integrity constrain
    // Method that checks if two parameters passed refer to same object
    @Override
    public Boolean checkObject(Client obj1, Client obj2) {

        try{

            //Serializing object1
            FileOutputStream fos = new FileOutputStream("object1.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj1);
            oos.close();
            fos.close();

            //Serializing object2
            FileOutputStream fos2 = new FileOutputStream("object2.ser");
            ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
            oos2.writeObject(obj2);
            oos2.close();
            fos2.close();

            //Print values before changing field variable
            System.out.println("Object field value before changing:");

            System.out.println("Client1 " +obj1.a);
            System.out.println("Client2 " +obj2.a);

            //Changing field value on obj1
            obj1.a = 100;


            //Print values after changing field variable
            System.out.println("Object field value after changing:");

            System.out.println("Client1 " +obj1.a);
            System.out.println("Client2 " +obj2.a);

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        //thus returns true if the reference of both the objects is the same
        return obj1==obj2;
    }

}
