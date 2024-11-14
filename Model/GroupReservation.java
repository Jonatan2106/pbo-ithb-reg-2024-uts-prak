package Model;

public class GroupReservation {
    private String groupName;
    private int numberofPassanger;
    public GroupReservation() {
    }
    public GroupReservation(String groupName, int numberofPassanger) {
        this.groupName = groupName;
        this.numberofPassanger = numberofPassanger;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public int getNumberofPassanger() {
        return numberofPassanger;
    }
    public void setNumberofPassanger(int numberofPassanger) {
        this.numberofPassanger = numberofPassanger;
    }

}
