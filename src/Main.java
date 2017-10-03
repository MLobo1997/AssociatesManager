import Exceptions.AlreadyPaidException;
import Exceptions.IncorrectValueException;
import Exceptions.NoSuchAssociateException;
import Exceptions.NoSuchQuoteException;

import java.time.LocalDate;
import java.time.Year;

/**
 * Created by mlobo1997 on 21/09/2017.
 */
public class Main {

    /*
    public static void main(String [] argc){
        AssociatesManager pr = new AssociatesManager();
        AssociatesWindows gui = new AssociatesWindows();

        pr.registerAssociate("Miguel Leite", "MIEI", Year.of(2015), LocalDate.of(1997,2,28), "Gaia");
        pr.registerAssociate("Sara Sá", "Economia", Year.of(2016), LocalDate.of(1997,7,24), "Gaia");
        pr.registerAssociate("Miguel Leite", "MIEI", Year.of(2015), LocalDate.of(1997,2,28), "Gaia");
        pr.registerAssociate("Miguel Leite", "MIEI", Year.of(2015), LocalDate.of(1997,2,28), "Gaia");

        try {
            pr.registerQuote(12.0, new Long(3));
        }catch (NoSuchAssociateException e){
            System.out.println("No such associate");
        }

        try {
            pr.registerQuote(4.0, new Long(3));
        }catch (NoSuchAssociateException e){
            System.out.println("No such associate");
        }

        try {
            pr.registerQuote(4.0, new Long(2));
        }catch (NoSuchAssociateException e){
            System.out.println("No such associate");
        }

        try {
        pr.registerQuote(4.0, new Long(5));
        }catch (NoSuchAssociateException e){
            System.out.println("No such associate");
        }

        try{
            pr.payQuote(new Long(1), 12.0);
        }catch (AlreadyPaidException e){
            System.out.println("Já está paga");
        }catch (IncorrectValueException e){
            System.out.println("Valor incorreto");
        }catch (NoSuchQuoteException e){
            System.out.println("ID inexistente");
        }

        try{
            pr.payQuote(new Long(2), 3.0);
        }catch (AlreadyPaidException e){
            System.out.println("Já está paga");
        }catch (IncorrectValueException e){
            System.out.println("Valor incorreto");
        }catch (NoSuchQuoteException e){
            System.out.println("ID inexistente");
        }

        System.out.println(pr.getAssociates());
        System.out.println(pr.getQuotes());
    }
    */
}
