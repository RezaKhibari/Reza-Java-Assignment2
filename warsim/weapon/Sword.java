package weapon;

public class Sword extends Weapon {
  private int damageAmount = 150;
  private int dexterityCost = 75;
  private int baseHitChance = 70; // out of 100 the odds of hitting
  private String weaponType = "Sword";


  public Sword() {
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
