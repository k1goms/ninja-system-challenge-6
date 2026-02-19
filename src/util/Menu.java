package util;

import model.Ninja;

import java.util.LinkedList;
import java.util.Scanner;

public class Menu {

    private final Scanner SC = new Scanner(System.in);

    public void showMenu() {
        System.out.println("""
        
        ===== NINJA SYSTEM =====
        1 - Show all ninjas
        2 - Add ninja to start
        3 - Add ninja to end
        4 - Remove first ninja
        5 - Search ninja by name
        6 - Get ninja by index
        7 - Sort ninjas
        0 - Exit
        Choose an option:
        """);

    }

    public void sortByMenu() {
        System.out.println("""
        Sort by:
        1 - Name
        2 - Age
        3 - Village
        Choose:
        """);

    }



    public boolean confirmRemoveFirst() {

        while (true) {
            System.out.print("Are you sure you want to remove the first ninja? (Y/N): ");
            String choice = SC.nextLine().trim();

            if (choice.equalsIgnoreCase("Y")) {
                return true;
            }

            if (choice.equalsIgnoreCase("N")) {
                System.out.println("Operation cancelled.");
                return false;
            }

            System.out.println("Invalid choice. Please type Y or N.");
        }
    }


}
