public enum CharacterStats {
    WARRIOR(
        120, 25, 40,
        6, 30, 30,
        20
    ),
    MAGE(
        100, 15, 35,
        2, 30, 90,
        30
    ),
    ARCHER(
        110, 20, 35,
        4, 30, 60,
        30
    );

    private final int health;
    private final int attackPower;
    private final int specialAttackPower;
    private final int defencePower;
    private final int specialAttackCost;
    private final int beginMana;
    private final int manaIncrease;

    private CharacterStats(
        int health, int attackPower, int specialAttackPower,
        int defencePower, int specialAttackCost, int beginMana,
        int manaIncrease
    ) {
        this.health = health;
        this.attackPower = attackPower;
        this.specialAttackPower = specialAttackPower;
        this.defencePower = defencePower;
        this.specialAttackCost = specialAttackCost;
        this.beginMana = beginMana;
        this.manaIncrease = manaIncrease;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getSpecialAttackPower() {
        return specialAttackPower;
    }

    public int getDefencePower() {
        return defencePower;
    }

    public int getSpecialAttackCost() {
        return specialAttackCost;
    }

    public int getBeginMana() {
        return beginMana;
    }

    public int getManaIncrease() {
        return manaIncrease;
    }
    
}




