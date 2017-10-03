import Exceptions.AlreadyPaidException;

import java.time.LocalDateTime;

/**
 * Created by mlobo1997 on 22/09/2017.
 */
public class Quote {
    Double value;
    LocalDateTime timestamp;
    Long ID;
    Long associate;
    Boolean paid;

    /** Quote object constructor.
     *
     * @param ID ID of the quote
     * @param value Value of the quote
     * @param timestamp Timestamp of the quote
     * @param associate Quote's associate
     * @param paid Is it paid?
     */
    public Quote(Long ID, Double value, LocalDateTime timestamp, Long associate, Boolean paid) {
        this.value = value;
        this.timestamp = timestamp;
        this.ID = ID;
        this.associate = associate;
        this.paid = paid;
    }

    /** ID getter
     *
     * @return ID
     */
    public Long getID() {
        return ID;
    }

    /** Associate getter
     *
     * @return Associate ID
     */
    public Long getAssociate() {
        return associate;
    }

    public Double getValue() {
        return value;
    }

    public void pay() throws AlreadyPaidException{
        if(!paid)
            paid = true;
        else
            throw new AlreadyPaidException();
    }

    /** Clone method
     *
     * @return New quote object
     */
    public Quote clone(){
        return new Quote(ID, value, timestamp, associate, paid);
    }

    @Override
    public String toString() {
        return "Quote{" +
                ", ID=" + ID +
                ", associate=" + associate +
                ", timestamp=" + timestamp +
                "value=" + value +
                ", paid=" + paid +
                '}';
    }
}
