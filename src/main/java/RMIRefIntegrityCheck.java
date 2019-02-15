public class RMIRefIntegrityCheck implements ReferencialIntegrityCheck {
    @Override
    public Boolean checkObject(Object a, Object b) {
        return a==b;
    }
}
