package Model;

public class Ticket {
    private String ticketID;
    private String seatNumber;
    private ClassType classType;
    private TicketStatus status;
    private double price;

    public Ticket() {
    }

    public Ticket(String ticketID, String seatNumber, ClassType classType, TicketStatus status, double price) {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.status = status;
        this.price = price;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printTicket() {
        System.out.println(getTicketID());
        System.out.println(getSeatNumber());
        System.out.println(getClassType());
        System.out.println(getStatus());
        System.out.println(getPrice());
    }

    public void getTicketStatus(){
        System.out.println(getStatus());
    }
}
