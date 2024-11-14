package Model;

public class Passanger {
    private String passangerID;
    private String passangerName;
    private int passengerGender;
    private int passengerAge;

    public Passanger() {
    }

    public Passanger(String passangerID, String passangerName, int passengerGender, int passengerAge) {
        this.passangerID = passangerID;
        this.passangerName = passangerName;
        this.passengerGender = passengerGender;
        this.passengerAge = passengerAge;
    }

    public String getPassangerID() {
        return passangerID;
    }

    public void setPassangerID(String passangerID) {
        this.passangerID = passangerID;
    }

    public String getPassangerName() {
        return passangerName;
    }

    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }

    public int getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(int passengerGender) {
        this.passengerGender = passengerGender;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public void getPassangerInfo() {
        System.out.println(getPassangerID());
        System.out.println(getPassangerName());
        System.out.println(getPassengerAge());
        System.out.println(getPassengerGender());

    }
}
