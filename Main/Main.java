package Main;

import Controller.TicketController;
import View.MainMenu;

public class Main {
    public static void main(String[] args) {
        TicketController controller = new TicketController();
        MainMenu menu = new MainMenu(controller);
    }
}
