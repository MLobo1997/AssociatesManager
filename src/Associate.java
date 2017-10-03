import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.LinkedList;

/**
 * Created by mlobo1997 on 21/09/2017.
 */
public class Associate implements Serializable{
    private Long ID;
    private String name;
    private String course;
    private Year entryYear; //Year the associate has entered the course
    private LocalDate birthdate;
    private String address;
    private LinkedList<Quote> quotes;


    /** A constructor to create an associate.
     *
     * @param name Name of the associate.
     * @param course Course of the associate.
     * @param entryYear Year in which the associate entered the course.
     * @param birthdate Date the associate was born.
     * @param address Address of the associate.
     */
    public Associate(Long ID, String name, String course, Year entryYear, LocalDate birthdate, String address) {
        this.ID = ID;
        this.name = name;
        this.course = course;
        this.entryYear = entryYear;
        this.birthdate = birthdate;
        this.address = address;
        this.quotes = new LinkedList<>();
    }

    /** ID getter.
     *
     * @return ID
     */
    public Long getID() {
        return ID;
    }

    public void addQuote(Quote q){
        quotes.addFirst(q);
    }

    public Quote getQuote(Long ID){
        int i;
        for (i = 0 ; i < quotes.size() && !ID.equals(quotes.get(i).getID()) ; i++);
        return quotes.get(i);
    }

    /** Creates a new associate object.
     *
     * @return New associate object.
     */
    public Associate clone(){
        return new Associate(ID, name, course, entryYear, birthdate, address);
    }

    /** ToString method for debugging.
     *
     */
    @Override
    public String toString() {
        return "Associate{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", entryYear=" + entryYear +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", quotes=" + quotes +
                '}';
    }
}
