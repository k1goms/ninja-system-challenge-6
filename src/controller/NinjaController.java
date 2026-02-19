package controller;

import enums.SortOption;
import model.Ninja;
import model.NinjaDTO;
import service.NinjaService;
import util.Menu;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class NinjaController {

    private final Menu MENU = new Menu();
    private final NinjaService NINJA_SERVICE = new NinjaService();
    private final Scanner SC = new Scanner(System.in);

    public void start() {
        String option;

        do {
            MENU.showMenu();
            option = SC.nextLine();

            switch (option) {
                case "1" -> showAllNinjas();
                case "2" -> addNinjaToStart();
                case "3" -> addNinjaToEnd();
                case "4" -> removeFirstNinja();
                case "5" -> searchNinjaByName();
                case "6" -> getNinjaByIndex();
                case "7" -> sortNinjas();
                case "0" -> System.out.println("Exiting system...");
                default -> System.out.println("Invalid option.");
            }

        } while (!option.equals("0"));

    }

    private NinjaDTO insertNinjaAttributes() {

        System.out.print("Insert name: ");
        String name = SC.nextLine();

        System.out.print("Insert age: ");
        int age = Integer.parseInt(SC.nextLine());

        System.out.print("Insert village: ");
        String village = SC.nextLine();

        return new NinjaDTO(name, age, village);
    }


    private void showAllNinjas() {
        List<NinjaDTO> ninjas = NINJA_SERVICE.getAllNinjas();
        System.out.println("NINJA LIST:");
        ninjas.forEach(System.out::println);
    }

    private void addNinjaDefault(Consumer<NinjaDTO> action, String message) {
        try {
            NinjaDTO ninjaDTO = insertNinjaAttributes();
            action.accept(ninjaDTO);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private void addNinjaToStart() {
        addNinjaDefault(NINJA_SERVICE::addNinjaToStart, "Ninja added to start successfully.");
    }


    private void addNinjaToEnd() {
        addNinjaDefault(NINJA_SERVICE::addNinjaToEnd, "Ninja added to end successfully.");

    }

    private void removeFirstNinja() {
        try {
            boolean confirmation = MENU.confirmRemoveFirst();

            if (!confirmation) {
                System.out.println("Action cancelled.");
                return;
            }

            NinjaDTO ninjaRemoved = NINJA_SERVICE.removeFirstNinja();
            System.out.printf("Ninja %s removed successfully.%n", ninjaRemoved.name());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private void searchNinjaByName() {

        System.out.println("Insert name: ");
        String name = SC.nextLine();

        NinjaDTO ninja = NINJA_SERVICE.searchNinjaByName(name);
        System.out.println(ninja);

    }

    private void getNinjaByIndex() {

        System.out.println("Insert index: ");
        int index = Integer.parseInt(SC.nextLine());
        NinjaDTO ninja = NINJA_SERVICE.getNinjaByIndex(index);
        System.out.println(ninja);

    }

    private void sortNinjas() {

        MENU.sortByMenu();
        String choice = SC.nextLine();

        SortOption option;

        switch (choice) {
            case "1":
                option = SortOption.NAME;
                break;
            case "2":
                option = SortOption.AGE;
                break;
            case "3":
                option = SortOption.VILLAGE;
                break;
            default:
                System.out.println("Invalid option.");
                return;
        }

        NINJA_SERVICE.sortListByAttribute(option);
        System.out.println("Ninjas sorted successfully.");
    }



}
