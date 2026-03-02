public class Pokemon {

    private final String name;
    private final String type;
    private final String dexNumber;
    private final int HP;
    private final int ATTK;
    private final int spATTK;
    private final int DEF;
    private final int spDEF;
    private final int SPEED;

    public Pokemon(String name, String type, String dexNumber, int HP, int ATTK, int spATTK, int DEF, int spDEF, int SPEED) {
        this.name = name;
        this.type = type;
        this.dexNumber = dexNumber;
        this.HP = HP;
        this.ATTK = ATTK;
        this.spATTK = spATTK;
        this.DEF = DEF;
        this.spDEF = spDEF;
        this.SPEED = SPEED;
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

    public void displayInfo() {
        System.out.println("National Dex Number: " + dexNumber);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println();
        System.out.println("Base Stats");
        System.out.println();
        System.out.println("HP: " + HP);
        System.out.println("ATTK: " + ATTK);
        System.out.println("DEF: " + DEF);
        System.out.println("Sp.ATTK: " + spATTK);
        System.out.println("Sp.DEF: " + spDEF);
        System.out.println("SPEED: " + SPEED);
    }
}
