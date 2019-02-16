import org.junit.Test;

public class RMIRefIntegrityCheckTest {
    @Test
    public void checkIntegrityTestReturnsTrue(){
        RMIRefIntegrityCheck rmiRefIntegrityCheck = new RMIRefIntegrityCheck();

        Client c = new Client(10);
        Client c2 = c;

        assert(rmiRefIntegrityCheck.checkObject(c,c2)==true);

    }

    @Test
    public void checkIntegrityTestReturnsFalse(){
        RMIRefIntegrityCheck rmiRefIntegrityCheck = new RMIRefIntegrityCheck();
        Client c = new Client(10);
        Client c2 = new Client(20);
        assert(rmiRefIntegrityCheck.checkObject(c,c2)==false);

    }
}
