import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
        // terrible attempt of doing a json, feel free to change
        JSONObject pkmInfo = loadPKMInfoFromFile("pokemon.json");
        if (pkmInfo == null) {
            pkmInfo = new JSONObject();
            pkmInfo.put("Pokemon", new JSONArray());
        }
        JSONArray pokemonList = (JSONArray) pkmInfo.get("Pokemon");
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
                            JSONObject newPokemon = new JSONObject();
                            if (shiny) {
                                // If shiny, save the pokemon as "Shiny" and the pokemon name
                                newPokemon.put("Name", "Shiny" + name);
                            } else {
                                // Else, save the pokemon normally.
                                newPokemon.put("Name", name);
                            }
                            newPokemon.put("Shiny", shiny);
                            pokemonList.add(newPokemon);
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
            savePKMInfoToFile(pkmInfo, "pokemon.json");
            System.out.println("Would you like to catch another pokemon? (Y/N)\nYou can press I to view your pokemon.");
            catching = scan.nextLine().toUpperCase().charAt(0);
            if (catching == 'I') {
                for (Object obj : pokemonList) {
                    JSONObject pokemon = (JSONObject) obj;
                    System.out.println("Name: " + pokemon.get("Name") + "\n Shiny: " + pokemon.get("Shiny"));
                }
                System.out.println("Press enter to continue.");
                catching = 'Y';
                scan.nextLine();
            }
        }
        savePKMInfoToFile(pkmInfo, "pokemon.json");
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

    // Should load pokemon. feel free to change.
    private static JSONObject loadPKMInfoFromFile(String filename) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(filename));
            JSONObject jsonObject = (JSONObject) obj;
            return jsonObject;
        } catch (Exception e) {
            System.out.println("Error reading file, initializing empty album info.");
            return null; // Return null if the file does not exist or there is an error
        }
    }

    // Should save pokemon.
    private static void savePKMInfoToFile(JSONObject pkmInfo, String filename) {
        try (FileWriter file = new FileWriter(filename)) {
            file.write(pkmInfo.toJSONString()); // Put the "Albums" key with the album data
            file.flush();
        } catch (IOException e) {
            System.out.println("Error saving to file.");
        }
    }
}