
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
                    "Pidgeotto", "Raticate", "Fearow", "Nidorino", "Nidorina", "Chikorita", "Bayleef", "Cyndaquil",
                    "Quilava", "Totodile", "Croconaw", "Sentret", "Furret", "Hoothoot", "Noctowl", "Ledyba", "Ledian",
                    "Spinarak", "Ariados", "Chinchou", "Lanturn", "Pichu", "Cleffa", "Igglybuff", "Togepi", "Togetic",
                    "Natu", "Xatu", "Mareep", "Flaaffy", "Marill", "Hoppip", "Skiploom", "Aipom", "Sunkern", "Sunflora",
                    "Yanma", "Wooper", "Paldean Wooper", "Murkrow", "Misdreavus", "Girafarig", "Pineco", "Dunsparce", "Gligar", "Snubbull",
                    "Qwilfish", "Hisuian Qwilfish", "Shuckle", "Sneasel", "Hisuian Form Sneasel", "Teddiursa", "Slugma",
                    "Swinub", "Corsola", "Galarian Corsola", "Remoraid", "Delibird", "Houndour", "Panphy", "Stantler",
                    "Smeargle", "Tyrogue", "Smoochum", "Elekid", "Magby", "Miltank", "Larvitar" };
            int i = (int) (Math.random() * common.length);
            return common[i];
        } else if (rng > 1000 && rng < 1741) {
            String[] rare = { "Ivysaur", "Charmeleon", "Wartortle", "Raichu", "Butterfree", "Beedrill", "Arbok",
                    "Sandslash", "Clefable", "Ninetales", "Primeape", "Poliwhirl", "Golbat", "Dugtrio", "Venomoth",
                    "Persian", "Tentacruel", "Parasect", "Gloom", "Wigglytuff", "Golduck", "Kadabra", "Machoke",
                    "Weepinbell", "Graveler", "Rapidash", "Magneton", "Dodrio", "Dewgong", "Muk", "Cloyster", "Haunter",
                    "Onix", "Hypno", "Kingler", "Electrode", "Exeggutor", "Marowak", "Hitmonlee", "Hitmonchan",
                    "Weezing", "Rhydon", "Kangaskhan", "Seadra", "Seaking", "Starmie", "Lapras", "Omastar", "Kabutops",
                    "Aerodactyl", "Dragonair", "Sudowoodo", "Jumpluff", "Quagsire", "Wobbuffet", "Forretress",
                    "Granbull", "Heracross", "Ursaring", "Magcargo", "Piloswine", "Octillery", "Mantine", "Skarmory",
                    "Donphan", "Porygon2", "Hitmontop", "Pupitar" };
            int i = (int) (Math.random() * rare.length);
            return rare[i];
        } else if (rng > 1740 && rng < 1751) {
            String[] unown = {"Unown (1 Form)", "Unown (A Form)",
                    "Unown (B Form)", "Unown (C Form)", "Unown (D Form)", "Unown (E Form)", "Unown (F Form)",
                    "Unown (G Form)", "Unown (H Form)", "Unown (I Form)", "Unown (J Form)", "Unown (K Form)",
                    "Unown (L Form)", "Unown (M Form)", "Unown (N Form)", "Unown (O Form)", "Unown (P Form)",
                    "Unown (Q Form)", "Unown (R Form)", "Unown (S Form)", "Unown (T Form)", "Unown (U Form)",
                    "Unown (V Form)", "Unown (W Form)", "Unown (X Form)", "Unown (Y Form)", "Unown (Z Form)",
                    "Unown (! Form)", "Unown (? Form)"};
            int i = (int) (Math.random() * unown.length);
            return unown[i];
        } else if (rng > 1750 && rng < 1990) {
            String[] superrare = { "Venusaur", "Charizard", "Blastoise", "Pidgeot", "Nidoqueen", "Nidoking",
                    "Vileplume", "Arcanine", "Poliwrath", "Alakazam", "Machamp", "Victreebel", "Golem", "Slowbro",
                    "Gengar", "Gyarados", "Vaporeon", "Flareon", "Jolteon", "Snorlax", "Dragonite", "Crobat",
                    "Ampharos", "Bellossom", "Azumarill", "Espeon", "Umbreon", "Slowking", "Galarian Slowking",
                    "Steelix", "Scizor", "Houndoom", "Kingdra", "Blissey", "Tyranitar"};
            int i = (int) (Math.random() * superrare.length);
            return superrare[i];
        } else if (rng > 1989 && rng < 2000) {
            String[] legend = {"Articuno", "Moltres", "Zapdos", "Mewtwo", "Raikou", "Entei", "Suicune", "Lugia",
                    "Ho-oh"};
            int i = (int) (Math.random() * legend.length);
            return legend[i];
        } else if (rng == 2000) {
            String[] myth = { "Mew", "Celebi" };
            int i = (int) (Math.random() * myth.length);
            return myth[i];
        } else {
            System.out.println("You found a missingno. Please report these numbers to the creator.");
            System.out.println("rng = " + rng);
            System.exit(0);
            return null;
        }
    }

    public boolean shiny() {
        int shinyRate = (int) (Math.random() * 4097);
        if (shinyRate == 4096) {
            return true;
        }
        return false;
    }
}
