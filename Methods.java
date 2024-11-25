
public class Methods {
    public boolean encounter(int rng, boolean encounter) {
        rng = (int) (Math.random() * 101);
        if (rng > 50) {
            return true;
        }
        return false;
    }

    public String getPokemon(int rng, int rarity) {
        rng = (int) (Math.random() * 2001);
        if (rng <= 1000) {
            String[] common = { "Caterpie", "Weedle", "Pidgey", "Rattata", "Spearow", "Ekans", "Sandshrew", "Nidoran-F",
                    "Nidoran-M", "Clefairy", "Vulpix", "Jigglypuff", "Zubat", "Oddish", "Paras", "Venonat", "Diglett",
                    "Meowth", "Psyduck", "Mankey", "Growlithe", "Poliwag", "Abra", "Machop", "Bellsprout", "Tentacool",
                    "Geodude", "Ponyta", "Slowpoke", "Magnemite", "Farfetch'd", "Doduo", "Seel", "Grimer", "Shellder",
                    "Gastly", "Onix", "Drowzee", "Krabby", "Voltorb", "Exeggcute", "Cubone", "Lickitung", "Koffing",
                    "Rhyhorn", "Chansey", "Tangela", "Horsea", "Goldeen", "Staryu", "Mr. Mime", "Scyther", "Jynx",
                    "Electabuzz", "Magmar", "Pinsir", "Tauros", "Magikarp", "Ditto", "Eevee", "Porygon", "Omanyte",
                    "Kabuto", "Dratini", "Bulbasaur", "Charmander", "Squirtle", "Pikachu"};
            int i = (int) (Math.random() * common.length);
            return common[i];
        }
    }
}
