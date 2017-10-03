import Exceptions.AlreadyPaidException;
import Exceptions.IncorrectValueException;
import Exceptions.NoSuchAssociateException;
import Exceptions.NoSuchQuoteException;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.TreeMap;

/**
 * Created by mlobo1997 on 21/09/2017.
 */
public class AssociatesManager implements project, Serializable{
    private Long associatesNumber;
    private TreeMap<Long,Associate> associates;
    private Long quotesNumber;
    private TreeMap<Long, Quote> quotes;

    /** Constructor for Associates Manager.
     *
     */
    public AssociatesManager(){
        associatesNumber = new Long(0);
        quotesNumber = new Long(0);
        associates = new TreeMap<>();
        quotes = new TreeMap<>();
    }

    /** Quotes getter
     *
     * @return Quotes
     */
    public TreeMap<Long, Quote> getQuotes() {
        return quotes;
    }

    /** Associates getter.
     *
     * @return Associates
     */
    public TreeMap<Long, Associate> getAssociates(){
        return associates;
    }

    public void payQuote(Long ID, Double value) throws NoSuchQuoteException, AlreadyPaidException, IncorrectValueException {
        Quote q = quotes.get(ID);
        Quote q2;
        if(q != null){
            q2 = associates.get(q.getAssociate()).getQuote(ID);
            if(q.getValue().equals(value)) {
                try {
                    q.pay();
                    q2.pay();
                } catch (AlreadyPaidException e) {
                    throw new AlreadyPaidException();
                }
            }
            else
                throw new IncorrectValueException();
        }
        else
            throw new NoSuchQuoteException();
    }

    public Associate getAssociate(Long ID){
        return associates.get(ID);
    }

    public void addQuote(Quote q){
        quotes.put(q.getID(), q.clone());
        associates.get(q.getAssociate()).addQuote(q.clone());
    }

    public void registerQuote(Double value, Long associate) throws NoSuchAssociateException {
        if(associates.containsKey(associate)) {
            quotesNumber++;
            addQuote(new Quote(quotesNumber, value, LocalDateTime.now(), associate, false));
        }
        else
            throw new NoSuchAssociateException();
    }

    public void addAssociate(Associate a){
        associates.put(a.getID(), a.clone());
    }


    public void registerAssociate(String name, String course, Year entryYear, LocalDate birthdate, String address){
        associatesNumber++;
        addAssociate(new Associate(associatesNumber, name, course, entryYear, birthdate, address));
    }

}
