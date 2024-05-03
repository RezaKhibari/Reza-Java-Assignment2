package weapon;

import java.util.Random;

public abstract class Weapon {
  private int damageAmount;
  private int dexterityCost;
  protected Random randNum = new Random();
  private String weaponType; // added this property

  public Weapon() {
    // do nothing for now
  }

  //==============>>
  // GETTERS
  public int getDamageAmount() {
    return this.damageAmount;
  }
  public int getDexterityCost() {
    return this.dexterityCost;
  }
  // added get module for weaponType property
  public String getWeaponType() {
    return this.weaponType;
}

  //==============>>
  // SETTERS
  public void setDamageAmount(int damageAmount) {
    this.damageAmount = damageAmount;
  }
  public void setDexterityCost(int dexterityCost) {
    this.dexterityCost = dexterityCost;
  }
    // added set module for weaponType property
  public void setWeaponType(String weaponType) {
    this.weaponType = weaponType;
}
  // an abstract method is polymorphic
  // meaning the children determine how
  // this method will be implemented
  public abstract int strike(int attackType, int dexterity, int strength);

} // class
