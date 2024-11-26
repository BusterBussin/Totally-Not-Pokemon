import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); 
        Methods method = new Methods();
        int rng = 0;
        int rarity = 0;
        char option = ' ';
        boolean encounter = false;
        boolean shiny = false;
        boolean caught = false;
        boolean escaped = false;
        String name = " ";
        System.out.println("Do you want to catch a pokemon? (Y/N)");
        option = scan.nextLine().toUpperCase().charAt(0);
        while (option != 'Y' && option != 'N') {
            System.out.println("Invalid choice. Do you want to catch a pokemon? (Y/N)");
            option = scan.nextLine().toUpperCase().charAt(0);
        }
        if (option == 'N') {
            System.out.println("Goodbye.");
            scan.close();
            System.exit(0);
        }
        while (option == 'Y') { 
            if (method.encounter(rng, encounter)) {
                name =  method.getPokemon(rng);
                System.out.println(name);
            } else {
                System.out.println("No pokemon have been found.");
            }
        System.out.println("Do you want to play again?");
        option = scan.nextLine().toUpperCase().charAt(0);
        while (option != 'Y' && option != 'N') {
            System.out.println("Invalid choice. Do you want to catch a pokemon? (Y/N)");
            option = scan.nextLine().toUpperCase().charAt(0);
        }
        }
    }
}