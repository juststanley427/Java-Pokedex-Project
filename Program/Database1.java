package Program;
import java.util.Scanner;

// Database1 class - Takes in information using the Pokemon class
public class Database1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pokemon Gen 1 list using 1D array
        Pokemon[] pokedex = new Pokemon[151];
        {
            pokedex[0] = new Pokemon("Bulbasaur", "Grass/Poison", "001", 45, 49, 65, 49, 65, 45, "Overgrow", "", "Chlorophyll", "A strange seed was planted on its back at birth. The plant sprouts and grows with this POKeMON.", "Ivysaur", "Evolves at Lvl 16");
            pokedex[1] = new Pokemon("Ivysaur", "Grass/Poison", "002", 60, 62, 80, 63, 80, 60, "Overgrow", "", "Chlorophyll", "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.", "Venusaur", "Evolves at Lvl 32");
            pokedex[2] = new Pokemon("Venusaur", "Grass/Poison", "003", 80, 82, 100, 83, 100, 80, "Overgrow", "", "Chlorophyll", "The plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.", "does not evolve", " ");
            pokedex[3] = new Pokemon("Charmander", "Fire", "004", 39, 52, 60, 43, 50, 65, "Blaze", "", "Solar Power", "Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail.", "Charmeleon", "Evolves at Lvl 16");
            pokedex[4] = new Pokemon("Charmeleon", "Fire", "005", 58, 64, 80, 58, 65, 80, "Blaze", "", "Solar Power", "When it swings its burning tail, it elevates the temperature to unbearably high levels.", "Charizard", "Evolves at Lvl 36");
            pokedex[5] = new Pokemon("Charizard", "Fire/Flying", "006", 78, 84, 109, 78, 85, 100, "Blaze", "", "Solar Power", "Spits fire that is hot enough to melt boulders. Known to cause forest fires unintentionally.", "does not evolve", " ");
            pokedex[6] = new Pokemon("Squirtle", "Water", "007", 44, 48, 50, 65, 64, 43, "Torrent", "", "Rain Dish", "After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth.", "Wartortle", "Evolves at Lvl 16");
            pokedex[7] = new Pokemon("Wartortle", "Water", "008", 59, 63, 65, 80, 80, 58, "Torrent", "", "Rain Dish", "Often hides in water to stalk unwary prey. For swimming fast, it moves its ears to maintain balance.", "Blastoise", "Evolves at Lvl 36");
            pokedex[8] = new Pokemon("Blastoise", "Water", "009", 79, 83, 85, 100, 105, 78, "Torrent", "", "Rain Dish", "A brutal POKeMON with pressurized water jets on its shell. They are used for high-speed tackles.", "does not evolve", " ");
            pokedex[9] = new Pokemon("Caterpie", "Bug", "010", 45, 30, 20, 35, 20, 45, "Shield Dust", "", "Run Away", "Its short feet are tipped with suction pads that enable it to tirelessy climb slopes and walls.", "Metapod", "Evolves at Lvl 7");
            pokedex[10] = new Pokemon("Metapod", "Bug", "011", 50, 20, 25, 55, 25, 30, "Shed Skin", "", "", "This POKeMON is vulnerable to attack while its shell is soft, exposing its weak and tender body.", "Butterfree", "Evolves at Lvl 10");
            pokedex[11] = new Pokemon("Butterfree", "Bug/Flying", "012", 60, 45, 90, 50, 80, 70, "Compound Eyes", "", "Tinted Lens", "In battle, it flaps its wings at high speed to release highly toxic dust into the air.", "does not evolve", " ");
            pokedex[12] = new Pokemon("Weedle", "Bug/Poison", "013", 40, 35, 20, 30, 20, 50, "Shield Dust", "", "Run Away", "Often found in forests, eating leaves. It has a sharp venomous stinger on its head.", "Kakuna", "Evolves at Lvl 7");
            pokedex[13] = new Pokemon("Kakuna", "Bug/Poison", "014", 45, 25, 25, 50, 25, 35, "Shed Skin", "", "", "Almost incapable of moving, this POKeMON can only harden its shell to protect itself from predators.", "Beedrill", "Evolves at Lvl 10");
            pokedex[14] = new Pokemon("Beedrill", "Bug/Poison", "015", 65, 90, 45, 40, 80, 75, "Swarm", "", "Sniper", "Flies at high speed and attacks using its large venomous stingers on its forelegs and tail.", "does not evolve", " ");
            pokedex[15] = new Pokemon("Pidgey", "Normal/Flying", "016", 40, 45, 35, 40, 35, 56, "Keen Eye", "Tangled Feet", "Big Pecks", "A common sight in forests and woods. It flaps its wings at ground level to kick up blinding sand.", "Pidgeotto", "Evolves at Lvl 18");
            pokedex[16] = new Pokemon("Pidgeotto", "Normal/Flying", "017", 63, 60, 50, 55, 50, 71, "Keen Eye", "Tangled Feet", "Big Pecks", "Very protective of its sprawling territorial area, this POKeMON will fiercely peck at any intruder.", "Pidgeot", "Evolves at Lvl 36");
            pokedex[17] = new Pokemon("Pidgeot", "Normal/Flying", "018", 83, 80, 70, 75, 70, 101, "Keen Eye", "Tangled Feet", "Big Pecks", "When hunting, it skims the surface of water at high speed to pick off unwary prey such as MAGIKARP.", "does not evolve", " ");
            pokedex[18] = new Pokemon("Rattata", "Normal", "019", 30, 56, 25, 35, 35, 72, "Run Away", "Guts", "Hustle", "Bites anything when it attacks. Small and very quick, it is a common sight in many places.", "Raticate", "Evolves at Lvl 20");
            pokedex[19] = new Pokemon("Raticate", "Normal", "020", 55, 81, 50, 60, 70, 97, "Run Away", "Guts", "Hustle", "It uses its whiskers to maintain its balance. It apparently slows down if they are cut off.", "does not evolve", " ");
            pokedex[20] = new Pokemon("Spearow", "Normal/Flying", "021", 40, 60, 31, 30, 31, 70, "Keen Eye", "", "Sniper", "Eats bugs in grassy areas. It has to flap its short wings at high speed to stay airborne.", "Fearow", "Evolves at Lvl 20");
            pokedex[21] = new Pokemon("Fearow", "Normal/Flying", "022", 65, 90, 61, 65, 61, 100, "Keen Eye", "", "Sniper", "With its huge and magnificent wings, it can keep aloft without ever having to land for rest.", "does not evolve", " ");
            pokedex[22] = new Pokemon("Ekans", "Poison", "023", 35, 60, 40, 44, 54, 55, "Intimidate", "Shed Skin", "Unnerve", "Moves silently and stealthily. Eats the eggs of birds, such as PIDGEY and SPEAROW, whole.", "Arbok", "Evolves at Lvl 22");
            pokedex[23] = new Pokemon("Arbok", "Poison", "024", 60, 95, 65, 69, 79, 80, "Intimidate", "Shed Skin", "Unnerve", "It is rumoured that the ferocious warning markings on its belly differ from area to area.", "does not evolve", " ");
            pokedex[24] = new Pokemon("Pikachu", "Electric", "025", 35, 55, 50, 40, 50, 90, "Static", "", "Lightning Rod", "When several of these POKeMON gather, their electricity could build and cause lightning storms.", "Raichu", "Thunder Stone");
            pokedex[25] = new Pokemon("Raichu", "Electric", "026", 60, 90, 90, 55, 80, 110, "Static", "", "Lightning Rod", "Its long tail serves as a ground to protect itself from its own high voltage power.", "does not evolve", " ");
            pokedex[26] = new Pokemon("Sandshrew", "Ground", "027", 50, 75, 20, 85, 30, 40, "Sand Veil", "", "Sand Rush", "Burrows deep underground in arid locations far from water. It only emerges to hunt for food.", "Sandslash", "Evolves at Lvl 22");
            pokedex[27] = new Pokemon("Sandslash", "Ground", "028", 75, 100, 45, 110, 55, 65, "Sand Veil", "", "Sand Rush", "Curls up into a spiny ball when threatened. It can roll while curled up to attack or escape.", "does not evolve", " ");
            pokedex[28] = new Pokemon("Nidoran (female)", "Poison", "029", 55, 47, 40, 52, 40, 41, "Poison Point", "Rivalry", "Hustle", "Although small, its venomous barbs render this POKeMON dangerous. The female has smaller horns.", "Nidorina", "Evolves at Lvl 16");
            pokedex[29] = new Pokemon("Nidorina", "Poison", "030", 70, 62, 55, 67, 55, 56, "Poison Point", "Rivalry", "Hustle", "The female's horn develops slowly. Prefers physical attacks such as clawing and biting.", "Nidoqueen", "Moon Stone");
            pokedex[30] = new Pokemon("Nidoqueen", "Poison/Ground", "031", 90, 92, 75, 87, 85, 76, "Poison Point", "Rivalry", "Sheer Force", "Its hard scales provide strong protection. It uses its hefty bulk to execute powerful moves.", "does not evolve", " ");
            pokedex[31] = new Pokemon("Nidoran (male)", "Poison", "032", 46, 57, 40, 40, 40, 50, "Poison Point", "Rivalry", "Hustle", "Stiffens its ears to sense danger. The larger its horns, the more powerful its secreted venom.", "Nidorino", "Evolves at Lvl 16");
            pokedex[32] = new Pokemon("Nidorino", "Poison", "033", 61, 72, 55, 57, 55, 65, "Poison Point", "Rivalry", "Hustle", "An aggressive POKeMON that is quick to attack. The horn on its head secretes a powerful venom.", "Nidoking", "Moon Stone");
            pokedex[33] = new Pokemon("Nidoking", "Poison/Ground", "034", 81, 102, 85, 77, 75, 85, "Poison Point", "Rivalry", "Sheer Force", "It uses its powerful tail in battle to smash, constrict, then break the prey's bones.", "does not evolve", " ");
            pokedex[34] = new Pokemon("Clefairy", "Normal", "035", 70, 45, 60, 48, 60, 35, "Cute Charm", "Magic Guard", "Friend Guard", "Its magical and cute appeal has many admirers. It is rare and found only in certain areas.", "Clefable", "Moon Stone");
            pokedex[35] = new Pokemon("Clefable", "Normal", "036", 95, 70, 85, 73, 90, 60, "Cute Charm", "Magic Guard", "Unaware", "A timid fairy POKeMON that is rarely seen. It will run and hide the moment it senses people.", "does not evolve", " ");
            pokedex[36] = new Pokemon("Vulpix", "Fire", "037", 38, 41, 50, 40, 65, 65, "Flash Fire", "", "Drought", "At the time of birth, it has just one tail. The tail splits from its tip as it grows older.", "Ninetales", "Fire Stone");
            pokedex[37] = new Pokemon("Ninetales", "Fire", "038", 73, 76, 81, 75, 100, 100, "Flash Fire", "", "Drought", "Very smart and very vengeful. Grabbing one of its tails could result in a 1000-year curse.", "does not evolve", " ");
            pokedex[38] = new Pokemon("Jigglypuff", "Normal", "039", 115, 45, 45, 20, 25, 20, "Cute Charm", "Competitive", "Friend Guard", "When its huge eyes light up, it sings a mysteriously soothing melody that lulls its enemies to sleep.", "Wigglutuff", "Moon Stone");
            pokedex[39] = new Pokemon("Wigglytuff", "Normal", "040", 140, 70, 85, 45, 50, 45, "Cute Charm", "Competitive", "Frisk", "The body is soft and rubbery. When angered, it will suck in air and inflate itself to an enormous size.", "does not evolve", " ");
            pokedex[40] = new Pokemon("Zubat", "Poison/Flying", "041", 40, 45, 30, 35, 40, 55, "Inner Focus", "", "Infiltrator", "Forms colonies in perpetually dark places. Uses ultrasonic waves to identify and approach targets.", "Golbat", "Evolves at Lvl 22");
            pokedex[41] = new Pokemon("Golbat", "Poison/Flying", "042", 75, 80, 65, 70, 75, 90, "Inner Focus", "", "Infiltrator", "Once it strikes, it will not stop draining energy from the victim even if it gets too heavy to fly.", "does not evolve", " ");
            pokedex[42] = new Pokemon("Oddish", "Grass/Poison", "043", 45, 50, 75, 55, 65, 30, "Chlorophyll", "", "Run Away", "During the day, it keeps its face buried in the ground. At night, it wanders around sowing its seeds.", "Gloom", "Evolves at Lvl 21");
            pokedex[43] = new Pokemon("Gloom", "Grass/Poison", "044", 60, 65, 85, 70, 75, 40, "Chlorophyll", "", "Stench", "The fluid that oozes from its mouth isn't drool. It is a nectar that is used to attract prey.", "Vileplume", "Leaf Stone");
            pokedex[44] = new Pokemon("Vileplume", "Grass/Poison", "045", 75, 80, 110, 85, 90, 50, "Chlorophyll", "", "Effect Spore", "The larger its petals, the more toxic pollen it contains. Its big head is heavy and hard to hold up.", "does not evolve", " ");
            pokedex[45] = new Pokemon("Paras", "Bug/Grass", "046", 35, 70, 45, 55, 55, 25, "Effect Spore", "Dry Skin", "Damp", "Burrows to suck tree roots. The mushrooms on its back grow by drawing nutrients from the bug host.", "Parasect", "Evolves at Lvl 24");
            pokedex[46] = new Pokemon("Parasect", "Bug/Grass", "047", 60, 95, 60, 80, 80, 30, "Effect Spore", "Dry Skin", "Damp", "A host-parasite pair in which the parasite mushroom has taken over the host bug. Prefers damp places.", "does not evolve", " ");
            pokedex[47] = new Pokemon("Venonat", "Bug/Poison", "048", 60, 55, 40, 50, 55, 45, "Compound Eyes", "Tinted Lens", "Run Away", "Lives in the shadows of tall trees where it eats insects. It is attracted by light at night.", "Venomoth", "Evolves at Lvl 31");
            pokedex[48] = new Pokemon("Venomoth", "Bug/Poison", "049", 70, 65, 90, 60, 75, 90, "Shield Dust", "Tinted Lens", "Wonder Skin", "The dust-like scales covering its wings are colour-coded to indicate the kinds of poison it has.", "does not evolve", " ");
            pokedex[49] = new Pokemon("Diglett", "Ground", "050", 10, 55, 35, 25, 45, 95, "Sand Veil", "Arena Trap", "Sand Force", "Lives about one yard underground where it feeds on plant roots. It sometimes appears above ground.", "Dugtrio", "Evolves at Lvl 26");
            pokedex[50] = new Pokemon("Dugtrio", "Ground", "051", 35, 100, 50, 50, 70, 120, "Sand Veil", "Arena Trap", "Sand Force", "A team of DIGLETT triplets. It triggers huge earthquakes by burrowing 60 miles underground.", "does not evolve", " ");
            pokedex[51] = new Pokemon("Meowth", "Normal", "052", 40, 45, 40, 35, 40, 90, "Pickup", "Technician", "Unnerve", "Adores circular objects. Wanders the streets on a nightly basis to look for dropped loose change.", "Persian", "Evolves at Lvl 28");
            pokedex[52] = new Pokemon("Persian", "Normal", "053", 65, 70, 65, 60, 65, 115, "Limber", "Technician", "Unnerve", "Although its fur has many admirers, it is tough to raise as a pet because of its fickle meanness.", "does not evolve", " ");
            pokedex[53] = new Pokemon("Psyduck", "Water", "054", 50, 52, 65, 48, 50, 55, "Damp", "Cloud Nine", "Swift Swim", "While lulling its enemies with its vacant look, this wily POKeMON will use psychokinetic powers.", "Golduck", "Evolves at Lvl 33");
            pokedex[54] = new Pokemon("Golduck", "Water", "055", 80, 82, 95, 78, 80, 85, "Damp", "Cloud Nine", "Swift Swim", "Often seen swimming elegantly by lake shores. It is often mistaken for the Japanese monster, Kappa.", "does not evolve", " ");
            pokedex[55] = new Pokemon("Mankey", "Fighting", "056", 40, 80, 35, 35, 45, 70, "Vital Spirit", "Anger Point", "Defiant", "Extremely quick to anger. It could be docile one moment then thrashing away the next instant.", "Primeape", "Evolves at Lvl 28");
            pokedex[56] = new Pokemon("Primeape", "Fighting", "057", 65, 105, 60, 60, 70, 95, "Vital Spirit", "Anger Point", "Defiant", "Always furious and tenacious to boot. It will not abandon chasing its quarry until it is caught.", "does not evolve", " ");
            pokedex[57] = new Pokemon("Growlithe", "Fire", "058", 55, 70, 70, 45, 50, 60, "Intimidate", "Flash Fire", "Justified", "Very protective of its territory. It will bark and bite to repel intruders from its space.", "Arcanine", "Fire Stone");
            pokedex[58] = new Pokemon("Arcanine", "Fire", "059", 90, 110, 100, 80, 80, 95, "Intimidate", "Flash Fire", "Justified", "A POKeMON that has been admired since the past for its beauty. It runs agilely as if on wings.", "does not evolve", " ");
            pokedex[59] = new Pokemon("Poliwag", "Water", "060", 40, 50, 40, 40, 40, 90, "Water Absorb", "Damp", "Swift Swim", "Its newly grown legs prevent it from running. It appears to prefer swimming than trying to stand.", "Poliwhirl", "Evolves at Lvl 25");
            pokedex[60] = new Pokemon("Poliwhirl", "Water", "061", 65, 65, 50, 60, 50, 90, "Water Absorb", "Damp", "Swift Swim", "Capable of living in or out of water. When out of water, it sweats to keep its body slimy.", "Poliwrath", "Water Stone");
            pokedex[61] = new Pokemon("Poliwrath", "Water/Fighting", "062", 90, 90, 70, 95, 90, 70, "Water Absorb", "Damp", "Swift Swim", "An adept swimmer at both the front crawl and breast stroke. Easily overtakes the best human swimmers.", "does not evolve", " ");
            pokedex[62] = new Pokemon("Abra", "Psychic", "063", 25, 20, 105, 15, 55, 90, "Synchronize", "Inner Focus", "Magic Guard", "Using its abiliity to read minds, it will identify impending danger and TELEPORT to safety.", "Kadabra", "Evolves at Lvl 16");
            pokedex[63] = new Pokemon("Kadabra", "Psychic", "064", 40, 35, 120, 30, 70, 105, "Synchronize", "Inner Focus", "Magic Guard", "It emits special alpha waves from its body that induce headaches just by being close by.", "Alakazam", "Trade");
            pokedex[64] = new Pokemon("Alakazam", "Psychic", "065", 55, 50, 135, 45, 95, 120, "Synchronize", "Inner Focus", "Magic Guard", "Its brain can outperform a supercomputer. Its intelligence quotient is said to be 5,000.", "does not evolve", " ");
            pokedex[65] = new Pokemon("Machop", "Fighting", "066", 70, 80, 35, 50, 35, 35, "Guts", "No Guard", "Steadfast", "Loves to build its muscles. It trains in all styles of martial arts to become even stronger.", "Machoke", "Evolves at Lvl 28");
            pokedex[66] = new Pokemon("Machoke", "Fighting", "067", 80, 100, 50, 70, 60, 45, "Guts", "No Guard", "Steadfast", "Its muscular body is so powerful, it must wear a power save belt to be able to regulate its motions.", "Machamp", "Trade");
            pokedex[67] = new Pokemon("Machamp", "Fighting", "068", 90, 130, 65, 80, 85, 55, "Guts", "No Guard", "Steadfast", "Using its heavy muscles, it throws powerful punches that can send the victim clear over the horizon.", "does not evolve", " ");
            pokedex[68] = new Pokemon("Bellsprout", "Grass/Poison", "069", 50, 75, 70, 35, 30, 40, "Chlorophyll", "", "Gluttony", "A carnivorous POKeMON that traps and eats bugs. It uses its root feet to soak up needed moisture.", "Weepinbell", "Evolves at Lvl 21");
            pokedex[69] = new Pokemon("Weepinbell", "Grass/Poison", "070", 65, 90, 85, 50, 45, 55, "Chlorophyll", "", "Gluttony", "It spits out POISONPOWDER to immobilize the enemy and then finishes it with a spray of ACID.", "Victreebel", "Leaf Stone");
            pokedex[70] = new Pokemon("Victreebel", "Grass/Poison", "071", 80, 105, 100, 65, 70, 70, "Chlorophyll", "", "Gluttony", "Said to live in huge colonies deep in jungles, although no one has ever returned from there.", "does not evolve", " ");
            pokedex[71] = new Pokemon("Tentacool", "Water/Poison", "072", 40, 40, 50, 35, 100, 70, "Clear Body", "Liquid Ooze", "Rain Dish", "Drifts in shallow seas. Anglers who hook them by accident are often punished by its stinging acid.", "Tentacruel", "Evolves at Lvl 30");
            pokedex[72] = new Pokemon("Tentacruel", "Water/Poison", "073", 80, 70, 80, 65, 120, 100, "Clear Body", "Liquid Ooze", "Rain Dish", "The tentacles are normally kept short. On hunts, they are extended to ensnare and immobilize prey.", "does not evolve", " ");
            pokedex[73] = new Pokemon("Geodude", "Rock/Ground", "074", 40, 80, 30, 100, 30, 20, "Rock Head", "Sturdy", "Sand Veil", "Found in fields and mountains. Mistaking them for boulders, people often step or trip on them.", "Graveler", "Evolves at Lvl 25");
            pokedex[74] = new Pokemon("Graveler", "Rock/Ground", "075", 55, 95, 45, 115, 45, 35, "Rock Head", "Sturdy", "Sand Veil", "Rolls down slopes to move. It rolls over any obstacle without slowing or changing its direction.", "Golem", "Trade");
            pokedex[75] = new Pokemon("Golem", "Rock/Ground", "076", 80, 120, 55, 130, 65, 45, "Rock Head", "Sturdy", "Sand Veil", "Its boulder-like body is extremely hard. It can easily withstand dynamite blasts without damage.", "does not evolve", " ");
            pokedex[76] = new Pokemon("Ponyta", "Fire", "077", 50, 85, 65, 55, 65, 90, "Run Away", "Flash Fire", "Flame Body", "Its hooves are 10 times harder than diamonds. It can trample anything completely flat in little time.", "Rapidash", "Evolves at Lvl 40");
            pokedex[77] = new Pokemon("Rapidash", "Fire", "078", 65, 100, 80, 70, 80, 105, "Run Away", "Flash Fire", "Flame Body", "Very competitive, this POKeMON will chase anything that moves fast in the hopes of racing it.", "does not evolve", " ");
            pokedex[78] = new Pokemon("Slowpoke", "Water/Psychic", "079", 90, 65, 40, 65, 40, 15, "Oblivious", "Own Tempo", "Regenerator", "Incredibly slow and dopey. It takes 5 seconds for it to feel pain when under attack.", "Slowbro", "Evolves at Lvl 37");
            pokedex[79] = new Pokemon("Slowbro", "Water/Psychic", "080", 95, 75, 100, 110, 80, 30, "Oblivious", "Own Tempo", "Regenerator", "The SHELLDER that is latched onto SLOWPOKE's tail is said to feed on the host's left over scraps.", "does not evolve", " ");
            pokedex[80] = new Pokemon("Magnemite", "Electric", "081", 25, 35, 95, 70, 55, 45, "Magnet Pull", "Sturdy", "Analytic", "Uses anti-gravity to stay suspended. Appears without warning and uses THUNDER WAVE and similar moves.", "Magneton", "Evolves at Lvl 30");
            pokedex[81] = new Pokemon("Magneton", "Electric", "082", 50, 60, 120, 95, 70, 70, "Magnet Pull", "Sturdy", "Analytic", "Formed by several MAGNEMITEs linked together. They frequently appear when sunspots flare up.", "does not evolve", " ");
            pokedex[82] = new Pokemon("Farfetch'd", "Normal/Flying", "083", 52, 90, 58, 55, 62, 60, "Keen Eye", "Inner Focus", "Defiant", "The sprig of green onions it holds is its weapon. It is used much like a metal sword.", "does not evolve", " ");
            pokedex[83] = new Pokemon("Doduo", "Normal/Flying", "084", 35, 85, 35, 45, 35, 75, "Run Away", "Early Bird", "Tangled Feet", "A bird that makes up for its poor flying with its fast foot speed. Leaves giant footprints.", "Dodrio", "Evolves at Lvl 31");
            pokedex[84] = new Pokemon("Dodrio", "Normal/Flying", "085", 60, 110, 60, 70, 60, 110, "Run Away", "Early Bird", "Tangled Feet", "Uses its three brains to execute complex plans. While two heads sleep, one head stays awake.", "does not evolve", " ");
            pokedex[85] = new Pokemon("Seel", "Water", "086", 65, 45, 45, 55, 70, 45, "Thick Fat", "Hydration", "Ice Body", "The protruding horn on its head is very hard. It is used for bashing through thick ice.", "Dewgong", "Evolves at Lvl 34");
            pokedex[86] = new Pokemon("Dewgong", "Water/Ice", "087", 90, 70, 70, 80, 95, 70, "Thick Fat", "Hydration", "Ice Body", "Stores thermal energy in its body. Swims at a steady 8 knots even in intensely cold waters.", "does not evolve", " ");
            pokedex[87] = new Pokemon("Grimer", "Poison", "088", 80, 80, 40, 50, 50, 25, "Stench", "Sticky Hold", "Poison Touch", "Appears in filthy areas. Thrives by sucking up polluted sludge that is pumped out of factories.", "Muk", "Evolves at Lvl 38");
            pokedex[88] = new Pokemon("Muk", "Poison", "089", 105, 105, 65, 75, 100, 50, "Stench", "Sticky Hold", "Poison Touch", "Thickly covered with a filthy, vile sludge. It is so toxic, even its footprints contain poison.", "does not evolve", " ");
            pokedex[89] = new Pokemon("Shellder", "Water", "090", 30, 65, 45, 100, 25, 40, "Shell Armor", "Skill Link", "Overcoat", "Its hard shell repels any kind of attack. It is vulnerable only when its shell is open.", "Cloyster", "Water Stone");
            pokedex[90] = new Pokemon("Cloyster", "Water/Ice", "091", 50, 95, 85, 180, 45, 70, "Shell Armor", "Skill Link", "Overcoat", "When attacked, it launches its horns in quick volleys. Its innards have never been seen.", "does not evolve", " ");
            pokedex[91] = new Pokemon("Gastly", "Ghost/Poison", "092", 30, 35, 100, 30, 35, 80, "Levitate", "", "", "Almost invisible, this gaseous POKeMON cloaks the target and puts it to sleep without notice.", "Haunter", "Evolves at Lvl 25");
            pokedex[92] = new Pokemon("Haunter", "Ghost/Poison", "093", 45, 50, 115, 45, 55, 95, "Levitate", "", "", "Because of its ability to slip through block walls, it is said to be from another dimension.", "Gengar", "Trade");
            pokedex[93] = new Pokemon("Gengar", "Ghost/Poison", "094", 60, 65, 130, 60, 75, 110, "Cursed Body", "", "", "Under a full moon, this POKeMON likes to mimic the shadows of people and laugh at their fright.", "does not evolve", " ");
            pokedex[94] = new Pokemon("Onix", "Rock/Ground", "095", 35, 45, 30, 160, 45, 70, "Rock Head", "Sturdy", "Weak Armor", "As it grows, the stone portions of its body harden to become similar to a diamond, but coloured black.", "does not evolve", " ");
            pokedex[95] = new Pokemon("Drowzee", "Psychic", "096", 60, 48, 43, 45, 90, 42, "Insomnia", "Forewarn", "Inner Focus", "Puts enemies to sleep then eats their dreams. Occasionally gets sick from eating bad dreams.", "Hypno", "Evolves at Lvl 26");
            pokedex[96] = new Pokemon("Hypno", "Psychic", "097", 85, 73, 73, 70, 115, 67, "Insomnia", "Forewarn", "Inner Focus", "When it locks eyes with an enemy, it will use a mix of PSI moves such as HYPNOSIS and CONFUSION.", "does not evolve", " ");
            pokedex[97] = new Pokemon("Krabby", "Water", "098", 30, 105, 25, 90, 25, 50, "Hyper Cutter", "Shell Armor", "Sheer Force", "Its pincers are not only powerful weapons, they are used for balance when walking sideways.", "Kingler", "Evolves at Lvl 28");
            pokedex[98] = new Pokemon("Kingler", "Water", "099", 55, 130, 50, 115, 50, 75, "Hyper Cutter", "Shell Armor", "Sheer Force", "The large pincer has 10000 hp of crushing power. However, its huge size makes it unwieldy to use.", "does not evolve", " ");
            pokedex[99] = new Pokemon("Voltorb", "Electric", "100", 40, 30, 55, 50, 55, 100, "Soundproof", "Static", "Aftermath", "Usually found in power plants. Easily mistaken for a POKe BALL, they have zapped many people.", "Electrode", "Evolves at Lvl 30");
            pokedex[100] = new Pokemon("Electrode", "Electric", "101", 60, 50, 80, 70, 80, 150, "Soundproof", "Static", "Aftermath", "It stores electric energy under very high pressure. It often explodes with little or no provocation.", "does not evolve", " ");
            pokedex[101] = new Pokemon("Exeggcute", "Grass/Psychic", "102", 60, 40, 60, 80, 45, 40, "Chlorophyll", "", "Harvest", "Often mistaken for eggs. When disturbed, they quickly gather and attack in swarms.", "Exeggutor", "Leaf Stone");
            pokedex[102] = new Pokemon("Exeggutor", "Grass/Psychic", "103", 95, 95, 125, 85, 75, 55, "Chlorophyll", "", "Harvest", "Legend has it that on rare occasions, one of its heads will drop off and continue on as an EXEGGCUTE.", "does not evolve", " ");
            pokedex[103] = new Pokemon("Cubone", "Ground", "104", 50, 50, 40, 95, 50, 35, "Rock Head", "Lightning Rod", "Battle Armor", "Because it never removes its skull helmet, no one has ever seen this POKeMON's real face.", "Marowak", "Evolves at Lvl 28");
            pokedex[104] = new Pokemon("Marowak", "Ground", "105", 60, 80, 50, 110, 80, 45, "Rock Head", "Lightning Rod", "Battle Armor", "The bone it holds is its key weapon. It throws the bone skillfully like a boomerang to K.O targets.", "does not evolve", " ");
            pokedex[105] = new Pokemon("Hitmonlee", "Fighting", "106", 50, 120, 35, 53, 110, 87, "Limber", "Reckless", "Unburden", "When in a hurry, its legs lengthen progressively. It runs smoothly with extra long, loping strides.", "does not evolve", " ");
            pokedex[106] = new Pokemon("Hitmonchan", "Fighting", "107", 50, 105, 35, 79, 110, 76, "Keen Eye", "Iron Fist", "Inner Focus", "While apparently doing nothing, it fires punches in lightning fast volleys that are impossible to see.", "does not evolve", " ");
            pokedex[107] = new Pokemon("Lickitung", "Normal", "108", 90, 55, 60, 75, 75, 30, "Own Tempo", "Oblivious", "Cloud Nine", "Its tongue can be extended like a chameleon's. It leaves a tingling sensation when it licks enemies.", "does not evolve", " ");
            pokedex[108] = new Pokemon("Koffing", "Poison", "109", 40, 65, 60, 95, 45, 35, "Levitate", "Neutralizing Gas", "Stench", "Because it stores several kinds of toxic gases in its body, it is prone to exploding without warning.", "Weezing", "Evolves at Lvl 35");
            pokedex[109] = new Pokemon("Weezing", "Poison", "110", 65, 90, 85, 120, 70, 60, "Levitate", "Neutralizing Gas", "Stench", "Where two kinds of poison gases meet, 2 KOFFINGs can fuse into a WEEZING over many years.", "does not evolve", " ");
            pokedex[110] = new Pokemon("Rhyhorn", "Ground/Rock", "111", 80, 85, 30, 95, 30, 25, "Lightning Rod", "Rock Head", "Reckless", "Its massive bones are 1000 times harder than human bones. It can easily knock a trailer flying.", "Rhydon", "Evolves at Lvl 42");
            pokedex[111] = new Pokemon("Rhydon", "Ground/Rock", "112", 105, 130, 45, 120, 45, 40, "Lightning Rod", "Rock Head", "Reckless", "Protected by an armor-like hide, it is capable of living in molten lava of 3,600 degrees.", "does not evolve", " ");
            pokedex[112] = new Pokemon("Chansey", "Normal", "113", 250, 5, 35, 5, 105, 50, "Natural Cure", "Serene Grace", "Healer", "A rare and elusive POKeMON that is said to bring happiness to those who manage to get it.", "does not evolve", " ");
            pokedex[113] = new Pokemon("Tangela", "Grass", "114", 65, 55, 100, 115, 40, 60, "Chlorophyll", "Leaf Guard", "Regenerator", "The whole body is swathed with wide vines that are similar to seaweed. Its vines shake as it walks.", "does not evolve", " ");
            pokedex[114] = new Pokemon("Kangaskhan", "Normal", "115", 105, 95, 40, 80, 80, 90, "Early Bird", "Scrappy", "Inner Focus", "The infant rarely ventures out of its mother's pouch until it is 3 years old.", "does not evolve", " ");
            pokedex[115] = new Pokemon("Horsea", "Water", "116", 30, 40, 70, 70, 25, 60, "Swift Swim", "Sniper", "Damp", "Known to shoot down flying bugs with precision blasts of ink from the surface of the water.", "Seadra", "Evolves at Lvl 32");
            pokedex[116] = new Pokemon("Seadra", "Water", "117", 55, 65, 95, 95, 45, 85, "Poison Point", "Sniper", "Damp", "Capable of swimming backwards by rapidly flapping its wing-like pectoral fins and stout tail.", "does not evolve", " ");
            pokedex[117] = new Pokemon("Goldeen", "Water", "118", 45, 67, 35, 60, 50, 63, "Swift Swim", "Water Veil", "Lightning Rod", "Its tail fin billows like an elegant ballroom dress, giving it the nickname of the Water Queen.", "Seaking", "Evolves at Lvl 33");
            pokedex[118] = new Pokemon("Seaking", "Water", "119", 80, 92, 65, 65, 80, 68, "Swift Swim", "Water Veil", "Lightning Rod", "In the autumn spawning season, they can be seen swimming powerfully up rivers and creeks.", "does not evolve", " ");
            pokedex[119] = new Pokemon("Staryu", "Water", "120", 30, 45, 70, 55, 55, 85, "Illuminate", "Natural Cure", "Analytic", "An enigmatic POKeMON that can efforlessly regenerate any appendage it loses in battle.", "Starmie", "Water Stone");
            pokedex[120] = new Pokemon("Starmie", "Water/Psychic", "121", 60, 75, 100, 85, 85, 115, "Illuminate", "Natural Cure", "Analytic", "Its central core glows with the seven colours of the rainbow. Some people value the core as a gem.", "does not evolve", " ");
            pokedex[121] = new Pokemon("Mr. Mime", "Psychic", "122", 40, 45, 100, 65, 120, 90, "Soundproof", "Filter", "Technician", "If interrupted while it is miming, it will slap around the offender with its broad hands.", "does not evolve", " ");
            pokedex[122] = new Pokemon("Scyther", "Bug/Flying", "123", 70, 110, 55, 80, 80, 105, "Swarm", "Technician", "Steadfast", "With ninja-like agility and speed, it can create the illusion that there is more than one.", "does not evolve", " ");
            pokedex[123] = new Pokemon("Jynx", "Ice/Psychic", "124", 65, 50, 115, 35, 95, 95, "Oblivious", "Forewarn", "Dry Skin", "It seductively wiggles its hips as it walks. It can cause people to dance in unison with it.", "does not evolve", " ");
            pokedex[124] = new Pokemon("Electabuzz", "Electric", "125", 65, 83, 95, 57, 85, 105, "Static", "", "Vital Spirit", "Normally found near power plants, they can wander away and cause major blackouts in cities.", "does not evolve", " ");
            pokedex[125] = new Pokemon("Magmar", "Fire", "126", 65, 95, 100, 57, 85, 93, "Flame Body", "", "Vital Spirit", "Its body always burns with an orange glow that enables it to hide perfectly among flames.", "does not evolve", " ");
            pokedex[126] = new Pokemon("Pinsir", "Bug", "127", 65, 125, 55, 100, 70, 85, "Hyper Cutter", "Mold Breaker", "Moxie", "If it fails to crush the victim in its pincers, it will swing it around and toss it hard.", "does not evolve", " ");
            pokedex[127] = new Pokemon("Tauros", "Normal", "128", 75, 100, 40, 95, 70, 110, "Intimidate", "Anger Point", "Sheer Force", "When it targets an enemy, it charges furiously while whipping its body with its long tails.", "does not evolve", " ");
            pokedex[128] = new Pokemon("Magikarp", "Water", "129", 20, 10, 15, 55, 20, 80, "Swift Swim", "", "Rattled", "In the distant past, it was somewhat stronger than the horribly weak descendants that exist today.", "Gyarados", "Evolves at Lvl 20");
            pokedex[129] = new Pokemon("Gyarados", "Water/Flying", "130", 95, 125, 60, 79, 100, 81, "Intimidate", "", "Moxie", "Rarely seen in the wild. Huge and vicious, it is capable of destroying entire cities in a rage.", "does not evolve", " ");
            pokedex[130] = new Pokemon("Lapras", "Water/Ice", "131", 130, 85, 85, 80, 95, 60, "Water Absorb", "Shell Armor", "Hydration", "A POKeMON that has been overhunted almost to extinction. It can ferry people across the water.", "does not evolve", " ");
            pokedex[131] = new Pokemon("Ditto", "Normal", "132", 48, 48, 48, 48, 48, 48, "Limber", "", "Imposter", "Capable of copying an enemy's genetic code to instantly transform itself into a duplicate of the enemy.", "does not evolve", " ");
            pokedex[132] = new Pokemon("Eevee", "Normal", "133", 55, 55, 45, 50, 65, 55, "Run Away", "Adaptability", "Anticipation", "Its genetic code is irregular. It may mutate if it is exposed to the radiation from element STONEs.", "Vaporeon, Jolteon, or Flareon", "Water Stone (Vaporeon), Thunder Stone (Jolteon), Fire Stone (Flareon)");
            pokedex[133] = new Pokemon("Vaporeon", "Water", "134", 130, 65, 110, 60, 95, 65, "Water Absorb", "", "Hydration", "Lives close to water. Its long tail is ridged with a fin which is often mistaken for a mermaid's.", "does not evolve", " ");
            pokedex[134] = new Pokemon("Jolteon", "Electric", "135", 65, 65, 110, 60, 95, 130, "Volt Absorb", "", "Quick Feet", "It accumulates negative ions in the atmosphere to blast out 10000-volt lightning bolts.", "does not evolve", " ");
            pokedex[135] = new Pokemon("Flareon", "Fire", "136", 65, 130, 95, 60, 110, 65, "Flash Fire", "", "Guts", "When storing thermal energy in its body, its temperature could soar to over 1600 degrees.", "does not evolve", " ");
            pokedex[136] = new Pokemon("Porygon", "Normal", "137", 65, 60, 85, 70, 75, 40, "Trace", "Download", "Analytic", "A POKeMON that consists entirely of programming code. Capable of moving freely in cyberspace.", "does not evolve", " ");
            pokedex[137] = new Pokemon("Omanyte", "Rock/Water", "138", 35, 40, 90, 100, 55, 35, "Swift Swim", "Shell Armor", "Weak Armor", "Although long extinct, in rare cases, it can be genetically resurrected from fossils.", "Omastar", "Evolves at Lvl 40");
            pokedex[138] = new Pokemon("Omastar", "Rock/Water", "139", 70, 60, 115, 125, 70, 55, "Swift Swim", "Shell Armor", "Weak Armor", "A prehistoric POKeMON that died out when its heavy shell made it impossible to catch prey.", "does not evolve", " ");
            pokedex[139] = new Pokemon("Kabuto", "Rock/Water", "140", 30, 80, 55, 90, 45, 55, "Swift Swim", "Battle Armor", "Weak Armor", "A POKeMON that was resurrected from a fossil found in what was once the ocean floor eons ago.", "Kabutops", "Evolves at Lvl 40");
            pokedex[140] = new Pokemon("Kabutops", "Rock/Water", "141", 60, 115, 65, 105, 70, 80, "Swift Swim", "Battle Armor", "Weak Armor", "Its sleek shape is perfect for swimming. It slashes prey with its claws and drains the body fluids.", "does not evolve", " ");
            pokedex[141] = new Pokemon("Aerodactyl", "Rock/Flying", "142", 80, 105, 60, 65, 75, 130, "Rock Head", "Pressure", "Unnerve", "A ferocious, prehistoric POKeMON that goes for the enemy's throat with its serrated saw-like fangs.", "does not evolve", " ");
            pokedex[142] = new Pokemon("Snorlax", "Normal", "143", 160, 110, 65, 65, 110, 30, "Immunity", "Thick Fat", "Gluttony", "Very lazy. Just eats and sleeps. As its rotund bulk builds, it becomes steadily more slothful.", "does not evolve", " ");
            pokedex[143] = new Pokemon("Articuno", "Ice/Flying", "144", 90, 85, 95, 100, 125, 85, "Pressure", "", "Snow Cloak", "A legendary bird POKeMON that is said to appear to doomed people who are lost in icy mountains.", "does not evolve", " ");
            pokedex[144] = new Pokemon("Zapdos", "Electric/Flying", "145", 90, 90, 125, 85, 90, 100, "Pressure", "", "Static", "A legendary bird POKeMON that is said to appear from clouds while dropping enormous lightning bolts.", "does not evolve", " ");
            pokedex[145] = new Pokemon("Moltres", "Fire/Flying", "146", 90, 100, 125, 90, 85, 90, "Pressure", "", "Flame Body", "Known as the legendary bird of fire. Every flap of its wings creates a dazzling flash of flames.", "does not evolve", " ");
            pokedex[146] = new Pokemon("Dratini", "Dragon", "147", 41, 64, 50, 45, 50, 50, "Shed Skin", "", "Marvel Scale", "Long considered a mythical POKeMON until recently when a small colony was found living underwater.", "Dragonair", "Evolves at Lvl 30");
            pokedex[147] = new Pokemon("Dragonair", "Dragon", "148", 61, 84, 70, 65, 70, 70, "Shed Skin", "", "Marvel Scale", "A mystical POKeMON that exudes a gentle aura. Has the ability to change climate conditions.", "Dragonite", "Evolves at Lvl 55");
            pokedex[148] = new Pokemon("Dragonite", "Dragon/Flying", "149", 91, 134, 100, 95, 100, 80, "Inner Focus", "", "Multiscale", "An extremely rarely seen marine POKeMON. Its intelligence is said to match that of humans.", "does not evolve", " ");
            pokedex[149] = new Pokemon("Mewtwo", "Psychic", "150", 106, 110, 154, 90, 90, 130, "Pressure", "", "Unnerve", "It was created by a scientist after years of horrific gene splicing and DNA engineering experiments.", "does not evolve", " ");
            pokedex[150] = new Pokemon("Mew", "Psychic", "151", 100, 100, 100, 100, 100, 100, "Synchronize", "", "", "So rare that it is still said to be a mirage by many experts. Only a few people have seen it worldwide.", "does not evolve", " ");
        }


        // Main program and search function
        System.out.println("Welcome to the Gen 1 POKeDEX!");

        boolean searchAgain = true;

        while (searchAgain) {
            System.out.println("Please enter a POKeMON name or number.");
            String search = scanner.nextLine().trim();

            boolean found = false;

            for (Pokemon p :pokedex) {
                if (p != null) {
                    if (p.getName().equalsIgnoreCase(search) || p.dexNumber().equals(search)) {
                        p.displayInfo();
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("Sorry, that POKeMON couldn't be found.");
            }
            

            System.out.println("Would you like to search again? (yes/y no/n)");
            String confirm = scanner.nextLine().trim();

            if (!confirm.equalsIgnoreCase("yes") && !confirm.equalsIgnoreCase("y")) {
                searchAgain = false;
            }

        }
        System.out.println("Goodbye! Happy training!");
        scanner.close();
    }
}

