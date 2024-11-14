package Controller;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import java.util.Date;
import Model.*;

public class TicketController{
    public static List<Ticket> listTickets;
    public static List<Passanger> listPassangers;
    public static List<Reservation> listReservations;
    public static List<Train> listTrains;
    public static List<OnlinePayment> listOnlinePayments;
    public static List<Payment> listPayments;
    public static Scanner sc = new Scanner(System.in);

    public void CreateDummy(){
        listTickets.add(new Ticket("T001", "A1", ClassType.FIRST_CLASS, TicketStatus.PAID, 200.0));
        listTickets.add(new Ticket("T002", "B2", ClassType.BUSINESS_CLASS, TicketStatus.AWAITING_PAYMENT, 150.0));
        listTickets.add(new Ticket("T003", "C3", ClassType.ECONOMY_CLASS, TicketStatus.CANCELED, 75.0));
        listTickets.add(new Ticket("T004", "D4", ClassType.FIRST_CLASS, TicketStatus.PAID, 200.0));
        listTickets.add(new Ticket("T005", "E5", ClassType.ECONOMY_CLASS, TicketStatus.PAID, 80.0));

        listTrains.add(new Train(101, "Argo Parahyangan", TrainType.STANDARD));
        listTrains.add(new Train(102, "Taksaka", TrainType.FASTTRAIN));
        listTrains.add(new Train(103, "Matarmaja", TrainType.FASTTRAIN));
        listTrains.add(new Train(104, "Gajayana", TrainType.STANDARD));
        listTrains.add(new Train(105, "Jayabaya", TrainType.STANDARD));

        listPassangers.add(new Passanger("P001", "Alice", 1, 25));
        listPassangers.add(new Passanger("P002", "Bob", 0, 30));
        listPassangers.add(new Passanger("P003", "Charlie", 0, 28));
        listPassangers.add(new Passanger("P004", "Diana", 1, 22));
        listPassangers.add(new Passanger("P005", "Edward", 0, 35));

        listReservations.add(new Reservation("R001", getDate(2024, Calendar.JANUARY, 10)));
        listReservations.add(new Reservation("R002", getDate(2024, Calendar.FEBRUARY, 15)));
        listReservations.add(new Reservation("R003", getDate(2024, Calendar.MARCH, 20)));
        listReservations.add(new Reservation("R004", getDate(2024, Calendar.APRIL, 25)));
        listReservations.add(new Reservation("R005", getDate(2024, Calendar.MAY, 30)));
    }

    private static Date getDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        return cal.getTime();
    }

    public TicketController(){
        CreateDummy();
    }

    public static Double makePayment(Double ammount){
        for (Train train : listTrains) {
            if (train.getTrainType() == TrainType.STANDARD) {
                for (Ticket ticket : listTickets){
                    if (ticket.getClassType() == ClassType.FIRST_CLASS){
                        ammount = 350000.00;
                    } else if (ticket.getClassType() == ClassType.BUSINESS_CLASS){
                        ammount = 250000.00;
                    } else {
                        ammount = 175000.00;
                    }
                }
            }
            if (train.getTrainType() == TrainType.FASTTRAIN) {
                for (Ticket ticket : listTickets){
                    if (ticket.getClassType() == ClassType.FIRST_CLASS){
                        ammount = 600000.00;
                    } else if (ticket.getClassType() == ClassType.BUSINESS_CLASS){
                        ammount = 500000.00;
                    } else {
                        ammount = 400000.00;
                    }
                }
            }
            System.out.print("Mau bayar pakai apa \n1. Online \n2. Offline : ");
            int mau = sc.nextInt();
            switch (mau) {
                case 1:
                    System.out.print("\n1. PayPal \n2. DOKU \n3. Xendit");
                    String pilih = sc.nextLine();

                    listOnlinePayments.add(new OnlinePayment("OP" + ("01"), pilih));
                    break;
            
                case 0:
                    
                    break;
            }
        }
        return ammount;
    }

    public static Double calculateTotalRevenue(Double ammount){
        for (Train train : listTrains) {
            if (train.getTrainType() == TrainType.STANDARD) {
                for (Ticket ticket : listTickets){
                    if (ticket.getClassType() == ClassType.FIRST_CLASS){
                        ammount += 350000.00;
                    } else if (ticket.getClassType() == ClassType.BUSINESS_CLASS){
                        ammount += 250000.00;
                    } else {
                        ammount += 175000.00;
                    }
                }
            }
            if (train.getTrainType() == TrainType.FASTTRAIN) {
                for (Ticket ticket : listTickets){
                    if (ticket.getClassType() == ClassType.FIRST_CLASS){
                        ammount += 600000.00;
                    } else if (ticket.getClassType() == ClassType.BUSINESS_CLASS){
                        ammount += 500000.00;
                    } else {
                        ammount += 400000.00;
                    }
                }
            }
        }
        return ammount;
    }

    public void getTrainDetails(){
        for(Train train : listTrains){
            System.out.println(train.getTrainNumber());
            System.out.println(train.getTrainName());
            System.out.println(train.getTrainType());
        }
    }

    public void getPassangerInfo(){
        for (Passanger passanger : listPassangers) {
            System.out.println(passanger.getPassangerID());
            System.out.println(passanger.getPassangerName());
            System.out.println(passanger.getPassengerAge());
            System.out.println(passanger.getPassengerGender());
        }
    }

    public void printTicket(){
        for (Ticket ticket : listTickets){
            System.out.println(ticket.getTicketID());
            System.out.println(ticket.getSeatNumber());
            System.out.println(ticket.getClassType());
            System.out.println(ticket.getStatus());
            System.out.println(ticket.getPrice());
        }
    }

    public void getTicketStatus(){
        for (Ticket ticket : listTickets){
            System.out.println(ticket.getStatus());
        }
    }

    public void reserveSeat(){
        int kursi;
        System.out.print("Mau beli berapa kursi : ");
        kursi = sc.nextInt();
        for (int i = 0; i < kursi; i++) {
            listReservations.add(new Reservation("R" + ("006"+ i + 1) , getDate(2024, Calendar.NOVEMBER, 15)));
        }
    }

    public void cancelReservation(){

    }

    public static void main(String[] args) {
        System.out.print(listPassangers);
    }
}
