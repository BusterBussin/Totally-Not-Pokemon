import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

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
        boolean shiny = false;
        ArrayList<String> arrLst = new ArrayList<String>();
        System.out.println("Do you want to catch a Pokemon? (Y/N)");
        catching = scan.nextLine().toUpperCase().charAt(0);
        while (catching == 'Y' || catching == 'C') {
            encounter = method.encounter(rng, encounter);

            if (encounter) {
                name = method.getPokemon(rng);
                if (method.shiny()) {
                    shinySound();
                    System.out.println("These colors look unusual... (Shiny)");
                    shiny = true;
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
                            if (shiny) {
                                arrLst.add("Shiny " + name);
                            } else {
                            arrLst.add(name);
                            }
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
                shiny = false;
            } else {
                System.out.println("There are no pokemon out right now.");
            }
            System.out.println("Would you like to catch another pokemon? (Y/N)\nYou can press I to view your pokemon.");
            catching = scan.nextLine().toUpperCase().charAt(0);
            if (catching == 'I') {
                for (int i = 0; i < arrLst.size(); i++) {
                    System.out.println(arrLst.get(i));
                }
                System.out.println("Press enter to continue.");
                catching = 'Y';
                scan.nextLine();
            }
        }
        scan.close();
        System.exit(0);
    }

    public static void shinySound() {
        try {
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(new File("shiny.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
}