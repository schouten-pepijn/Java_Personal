import java.util.Random;

public abstract class Character {
    private final String name;
    private final int attackPower;
    private final int specialAttackPower;
    private final int defencePower;
    private final int specialAttackCost;
    private final int manaIncrease;

    private int beginMana;
    private int health;
    private boolean normalAttack = true;
    private Random random = new Random();

    // Constructor
    public Character(final String name, final CharacterStats characterStats) 
    {
        this.name = name;
        this.health = characterStats.getHealth();
        this.attackPower = characterStats.getAttackPower();
        this.specialAttackPower = characterStats.getSpecialAttackPower();
        this.defencePower = characterStats.getDefencePower();
        this.specialAttackCost = characterStats.getSpecialAttackCost();
        this.beginMana = characterStats.getBeginMana(); 
        this.manaIncrease = characterStats.getManaIncrease();
    }

    // Attack method of the character
    public void attack(final Character character) {
        System.out.printf("%s is attacking...%n", this.name);

        // normal attack
        if (normalAttack) {
            character.takeDamage(attackPower);
            increaseMana();
            return;
        }

        // special attack
        if (checkMana()) {
            character.takeDamage(specialAttackPower);
            reduceMana();
        }
    }

    // Getters and setters
    public boolean stillAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setNormalAttack(final boolean normalAttack) {
        this.normalAttack = normalAttack;
    }

    public void setHealth(final int health) {
        this.health = health;
    }

    // abstract methods for specific implementation
    public abstract void specialAttack(Character character);

    // Print health on screen
    private void printHealth(final Character character) {
        System.out.printf(
            "%s has %d health left.%n", character.getName(), character.getHealth()
        );
    }

    // Increase the mana
    private void increaseMana() {
        beginMana += manaIncrease;
        System.out.printf("%nMana increased to %d.%n", beginMana);
    }

    // Check the mana
    private boolean checkMana() {
        if (beginMana < specialAttackCost) {
            System.out.println("Out of mana! No Damage done.");
            return false;
        }
        return true;
    }

    // Reduce the mana
    private void reduceMana() {
        beginMana = Math.max(0, beginMana - specialAttackCost);
        System.out.printf("%nMana reduced to %d.%n", beginMana);
    }

    // Random damage modifier
    private int randomDamage() {
        return random.nextInt(7) - 3;
    }

    // Take damage 
    private void takeDamage(final int damage) {
        final int finalDamage = health + defencePower - damage - randomDamage();
        health = Math.max(0, finalDamage);
        printHealth(this);
    }
}
