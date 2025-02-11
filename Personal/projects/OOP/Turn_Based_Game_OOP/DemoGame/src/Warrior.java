public class Warrior extends Character {
    public Warrior(String name) {
        super(name, CharacterStats.WARRIOR);
    }

    @Override
    public void specialAttack(Character defender) {
        System.out.println("You are swinging your giant hammer.");
        attack(defender);
    }
}
