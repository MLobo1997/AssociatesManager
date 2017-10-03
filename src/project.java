import Exceptions.AlreadyPaidException;
import Exceptions.IncorrectValueException;
import Exceptions.NoSuchQuoteException;

import java.util.Map;

/**
 * Created by mlobo1997 on 21/09/2017.
 */
public interface project {
    public Map<Long, Associate> getAssociates();
    public void payQuote(Long ID, Double value) throws NoSuchQuoteException, AlreadyPaidException, IncorrectValueException;
    public Associate getAssociate(Long ID);
    public void addAssociate(Associate a);
}
