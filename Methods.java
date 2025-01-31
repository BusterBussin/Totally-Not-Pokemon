
public class Methods {
    public boolean encounter(int rng, boolean encounter) {
        rng = (int) (Math.random() * 101);
        if (rng < 0 || rng > 100) {
            System.out.println("Missingno found!");
            System.out.println("Report the missingno to the creator.");
            System.out.println("rng = " + rng);
            System.exit(0);
        }
        if (rng > 25) {
            return true;
        } else {
            return false;
        }
    }

    public String getPokemon(int rng) {
        rng = (int) (Math.random() * 2001);
        if (rng <= 1000) {
            String[] common = { "Caterpie", "Weedle", "Pidgey", "Rattata", "Spearow", "Ekans", "Sandshrew", "Nidoran-F",
                    "Nidoran-M", "Clefairy", "Vulpix", "Alolan Vulpix", "Jigglypuff", "Zubat", "Oddish", "Paras",
                    "Venonat", "Diglett", "Alolan Diglett",
                    "Meowth", "Alolan Meowth", "Galarian Meowth", "Psyduck", "Mankey", "Growlithe", "Hisuian Growlithe",
                    "Poliwag", "Abra", "Machop", "Bellsprout", "Tentacool",
                    "Geodude", "Alolan Geodude", "Ponyta", "Galarian Ponyta", "Slowpoke", "Magnemite", "Farfetch'd",
                    "Galarian Farfetch'd", "Doduo", "Seel", "Grimer", "Shellder",
                    "Gastly", "Onix", "Drowzee", "Krabby", "Voltorb", "Hisuian Voltorb", "Exeggcute", "Cubone",
                    "Lickitung", "Koffing",
                    "Rhyhorn", "Chansey", "Tangela", "Horsea", "Goldeen", "Staryu", "Scyther", "Jynx",
                    "Electabuzz", "Magmar", "Pinsir", "Tauros", "Paldean Tauros (Combat)", "Paldean Tauros (Blaze)",
                    "Paldean Tauros (Aqua)", "Magikarp", "Ditto", "Eevee", "Porygon", "Omanyte",
                    "Kabuto", "Dratini", "Bulbasaur", "Charmander", "Squirtle", "Pikachu", "Metapod", "Kakuna",
                    "Pidgeotto", "Raticate", "Fearow", "Nidorino", "Nidorina", "Chikorita", "Cyndaquil", "Totodile",
                    "Sentret", "Furret", "Hoothoot", "Noctowl", "Ledyba", "Ledian",
                    "Spinarak", "Ariados", "Chinchou", "Lanturn", "Pichu", "Cleffa", "Igglybuff", "Togepi", "Togetic",
                    "Natu", "Xatu", "Mareep", "Flaaffy", "Marill", "Hoppip", "Skiploom", "Aipom", "Sunkern", "Sunflora",
                    "Yanma", "Wooper", "Paldean Wooper", "Murkrow", "Misdreavus", "Girafarig", "Pineco", "Dunsparce",
                    "Gligar", "Snubbull", "Qwilfish", "Hisuian Qwilfish", "Shuckle", "Sneasel", "Hisuian Sneasel",
                    "Teddiursa", "Slugma",
                    "Swinub", "Corsola", "Galarian Corsola", "Remoraid", "Delibird", "Houndour", "Panphy", "Stantler",
                    "Smeargle", "Tyrogue", "Smoochum", "Elekid", "Magby", "Miltank", "Larvitar", "Treecko",
                    "Torchic", "Mudkip", "Poochyena", "Zigzagoon", "Galarian Zigzagoon",
                    "Wurmple", "Silcoon", "Cascoon", "Lotad", "Seedot", "Nuzleaf", "Taillow", "Wingull",
                    "Ralts", "Kirlia", "Surskit", "Shroomish", "Slakoth", "Nincada", "Whismur", "Loudred", "Makuhita",
                    "Azurill", "Nosepass", "Skitty", "Delcatty", "Aron", "Meditite", "Electrike", "Plusle", "Minun",
                    "Volbeat", "Illumise", "Roselia", "Gulpin", "Carvanha", "Wailmer", "Numel", "Spoink", "Spinda",
                    "Trapinch", "Vibrava", "Cacnea", "Swablu", "Barboach", "Corphish", "Baltoy", "Lileep", "Anorith",
                    "Feebas", "Castform", "Castform (Sunny Form)", "Castform (Rainy Form)", "Castform (Snowy Form)",
                    "Kecleon", "Shuppet", "Duskull", "Wynaut", "Snorunt", "Spheal", "Clamperl", "Luvdisc", "Bagon",
                    "Beldum", "Turtwig", "Piplup", "Chimchar", "Starly", "Bidoof", "Kricketot", "Shinx", "Budew",
                    "Cranidos", "Shelgon", "Burmy (Plant Cloak)", "Burmy (Sandy Cloak)", "Burmy (Trash Cloak)",
                    "Mothim", "Combee", "Pachirisu", "Buizel", "Cherubi", "Shellos (West Sea)", "Shellos (East Sea)",
                    "Drifloon", "Buneary", "Glameow", "Chingling", "Stunky", "Bronzor", "Bonsly", "Mime Jr", "Happiny",
                    "Chatot", "Gible", "Munchlax", "Hippopotas", "Skorupi", "Croagunk", "Carnivine", "Finneon",
                    "Mantyke", "Snover", "Alolan Grimer", "Alolan Rattata", "Alolan Raticate", "Alolan Sandshrew",
                    "Snivy", "Tepig", "Oshawott", "Patrat", "Lillipup", "Purrloin", "Pansage", "Pansear", "Panpour",
                    "Munna", "Pidove", "Blitzle", "Roggenrola", "Woobat", "Drilbur", "Timburr", "Tympole", "Throh",
                    "Sawk", "Sewaddle", "Venipede", "Cottonee", "Petilil", "Basculin (Red-Striped)",
                    "Basculin (Blue-Striped)", "Basculin (White-Striped)", "Sandile", "Darumaka", "Galarian Darumaka",
                    "Dwebble", "Scraggy", "Yamask", "Galarian Yamask", "Tirtouga", "Archen", "Trubbish", "Zorua",
                    "Hisuian Zorua", "Minccino", "Gothita", "Solosis", "Ducklett", "Vanillite", "Deerling (Spring)",
                    "Deerling (Summer)", "Deerling (Fall)", "Deerling (Winter)", "Emolga", "Karrablast", "Foongus",
                    "Frillish (Male)", "Frillish (Female)", "Joltik", "Ferroseed", "Klink", "Tynamo", "Elgyem",
                    "Litwick", "Axew", "Cubchoo", "Shelmet", "Stunfisk", "Galarian Stunfisk", "Mienfoo", "Golett",
                    "Pawniard", "Rufflet", "Vullaby", "Deino", "Larvesta", "Chespin", "Fennekin", "Froakie", "Bunnelby",
                    "Fletchling", "Scatterbug", "Litleo", "Flabébé", "Skiddo", "Pancham", "Furfrou", "Espurr",
                    "Honedge", "Spritzee", "Swirlix", "Inkay", "Binacle", "Skrelp", "Clauncher", "Helioptile", "Tyrunt",
                    "Amaura", "Dedenne", "Carbink", "Goomy", "Klefki", "Phantump", "Bergmite", "Noibat", "Rowlet",
                    "Litten", "Popplio", "Pikipek", "Yungoos", "Grubbin", "Crabrawler", "Cutiefly", "Rockruff",
                    "Wishiwashi (Solo)", "Wishiwashi (School)", "Mareanie", "Mudbray", "Dewpider", "Fomantis",
                    "Morelull", "Salandit", "Stufful", "Bounsweet", "Wimpod", "Sandygast", "Pyukumuku", "Minior",
                    "Togedemaru", "Mimikyu", "Bruxish", "Jangmo-o", "Komala", "Grookey", "Scorbunny", "Sobble",
                    "Skwovet", "Rookidee", "Blipbug", "Nickit", "Gossifleur", "Wooloo", "Chewtle", "Yamper", "Rolycoly",
                    "Applin", "Silicobra", "Arrokuda", "Toxel", "Sizzlipede", "Clobbopus", "Sinistea", "Hatenna",
                    "Impidimp", "Milcery", "Pincurchin", "Snom", "Eiscue", "Indeedee-M", "Indeedee-F", "Morpeko (Full)",
                    "Morpeko (Hangry)", "Cufant", "Dreepy", "Sprigatito", "Fuecoco", "Quaxly", "Lechonk", "Tarountula",
                    "Nymble", "Pawmi", "Tandemaus", "Fidough", "Smoliv", "Squawkabilly", "Nacli", "Tadbulb", "Wattrel",
                    "Maschiff", "Shroodle", "Bramblin", "Toedscool", "Capsakid", "Rellor", "Flittle", "Tinkatink",
                    "Wiglett", "Finizen", "Varoom", "Glimmet", "Greavard", "Cetoddle", "Frigibax", "Gimmighoul",
                    "Poltchageist" };
            int i = (int) (Math.random() * common.length);
            return common[i];
        } else if (rng > 1000 && rng < 1741) {
            String[] rare = { "Ivysaur", "Charmeleon", "Wartortle", "Raichu", "Butterfree", "Beedrill", "Arbok",
                    "Sandslash", "Alolan Sandslash", "Clefable", "Ninetales", "Alolan Ninetales", "Primeape",
                    "Poliwhirl", "Golbat", "Dugtrio", "Alolan Dugtrio", "Venomoth",
                    "Persian", "Alolan Persian", "Tentacruel", "Parasect", "Gloom", "Wigglytuff", "Golduck", "Kadabra",
                    "Machoke",
                    "Weepinbell", "Graveler", "Alolan Graveler", "Rapidash", "Magneton", "Dodrio", "Dewgong", "Muk",
                    "Alolan Muk", "Cloyster", "Haunter",
                    "Onix", "Hypno", "Kingler", "Electrode", "Hisuian Electrode", "Exeggutor", "Alolan Exeggutor",
                    "Marowak", "Alolan Marowak", "Hitmonlee", "Hitmonchan",
                    "Weezing", "Galarian Weezing", "Rhydon", "Kangaskhan", "Seadra", "Seaking", "Mr. Mime",
                    "Galarian Mr. Mime", "Starmie", "Lapras", "Omastar", "Kabutops",
                    "Aerodactyl", "Dragonair", "Sudowoodo", "Jumpluff", "Quagsire", "Wobbuffet", "Forretress",
                    "Granbull", "Heracross", "Ursaring", "Magcargo", "Piloswine", "Octillery", "Mantine", "Skarmory",
                    "Donphan", "Porygon2", "Hitmontop", "Pupitar", "Bayleef", "Combusken", "Marshtomp",
                    "Quilava", "Croconaw", "Grovyle", "Mightyena", "Linoone", "Galarian Linoone", "Beautifly", "Dustox",
                    "Lombre", "Swellow", "Pelipper", "Mssquerain", "Vigoroth", "Ninjask", "Shedinja", "Exploud",
                    "Sableye", "Mawile", "Lairon", "Medicham", "Manectric", "Swalot", "Torkoal", "Grumpig", "Cacturne",
                    "Zangoose", "Seviper", "Lunatone", "Solrock", "Whiscash", "Crawdaunt", "Claydol", "Craydily",
                    "Armaldo", "Banette", "Dusclops", "Tropius", "Chimecho", "Absol", "Glalie", "Sealeo", "Huntail",
                    "Gorebyss", "Relicanth", "Shelgon", "Metang", "Riolu", "Grotle", "Monferno", "Prinplup", "Staravia",
                    "Bibarel", "Kricketune", "Luxio", "Bastiodon", "Rampardos", "Wormadam (Plant Cloak)",
                    "Wormadam (Sand Cloak)", "Wormadam (Sandy Cloak)", "Wormadam (Trash Cloak)", "Floatzel",
                    "Cherrim (Overcast)", "Cherrim (Sunshine)", "Gastrodon (West Sea)", "Gastrodon (East Sea)",
                    "Ambipom", "Drifblim", "Lopunny", "Mismagius", "Honchkrow", "Purugly", "Skuntank", "Bronzong",
                    "Gabite", "Hippowdon", "Drapion", "Toxicroak", "Lumineon", "Servine", "Pignite", "Dewott",
                    "Watchog", "Herdier", "Liepard", "Simisage", "Simisear", "Simipour", "Musharna", "Tranquill",
                    "Unfezant", "Zebstrika", "Boldore", "Swoobat", "Audino", "Gurdurr", "Palpitoad",
                    "Swadloon", "Whirlipede", "Whimsicott", "Lilligant", "Hisuian Lilligant", "Krokorok", "Darmanitan",
                    "Galarian Darmanitan", "Maractus", "Crustle", "Scrafty", "Cofagrigus", "Carracosta", "Archeops",
                    "Garbodor", "Cinccino", "Gothorita", "Duosion", "Swanna", "Vanillish", "Sawsbuck (Spring)",
                    "Sawsbuck (Summer)", "Sawsbuck (Fall)", "Sawsbuck (Winter)", "Escavalier", "Amoonguss",
                    "Jellicent-M", "Jellicent-F", "Alomomola", "Galvantula", "Ferrothorn", "Klang", "Eelektrik",
                    "Beheeyem", "Lampent", "Fraxure", "Beartic", "Cryonogal", "Accelgor", "Mienshao", "Druddigon",
                    "Golurk", "Bisharp", "Bouffalant", "Mandibuzz", "Heatmor", "Durant", "Zweilous", "Quilladin",
                    "Braixen", "Frogadier", "Diggersby", "Fletchinder", "Spewpa", "Pyroar", "Floette", "Gogoat",
                    "Furfrou", "Mewostic-M", "Meowstic-F", "Doublade", "Aromatisse", "Slurpuff", "Malamar",
                    "Barbaracle", "Dragalge", "Clawitzer", "Heliolisk", "Aurorus", "Hawlucha", "Sliggoo",
                    "Hisuian Sliggoo", "Gourgeist", "Dartrix", "Torracat", "Brionne", "Trumbeak", "Gumshoos",
                    "Charjabug", "Oricorio (Baile)", "Oricorio (Pom-Pom)", "Oricorio (Pa'u)", "Oricorio (Sensu)",
                    "Ribombee", "Midday Lycanroc", "Midnight Lycanroc", "Toxapex", "Mudsdale", "Araquanid", "Lurantis",
                    "Shiinotic", "Salazzle", "Bewear", "Steenee", "Comfey", "Oranguru", "Passimian", "Palossand",
                    "Turtonator", "Dhelmise", "Drampa", "Hakamo-o", "Thwackey", "Raboot", "Drizzile", "Greedent",
                    "Corvisquire", "Dottler", "Thievul", "Eldegoss", "Dubwool", "Drednaw", "Boltund", "Carkol",
                    "Flapple", "Appletun", "Sandaconda", "Cramorant", "Barraskewda", "Grapploct", "Polteageist",
                    "Hattrem", "Morgrem", "Alcremie", "Falinks", "Frosmoth", "Drakloak", "Stonjourner", "Floragato",
                    "Crocalor", "Quaxwell", "Oinkologne", "Lokix", "Pawmo", "Maushold", "Dachsbun", "Dolliv",
                    "Naclstack", "Mellibolt", "Kilowattrel", "Mabosstiff", "Grafaiai", "Brambleghast", "Toedscruel",
                    "Klawf", "Scovillain", "Rabsca", "Espathra", "Tinktatuff", "Wugtrio", "Bombirdier", "Ravavroom",
                    "Cyclizar", "Orthworm", "Glimmora", "Houndstone", "Flamigo", "Veluza", "Dondozo", "Tatsugiri",
                    "Clodsire", "Farigiraf", "Dudunsparce (Two Segment)", "Arctibax", "Sinistcha" };
            int i = (int) (Math.random() * rare.length);
            return rare[i];
        } else if (rng > 1740 && rng < 1751) {
            String[] ect = { "Unown (1 Form)", "Unown (A Form)",
                    "Unown (B Form)", "Unown (C Form)", "Unown (D Form)", "Unown (E Form)", "Unown (F Form)",
                    "Unown (G Form)", "Unown (H Form)", "Unown (I Form)", "Unown (J Form)", "Unown (K Form)",
                    "Unown (L Form)", "Unown (M Form)", "Unown (N Form)", "Unown (O Form)", "Unown (P Form)",
                    "Unown (Q Form)", "Unown (R Form)", "Unown (S Form)", "Unown (T Form)", "Unown (U Form)",
                    "Unown (V Form)", "Unown (W Form)", "Unown (X Form)", "Unown (Y Form)", "Unown (Z Form)",
                    "Unown (! Form)", "Unown (? Form)", "Rotom", "Rotom (Heat)", "Rotom (Wash)", "Rotom (Frost)",
                    "Rotom (Fan)", "Rotom (Mow)" };
            int i = (int) (Math.random() * ect.length);
            return ect[i];
        } else if (rng > 1750 && rng < 1990) {
            String[] superrare = { "Venusaur", "Charizard", "Blastoise", "Pidgeot", "Nidoqueen", "Nidoking",
                    "Vileplume", "Arcanine", "Hisuian Arcanine", "Poliwrath", "Alakazam", "Machamp", "Victreebel",
                    "Golem", "Alolan Golem", "Slowbro", "Galarian Slowbro",
                    "Gengar", "Gyarados", "Vaporeon", "Flareon", "Jolteon", "Snorlax", "Dragonite", "Crobat",
                    "Ampharos", "Bellossom", "Azumarill", "Espeon", "Umbreon", "Slowking", "Galarian Slowking",
                    "Steelix", "Scizor", "Houndoom", "Kingdra", "Blissey", "Tyranitar", "Sceptile", "Blaziken",
                    "Swampert", "Shiftry", "Gardevoir", "Breloom", "Slaking", "Hariyama", "Aggron", "Sharpedo",
                    "Wailord", "Camerupt", "Flygon", "Altaria", "Milotic", "Salamence", "Metagross", "Torterra",
                    "Infernape", "Empoleon", "Staraptor", "Luxray", "Roserade", "Vespiquen", "Spiritomb", "Garchomp",
                    "Lucario", "Abomasnow", "Weavile", "Lickilicky", "Rhyperior", "Tangrowth", "Electivire",
                    "Magmortar", "Togekiss", "Leafeon", "Glaceon", "Gliscor", "Mamoswine", "Porygon-Z", "Gallade",
                    "Probopass", "Dusknoir", "Froslass", "Yanmega", "Serperior", "Emboar", "Samurott",
                    "Hisuian Samurott", "Stoutland", "Gigalith", "Excadrill", "Conkeldurr", "Seismitoad", "Leavanny",
                    "Scolipede", "Krookodile", "Zoroark", "Hisuian Zoroark", "Reuniclus", "Vanilluxe", "Klinklang",
                    "Eelektross", "Chandelure", "Haxorus", "Braviary", "Hisuian Braviary", "Hydreigon", "Volcarona",
                    "Chesnaught", "Delphox", "Greninja", "Talonflame", "Vivillon", "Florges", "Pangoro",
                    "Aegislash (Shield Form)", "Aegislash (Blade Form)", "Malamar", "Tyrantrum", "Sylveon", "Goodra",
                    "Hisuian Goodra", "Trevenant", "Avalugg", "Hisuian Avalugg", "Noivern", "Decidueye", "Incineroar",
                    "Primarina", "Toucannon", "Vikavolt", "Crabominable", "Dusk Lycanroc", "Tsareena", "Golisopod",
                    "Kommo-o", "Rillaboom", "Cinderace", "Inteleon", "Greedent", "Corviknight", "Orbeetle", "Coalossal",
                    "Toxtricity (Amped)", "Toxtricity (Low Key)", "Centiskorch", "Hatterene", "Grimmsnarl", "Obstagoon",
                    "Perrserker", "Cursola", "Sirfetch'd", "Mr. Rime", "Runerigus", "Copperajah", "Dracozolt",
                    "Arctozolt", "Dracovish", "Arctovish", "Duraludon", "Dragapult", "Wyrdeer", "Kleavor", "Ursaluna",
                    "Blood Moon Ursaluna", "Basculegion-M", "Basculegion_F", "Sneasler", "Overqwil", "Meowscarada",
                    "Skeledirge", "Quaquaval", "Pawmot", "Garganacl", "Armarouge", "Ceruledge", "Tinkaton", "Palafin",
                    "Cetitan", "Annihilape", "Dudunsparce (Three Segment)", "Kingambit", "Great Tusk", "Scream Tail",
                    "Brute Bonnet", "Flutter Mane", "Slither Wing", "Sandy Shocks", "Iron Treads", "iron Bundle",
                    "Iron Hands", "Iron Jugulis", "Iron Moth", "Iron Thorns", "Baxcalibur", "Gholdengo", "Roaring Moon",
                    "Iron Valiant", "Dipplin", "Archaludon", "Hydrapple"};
            int i = (int) (Math.random() * superrare.length);
            return superrare[i];
        } else if (rng > 1989 && rng < 2000) {
            String[] legend = { "Articuno", "Galarian Articuno", "Moltres", "Galarian Moltres", "Zapdos",
                    "Galarian Zapdos", "Mewtwo", "Raikou", "Entei", "Suicune", "Lugia",
                    "Ho-oh", "Regirock", "Regice", "Registeel", "Latias", "Latios", "Kyogre", "Groudon",
                    "Primal Kyogre", "Primal Groudon", "Rayquaza", "Deoxys", "Deoxys (Attack Form)",
                    "Deoxys (Defense Form)", "Deoxys (Speed Form)", "Uxie", "Mesprit", "Azelf", "Dialga",
                    "Dialga (Origin)", "Palkia", "Palkia (Origin)", "Heatran", "Regigigas", "Giratina (Absolute)",
                    "Giratina (Origin)", "Crsselia", "Phione", "Manaphy", "Cobalion", "Virizion", "Terrakion",
                    "Tornadus", "Therian Tornadus", "Thundurus", "Therian Thundurus", "Reshiram", "Zekrom", "Landorus",
                    "Therian Landorus", "Kyurem", "White Kyurem", "Black Kyurem", "Keldeo", "Resolute Keldeo",
                    "Aria Meloetta", "Pirouette Meloetta", "Neutral Xerneas", "Active Xerneas", "Yveltal",
                    "Zygarde (50%)", "Zygarde (10%)", "Complete Zygarde", "Tapu Koko", "Tapu Lele", "Tapu Bulu",
                    "Tapu Fini", "Cosmog", "Cosmoem", "Solgaleo", "Lunala", "Nihilego", "Buzzwole", "Pheromosa",
                    "Xurkitree", "Celesteela", "Kartana", "Guzzlord", "Necrozma", "Dusk Mane Necrozma",
                    "Dawn Wings Necrozma", "Poipole", "Naganadel", "Stakataka", "Blacephalon", "Zacian",
                    "Crowned Zacian", "Zamazenta", "Crowned Zamazenta", "Eternatus", "Kunfu", "Single Strike Urshifu",
                    "Rapid Strike Urshifu", "regieleki", "Regidrago", "Glastrier", "Spectrier", "Calyrex",
                    "Ice Rider Calyrex", "Shadow Rider Calyrex", "Enamorus", "Therian Enamorus", "Wo-Chein", "Chien-Pao", "Ting-Lu", "Chi-Yu", "Koraidon", "Miraidon", "Walking Wake", "Iron Leaves", "Okidogi", "Munkidori", "Fezandipiti", "Ogerpon", "Gouging Fire", "Raging Bolt", "Iron Boulder", "Iron Crown", "Terapagos"};
            int i = (int) (Math.random() * legend.length);
            return legend[i];
        } else if (rng == 2000) {
            String[] myth = { "Mew", "Celebi", "Jirachi", "Darkrai", "Shaymin (Land)", "Shaymin (Sky)", "Arceus",
                    "Victini", "Genesect", "Mega", "Diancie", "Confined Hoopa", "Unbound Hoopa", "Volcanion",
                    "Magearna", "Marshadow", "Zeraora", "Meltan", "Melmetal", "Zarude", "Pechaunt"};
            int i = (int) (Math.random() * myth.length);
            String temp = myth[i];
            if (temp.equals("Genesect")) {
                String[] genesect = { "Genesect", "Douse Drive Genesect", "Shock Drive Genesect", "Burn Drive Genesect",
                        "Chill Drive Genesect" };
                int j = (int) (Math.random() * genesect.length);
                temp = genesect[j];
            }
            if (temp.equals("Mega")) {
                String[] mega = { "Mega Venusaur", "Mega Charizard X", "Mega Charizard Y", "Mega Blastoise",
                        "Mega Beedrill", "Mega Pidgeot", "Mega Alakazam", "Mega Slowbro", "Mega Gengar",
                        "Mega Kangaskhan", "Mega Pinsir", "Mega Gyarados", "Mega Aerodactyl", "Mega Mewtwo X",
                        "Mega Mewtwo Y", "Mega Ampharos", "Mega Steelix", "Mega Scizor", "Mega Heracross",
                        "Mega Houndoom", "Mega Tyranitar", "Mega Sceptile", "Mega Blaziken", "Mega Swampert",
                        "Mega Sableye", "Mega Mawile", "Mega Aggron", "Mega Medicham", "Mega Manetric", "Mega Sharpedo",
                        "Mega Camerupt", "Mega Altaria", "Mega Banette", "Mega Absol", "Mega Glalie", "Mega Salamence",
                        "Mega Metagross", "Mega Latias", "Mega Latios", "Mega Rayquaza", "Mega Lopunny",
                        "Mega Garchomp", "Mega Lucario", "Mega Abomasnow", "Mega Gallade", "Mega Audino",
                        "Mega Diancie" };
                int k = (int) (Math.random() * mega.length);
                return mega[i];
            }
            return temp;
        } else {
            System.out.println("You found a missingno. Please report these numbers to the creator.");
            System.out.println("rng = " + rng);
            System.exit(0);
            return null;
        }
    }

    public boolean shiny(int pity) {
        int rngNumber = pity + 1;
        int shinyRate = (int) (Math.random() * rngNumber);
        if (shinyRate == pity) {
            return true;
        }
        return false;
    }
}
