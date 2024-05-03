package weapon;

public class Axe extends Weapon {
  private int damageAmount = 200;
  private int dexterityCost = 150;
  private int baseHitChance = 50; // out of 100 the odds of hitting
  private String weaponType = "Axe";

  public Axe() {
    super();
    super.setDamageAmount(damageAmount);
    super.setDexterityCost(dexterityCost);
    super.setWeaponType(weaponType);
  } // constructor

  public int strike(int attackType, int dexterity, int strength) {
    int damage = 0;
    int roll = super.randNum.nextInt(100) + 1;
    if((roll - attackType * 5) <= baseHitChance) { // hit!
      damage = this.damageAmount + (strength / 10) + attackType * 5;
    }
    else { // miss
      damage = 0;
    }
    return damage;
  } // strike
} // class
