package View;

import java.util.Scanner;

import Controller.TicketController;

public class MainMenu {
    private TicketController controller;
    public static Scanner sc = new Scanner(System.in);

    public MainMenu(TicketController controller){
        this.controller = controller;
    }

    public static void main(String[] args) {
        System.out.print("Mau pilih yang mana : \n1. Make payment \n2. calculate total revenue \nPilih: ");
        int pilih = sc.nextInt();
        Double ammount = 0.0;

        switch (pilih) {
            case 1:
                Controller.TicketController.makePayment(ammount);
                break;
        
            case 2:
                Controller.TicketController.calculateTotalRevenue(ammount);
                break;
        }
    }
}
