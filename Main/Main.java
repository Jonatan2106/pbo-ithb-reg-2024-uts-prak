package Main;

import Controller.TicketController;
import View.MainMenu;

public class Main {
    // Asumsi Method di diagram ada di controller
    public static void main(String[] args) {
        TicketController controller = new TicketController();
        MainMenu menu = new MainMenu(controller);
    }
}
