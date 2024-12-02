
public class Methods {
    public boolean encounter(int rng, boolean encounter) {
        rng = (int) (Math.random() * 101);
        if (rng < 0 || rng > 100) {
            System.out.println("Missingno found!");
            System.out.println("Report the missingno to the creator.");
            System.out.println("rng = " + rng);
            System.exit(0);
        }
        if (rng > 50) {
            return true;
        } else {
        return false;
        }
    }

    public String getPokemon(int rng) {
        rng = (int) (Math.random() * 2001);
        if (rng <= 1000) {
            String[] common = { "Caterpie", "Weedle", "Pidgey", "Rattata", "Spearow", "Ekans", "Sandshrew", "Nidoran-F",
                    "Nidoran-M", "Clefairy", "Vulpix", "Jigglypuff", "Zubat", "Oddish", "Paras", "Venonat", "Diglett",
                    "Meowth", "Psyduck", "Mankey", "Growlithe", "Poliwag", "Abra", "Machop", "Bellsprout", "Tentacool",
                    "Geodude", "Ponyta", "Slowpoke", "Magnemite", "Farfetch'd", "Doduo", "Seel", "Grimer", "Shellder",
                    "Gastly", "Onix", "Drowzee", "Krabby", "Voltorb", "Exeggcute", "Cubone", "Lickitung", "Koffing",
                    "Rhyhorn", "Chansey", "Tangela", "Horsea", "Goldeen", "Staryu", "Mr. Mime", "Scyther", "Jynx",
                    "Electabuzz", "Magmar", "Pinsir", "Tauros", "Magikarp", "Ditto", "Eevee", "Porygon", "Omanyte",
                    "Kabuto", "Dratini", "Bulbasaur", "Charmander", "Squirtle", "Pikachu", "Metapod", "Kakuna",
                    "Pidgeotto", "Raticate", "Fearow", "Nidorino", "Nidorina" };
            int i = (int) (Math.random() * common.length);
            return common[i];
        } else if (rng > 1000 && rng < 1751) {
            String[] rare = { "Ivysaur", "Charmeleon", "Wartortle", "Raichu", "Butterfree", "Beedrill", "Arbok",
                    "Sandslash", "Clefable", "Ninetales", "Primeape", "Poliwhirl", "Golbat", "Dugtrio", "Venomoth",
                    "Persian", "Tentacruel", "Parasect", "Gloom", "Wigglytuff", "Golduck", "Kadabra", "Machoke",
                    "Weepinbell", "Graveler", "Rapidash", "Magneton", "Dodrio", "Dewgong", "Muk", "Cloyster", "Haunter",
                    "Onix", "Hypno", "Kingler", "Electrode", "Exeggutor", "Marowak", "Hitmonlee", "Hitmonchan",
                    "Weezing", "Rhydon", "Kangaskhan", "Seadra", "Seaking", "Starmie", "Lapras", "Omastar", "Kabutops",
                    "Aerodactyl", "Dragonair" };
            int i = (int) (Math.random() * rare.length);
            return rare[i];
        } else if (rng > 1750 && rng < 1990) {
            String[] superrare = { "Venusaur", "Charizard", "Blastoise", "Pidgeot", "Nidoqueen", "Nidoking",
                    "Vileplume", "Arcanine", "Poliwrath", "Alakazam", "Machamp", "Victreebel", "Golem", "Slowbro",
                    "Gengar", "Gyarados", "Vaporeon", "Flareon", "Jolteon", "Snorlax", "Dragonite" };
            int i = (int)(Math.random() * superrare.length);
            return superrare[i];
        } else if (rng > 1989 && rng < 2000) {
            String[] legend = {"Articuno", "Moltres", "Zapdos", "Mewtwo"};
            int i = (int)(Math.random() * legend.length);
            return legend[i];
        } else if (rng == 2000) {
            return "Mew";
        } else {
            System.out.println("You found a missingno. Please report these numbers to the creator.");
            System.out.println("rng = " + rng);
            System.exit(0);
            return null;
        }
    }

    public boolean shiny() {
        int shinyRate = (int)(Math.random() * 4097);
        if (shinyRate == 4096) {
            return true;
        }
        return false;
    }
}
