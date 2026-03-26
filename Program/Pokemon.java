package Program;
// Pokemon class - Stores pokemon data and objects
public class Pokemon {
    // Variables
    private final String name;
    private final String type;
    private final String dexNumber;
    private final int HP;
    private final int ATTK;
    private final int spATTK;
    private final int DEF;
    private final int spDEF;
    private final int SPEED;
    private final String ability1;
    private final String ability2;
    private final String hiddenAbility;
    private final String description;
    private final String evolution;
    private final String evoMethod;

    public Pokemon(String name, String type, String dexNumber, int HP, int ATTK, int spATTK, int DEF, int spDEF, int SPEED, String ability1, String ability2, String hiddenAbility, String description, String evolution, String evoMethod) {
        this.name = name;
        this.type = type;
        this.dexNumber = dexNumber;
        this.HP = HP;
        this.ATTK = ATTK;
        this.spATTK = spATTK;
        this.DEF = DEF;
        this.spDEF = spDEF;
        this.SPEED = SPEED;
        this.ability1 = ability1;
        this.ability2 = ability2;
        this.hiddenAbility = hiddenAbility;
        this.description = description;
        this.evolution = evolution;
        this.evoMethod = evoMethod;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String dexNumber() {
        return dexNumber;
    }

    // Structure of information when displayed
    public void displayInfo() {
        System.out.println();
        System.out.println("National Dex Number: " + dexNumber);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println();
        System.out.println("Base Stats");
        System.out.println("HP: " + HP);
        System.out.println("ATTK: " + ATTK);
        System.out.println("DEF: " + DEF);
        System.out.println("Sp.ATTK: " + spATTK);
        System.out.println("Sp.DEF: " + spDEF);
        System.out.println("SPEED: " + SPEED);
        System.out.println();
        System.out.println("Abilities:");
        System.out.println(ability1);
        System.out.println(ability2);
        System.out.println("Hidden Ability: " + hiddenAbility);
        System.out.println();
        System.out.println("Description:");
        System.out.println(description);
        System.out.println();
        System.out.println("Evolves into: " + evolution);
        System.out.println("Evolution method: " + evoMethod);
        System.out.println();
    }
}

