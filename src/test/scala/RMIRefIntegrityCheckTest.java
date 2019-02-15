import org.junit.Test;

public class RMIRefIntegrityCheckTest {
    @Test
    public void checkIntegrityTestReturnsTrue(){
        RMIRefIntegrityCheck rmiRefIntegrityCheck = new RMIRefIntegrityCheck();
        Integer a = 10;
        Integer b = a;
        assert(rmiRefIntegrityCheck.checkObject(a,b)==true);

    }

    @Test
    public void checkIntegrityTestReturnsFalse(){
        RMIRefIntegrityCheck rmiRefIntegrityCheck = new RMIRefIntegrityCheck();
        Integer a = 10;
        Integer b = 20;
        assert(rmiRefIntegrityCheck.checkObject(a,b)==false);

    }
}
