import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        char catching = ' ';
        Scanner scan = new Scanner(System.in);
        Methods method = new Methods();
        boolean encounter = false;
        int rng = 0;
        String name = " ";
        boolean caught = false;
        boolean escaped = false;
        char action = ' ';
        int catchrng;

        System.out.println("Do you want to catch a Pokemon? (Y/N)");
        catching = scan.nextLine().toUpperCase().charAt(0);
        while (catching == 'Y') {
            method.encounter(rng, encounter);

            if (encounter) {
                method.getPokemon(rng);
                if (method.shiny()) {
                    System.out.println("These colors look unusual... (Shiny)");
                }
                System.out.println("You found " + name + "!");
                while (action != 'R' && !caught && !escaped) {
                    System.out.println("\t C to catch \n\t R to run");
                    action = scan.nextLine().toUpperCase().charAt(0);
                    if (action == 'C') {
                        catchrng = (int) (Math.random() * 5);
                        if (catchrng == 4) {
                            caught = true;
                            System.out.println(name + " was caught!");
                        } else {
                            System.out.println(name + " broke free!");
                        }
                        if (!caught && action != 'R') {
                            rng = (int) (Math.random() * 16);
                            if (rng == 15) {
                                escaped = true;
                                System.out.println(name + " escaped!");
                            }
                        }
                    }
                }
                if (action == 'R') {
                    System.out.println("You ran away!");
                }
                action = ' ';
                caught = false;
                escaped = false;
            } else {
                System.out.println("There are no pokemon out right now.");
            }
        }

    }
}