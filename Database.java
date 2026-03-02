import java.util.Scanner;

public class Database {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pokemon List using 1D array
        Pokemon[] pokedex = new Pokemon[151];
        {
            pokedex[0] = new Pokemon("Bulbasaur", "Grass/Poison", "001", 45, 49, 65, 49, 65, 45);
            pokedex[1] = new Pokemon("Ivysaur", "Grass/Poison", "002", 60, 62, 80, 63, 80, 60);
            pokedex[2] = new Pokemon("Venusaur", "Grass/Poison", "003", 80, 82, 100, 83, 100, 80);
            pokedex[3] = new Pokemon("Charmander", "Fire", "004", 39, 52, 60, 43, 50, 65);
            pokedex[4] = new Pokemon("Charmeleon", "Fire", "005", 58, 64, 80, 58, 65, 80);
            pokedex[5] = new Pokemon("Charizard", "Fire/Flying", "006", 78, 84, 109, 78, 85, 100);
            pokedex[6] = new Pokemon("Squirtle", "Water", "007", 44, 48, 50, 65, 64, 43);
            pokedex[7] = new Pokemon("Wartortle", "Water", "008", 59, 63, 65, 80, 80, 58);
            pokedex[8] = new Pokemon("Blastoise", "Water", "009", 79, 83, 85, 100, 105, 78);
            pokedex[9] = new Pokemon("Caterpie", "Bug", "010", 45, 30, 20, 35, 20, 45);
            pokedex[10] = new Pokemon("Metapod", "Bug", "011", 50, 20, 25, 55, 25, 30);
            pokedex[11] = new Pokemon("Butterfree", "Bug/Flying", "012", 60, 45, 90, 50, 80, 70);
            pokedex[12] = new Pokemon("Weedle", "Bug/Poison", "013", 40, 35, 20, 30, 20, 50);
            pokedex[13] = new Pokemon("Kakuna", "Bug/Poison", "014", 45, 25, 25, 50, 25, 35);
            pokedex[14] = new Pokemon("Beedrill", "Bug/Poison", "015", 65, 90, 45, 40, 80, 75);
            pokedex[15] = new Pokemon("Pidgey", "Normal/Flying", "016", 40, 45, 35, 40, 35, 56);
            pokedex[16] = new Pokemon("Pidgeotto", "Normal/Flying", "017", 63, 60, 50, 55, 50, 71);
            pokedex[17] = new Pokemon("Pidgeot", "Normal/Flying", "018", 83, 80, 70, 75, 70, 101);
            pokedex[18] = new Pokemon("Rattata", "Normal", "019", 30, 56, 25, 35, 35, 72);
            pokedex[19] = new Pokemon("Raticate", "Normal", "020", 55, 81, 50, 60, 70, 97);
            pokedex[20] = new Pokemon("Spearow", "Normal/Flying", "021", 40, 60, 31, 30, 31, 70);
            pokedex[21] = new Pokemon("Fearow", "Normal/Flying", "022", 65, 90, 61, 65, 61, 100);
            pokedex[22] = new Pokemon("Ekans", "Poison", "023", 35, 60, 40, 44, 54, 55);
            pokedex[23] = new Pokemon("Arbok", "Poison", "024", 60, 95, 65, 69, 79, 80);
            pokedex[24] = new Pokemon("Pikachu", "Electric", "025", 35, 55, 50, 40, 50, 90);
            pokedex[25] = new Pokemon("Raichu", "Electric", "026", 60, 90, 90, 55, 80, 110);
            pokedex[26] = new Pokemon("Sandshrew", "Ground", "027", 50, 75, 20, 85, 30, 40);
            pokedex[27] = new Pokemon("Sandslash", "Ground", "028", 75, 100, 45, 110, 55, 65);
            pokedex[28] = new Pokemon("Nidoran (female)", "Poison", "029", 55, 47, 40, 52, 40, 41);
            pokedex[29] = new Pokemon("Nidorina", "Poison", "030", 70, 62, 55, 67, 55, 56);
            pokedex[30] = new Pokemon("Nidoqueen", "Poison/Ground", "031", 90, 92, 75, 87, 85, 76);
            pokedex[31] = new Pokemon("Nidoran (male)", "Poison", "032", 46, 57, 40, 40, 40, 50);
            pokedex[32] = new Pokemon("Nidorino", "Poison", "033", 61, 72, 55, 57, 55, 65);
            pokedex[33] = new Pokemon("Nidoking", "Poison/Ground", "034", 81, 102, 85, 77, 75, 85);
            pokedex[34] = new Pokemon("Clefairy", "Normal", "035", 70, 45, 60, 48, 60, 35);
            pokedex[35] = new Pokemon("Clefable", "Normal", "036", 95, 70, 85, 73, 90, 60);
            pokedex[36] = new Pokemon("Vulpix", "Fire", "037", 38, 41, 50, 40, 65, 65);
            pokedex[37] = new Pokemon("Ninetales", "Fire", "038", 73, 76, 81, 75, 100, 100);
            pokedex[38] = new Pokemon("Jigglypuff", "Normal", "039", 115, 45, 45, 20, 25, 20);
            pokedex[39] = new Pokemon("Wigglytuff", "Normal", "040", 140, 70, 85, 45, 50, 45);
            pokedex[40] = new Pokemon("Zubat", "Poison/Flying", "041", 40, 45, 30, 35, 40, 55);
            pokedex[41] = new Pokemon("Golbat", "Poison/Flying", "042", 75, 80, 65, 70, 75, 90);
            pokedex[42] = new Pokemon("Oddish", "Grass/Poison", "043", 45, 50, 75, 55, 65, 30);
            pokedex[43] = new Pokemon("Gloom", "Grass/Poison", "044", 60, 65, 85, 70, 75, 40);
            pokedex[44] = new Pokemon("Vileplume", "Grass/Poison", "045", 75, 80, 110, 85, 90, 50);
            pokedex[45] = new Pokemon("Paras", "Bug/Grass", "046", 35, 70, 45, 55, 55, 25);
            pokedex[46] = new Pokemon("Parasect", "Bug/Grass", "047", 60, 95, 60, 80, 80, 30);
            pokedex[47] = new Pokemon("Venonat", "Bug/Poison", "048", 60, 55, 40, 50, 55, 45);
            pokedex[48] = new Pokemon("Venomoth", "Bug/Poison", "049", 70, 65, 90, 60, 75, 90);
            pokedex[49] = new Pokemon("Diglett", "Ground", "050", 10, 55, 35, 25, 45, 95);
            pokedex[50] = new Pokemon("Dugtrio", "Ground", "051", 35, 100, 50, 50, 70, 120);
            pokedex[51] = new Pokemon("Meowth", "Normal", "052", 40, 45, 40, 35, 40, 90);
            pokedex[52] = new Pokemon("Persian", "Normal", "053", 65, 70, 65, 60, 65, 115);
            pokedex[53] = new Pokemon("Psyduck", "Water", "054", 50, 52, 65, 48, 50, 55);
            pokedex[54] = new Pokemon("Golduck", "Water", "055", 80, 82, 95, 78, 80, 85);
            pokedex[55] = new Pokemon("Mankey", "Fighting", "056", 40, 80, 35, 35, 45, 70);
            pokedex[56] = new Pokemon("Primeape", "Fighting", "057", 65, 105, 60, 60, 70, 95);
            pokedex[57] = new Pokemon("Growlithe", "Fire", "058", 55, 70, 70, 45, 50, 60);
            pokedex[58] = new Pokemon("Arcanine", "Fire", "059", 90, 110, 100, 80, 80, 95);
            pokedex[59] = new Pokemon("Poliwag", "Water", "060", 40, 50, 40, 40, 40, 90);
            pokedex[60] = new Pokemon("Poliwhirl", "Water", "061", 65, 65, 50, 60, 50, 90);
            pokedex[61] = new Pokemon("Poliwrath", "Water/Fighting", "062", 90, 90, 70, 95, 90, 70);
            pokedex[62] = new Pokemon("Abra", "Psychic", "063", 25, 20, 105, 15, 55, 90);
            pokedex[63] = new Pokemon("Kadabra", "Psychic", "064", 40, 35, 120, 30, 70, 105);
            pokedex[64] = new Pokemon("Alakazam", "Psychic", "065", 55, 50, 135, 45, 95, 120);
            pokedex[65] = new Pokemon("Machop", "Fighting", "066", 70, 80, 35, 50, 35, 35);
            pokedex[66] = new Pokemon("Machoke", "Fighting", "067", 80, 100, 50, 70, 60, 45);
            pokedex[67] = new Pokemon("Machamp", "Fighting", "068", 90, 130, 65, 80, 85, 55);
            pokedex[68] = new Pokemon("Bellsprout", "Grass/Poison", "069", 50, 75, 70, 35, 30, 40);
            pokedex[69] = new Pokemon("Weepinbell", "Grass/Poison", "070", 65, 90, 85, 50, 45, 55);
            pokedex[70] = new Pokemon("Victreebel", "Grass/Poison", "071", 80, 105, 100, 65, 70, 70);
            pokedex[71] = new Pokemon("Tentacool", "Water/Poison", "072", 40, 40, 50, 35, 100, 70);
            pokedex[72] = new Pokemon("Tentacruel", "Water/Poison", "073", 80, 70, 80, 65, 120, 100);
            pokedex[73] = new Pokemon("Geodude", "Rock/Ground", "074", 40, 80, 30, 100, 30, 20);
            pokedex[74] = new Pokemon("Graveler", "Rock/Ground", "075", 55, 95, 45, 115, 45, 35);
            pokedex[75] = new Pokemon("Golem", "Rock/Ground", "076", 80, 120, 55, 130, 65, 45);
            pokedex[76] = new Pokemon("Ponyta", "Fire", "077", 50, 85, 65, 55, 65, 90);
            pokedex[77] = new Pokemon("Rapidash", "Fire", "078", 65, 100, 80, 70, 80, 105);
            pokedex[78] = new Pokemon("Slowpoke", "Water/Psychic", "079", 90, 65, 40, 65, 40, 15);
            pokedex[79] = new Pokemon("Slowbro", "Water/Psychic", "080", 95, 75, 100, 110, 80, 30);
            pokedex[80] = new Pokemon("Magnemite", "Electric/Steel", "081", 25, 35, 95, 70, 55, 45);
            pokedex[81] = new Pokemon("Magneton", "Electric/Steel", "082", 50, 60, 120, 95, 70, 70);
            pokedex[82] = new Pokemon("Farfetch'd", "Normal/Flying", "083", 52, 90, 58, 55, 62, 60);
            pokedex[83] = new Pokemon("Doduo", "Normal/Flying", "084", 35, 85, 35, 45, 35, 75);
            pokedex[84] = new Pokemon("Dodrio", "Normal/Flying", "085", 60, 110, 60, 70, 60, 110);
            pokedex[85] = new Pokemon("Seel", "Water", "086", 65, 45, 45, 55, 70, 45);
            pokedex[86] = new Pokemon("Dewgong", "Water/Ice", "087", 90, 70, 70, 80, 95, 70);
            pokedex[87] = new Pokemon("Grimer", "Poison", "088", 80, 80, 40, 50, 50, 25);
            pokedex[88] = new Pokemon("Muk", "Poison", "089", 105, 105, 65, 75, 100, 50);
            pokedex[89] = new Pokemon("Shellder", "Water", "090", 30, 65, 45, 100, 25, 40);
            pokedex[90] = new Pokemon("Cloyster", "Water/Ice", "091", 50, 95, 85, 180, 45, 70);
            pokedex[91] = new Pokemon("Gastly", "Ghost/Poison", "092", 30, 35, 100, 30, 35, 80);
            pokedex[92] = new Pokemon("Haunter", "Ghost/Poison", "093", 45, 50, 115, 45, 55, 95);
            pokedex[93] = new Pokemon("Gengar", "Ghost/Poison", "094", 60, 65, 130, 60, 75, 110);
            pokedex[94] = new Pokemon("Onix", "Rock/Ground", "095", 35, 45, 30, 160, 45, 70);
            pokedex[95] = new Pokemon("Drowzee", "Psychic", "096", 60, 48, 43, 45, 90, 42);
            pokedex[96] = new Pokemon("Hypno", "Psychic", "097", 85, 73, 73, 70, 115, 67);
            pokedex[97] = new Pokemon("Krabby", "Water", "098", 30, 105, 25, 90, 25, 50);
            pokedex[98] = new Pokemon("Kingler", "Water", "099", 55, 130, 50, 115, 50, 75);
            pokedex[99] = new Pokemon("Voltorb", "Electric", "100", 40, 30, 55, 50, 55, 100);
            pokedex[100] = new Pokemon("Electrode", "Electric", "101", 60, 50, 80, 70, 80, 150);
            pokedex[101] = new Pokemon("Exeggcute", "Grass/Psychic", "102", 60, 40, 60, 80, 45, 40);
            pokedex[102] = new Pokemon("Exeggutor", "Grass/Psychic", "103", 95, 95, 125, 85, 75, 55);
            pokedex[103] = new Pokemon("Cubone", "Ground", "104", 50, 50, 40, 95, 50, 35);
            pokedex[104] = new Pokemon("Marowak", "Ground", "105", 60, 80, 50, 110, 80, 45);
            pokedex[105] = new Pokemon("Hitmonlee", "Fighting", "106", 50, 120, 35, 53, 110, 87);
            pokedex[106] = new Pokemon("Hitmonchan", "Fighting", "107", 50, 105, 35, 79, 110, 76);
            pokedex[107] = new Pokemon("Lickitung", "Normal", "108", 90, 55, 60, 75, 75, 30);
            pokedex[108] = new Pokemon("Koffing", "Poison", "109", 40, 65, 60, 95, 45, 35);
            pokedex[109] = new Pokemon("Weezing", "Poison", "110", 65, 90, 85, 120, 70, 60);
            pokedex[110] = new Pokemon("Rhyhorn", "Ground/Rock", "111", 80, 85, 30, 95, 30, 25);
            pokedex[111] = new Pokemon("Rhydon", "Ground/Rock", "112", 105, 130, 45, 120, 45, 40);
            pokedex[112] = new Pokemon("Chansey", "Normal", "113", 250, 5, 35, 5, 105, 50);
            pokedex[113] = new Pokemon("Tangela", "Grass", "114", 65, 55, 100, 115, 40, 60);
            pokedex[114] = new Pokemon("Kangaskhan", "Normal", "115", 105, 95, 40, 80, 80, 90);
            pokedex[115] = new Pokemon("Horsea", "Water", "116", 30, 40, 70, 70, 25, 60);
            pokedex[116] = new Pokemon("Seadra", "Water", "117", 55, 65, 95, 95, 45, 85);
            pokedex[117] = new Pokemon("Goldeen", "Water", "118", 45, 67, 35, 60, 50, 63);
            pokedex[118] = new Pokemon("Seaking", "Water", "119", 80, 92, 65, 65, 80, 68);
            pokedex[119] = new Pokemon("Staryu", "Water", "120", 30, 45, 70, 55, 55, 85);
            pokedex[120] = new Pokemon("Starmie", "Water/Psychic", "121", 60, 75, 100, 85, 85, 115);
            pokedex[121] = new Pokemon("Mr. Mime", "Psychic", "122", 40, 45, 100, 65, 120, 90);
            pokedex[122] = new Pokemon("Scyther", "Bug/Flying", "123", 70, 110, 55, 80, 80, 105);
            pokedex[123] = new Pokemon("Jynx", "Ice/Psychic", "124", 65, 50, 115, 35, 95, 95);
            pokedex[124] = new Pokemon("Electabuzz", "Electric", "125", 65, 83, 95, 57, 85, 105);
            pokedex[125] = new Pokemon("Magmar", "Fire", "126", 65, 95, 100, 57, 85, 93);
            pokedex[126] = new Pokemon("Pinsir", "Bug", "127", 65, 125, 55, 100, 70, 85);
            pokedex[127] = new Pokemon("Tauros", "Normal", "128", 75, 100, 40, 95, 70, 110);
            pokedex[128] = new Pokemon("Magikarp", "Water", "129", 20, 10, 15, 55, 20, 80);
            pokedex[129] = new Pokemon("Gyarados", "Water/Flying", "130", 95, 125, 60, 79, 100, 81);
            pokedex[130] = new Pokemon("Lapras", "Water/Ice", "131", 130, 85, 85, 80, 95, 60);
            pokedex[131] = new Pokemon("Ditto", "Normal", "132", 48, 48, 48, 48, 48, 48);
            pokedex[132] = new Pokemon("Eevee", "Normal", "133", 55, 55, 45, 50, 65, 55);
            pokedex[133] = new Pokemon("Vaporeon", "Water", "134", 130, 65, 110, 60, 95, 65);
            pokedex[134] = new Pokemon("Jolteon", "Electric", "135", 65, 65, 110, 60, 95, 130);
            pokedex[135] = new Pokemon("Flareon", "Fire", "136", 65, 130, 95, 60, 110, 65);
            pokedex[136] = new Pokemon("Porygon", "Normal", "137", 65, 60, 85, 70, 75, 40);
            pokedex[137] = new Pokemon("Omanyte", "Rock/Water", "138", 35, 40, 90, 100, 55, 35);
            pokedex[138] = new Pokemon("Omastar", "Rock/Water", "139", 70, 60, 115, 125, 70, 55);
            pokedex[139] = new Pokemon("Kabuto", "Rock/Water", "140", 30, 80, 55, 90, 45, 55);
            pokedex[140] = new Pokemon("Kabutops", "Rock/Water", "141", 60, 115, 65, 105, 70, 80);
            pokedex[141] = new Pokemon("Aerodactyl", "Rock/Flying", "142", 80, 105, 60, 65, 75, 130);
            pokedex[142] = new Pokemon("Snorlax", "Normal", "143", 160, 110, 65, 65, 110, 30);
            pokedex[143] = new Pokemon("Articuno", "Ice/Flying", "144", 90, 85, 95, 100, 125, 85);
            pokedex[144] = new Pokemon("Zapdos", "Electric/Flying", "145", 90, 90, 125, 85, 90, 100);
            pokedex[145] = new Pokemon("Moltres", "Fire/Flying", "146", 90, 100, 125, 90, 85, 90);
            pokedex[146] = new Pokemon("Dratini", "Dragon", "147", 41, 64, 50, 45, 50, 50);
            pokedex[147] = new Pokemon("Dragonair", "Dragon", "148", 61, 84, 70, 65, 70, 70);
            pokedex[148] = new Pokemon("Dragonite", "Dragon/Flying", "149", 91, 134, 100, 95, 100, 80);
            pokedex[149] = new Pokemon("Mewtwo", "Psychic", "150", 106, 110, 154, 90, 90, 130);
            pokedex[150] = new Pokemon("Mew", "Psychic", "151", 100, 100, 100, 100, 100, 100);
        }

        System.out.println("Welcome to the Gen 1 Pokedex!");
        System.out.println("Please enter a Pokemon name or number.");
        String search = scanner.nextLine();

        for (Pokemon p : pokedex)
            if (p != null) {
                if (p.getName().equalsIgnoreCase(search) || p.dexNumber().equals(search)) {
                    p.displayInfo();
                    scanner.close();
                    break;
                }
            }
            else {
                System.out.print("Sorry, that Pokemon couldn't be found.");
                scanner.close();
                break;
            }
    }
}
