package armour;

public abstract class Armour {
  private int armourAmount;
  private int dexterityCost;
  private String armorType; // Added armorType property

  public Armour() {
    // do nothing
  }

  //================>>
  // GETTERS
  public int getArmourAmount() {
    return this.armourAmount;
  }
  public int getDexterityCost() {
    return this.dexterityCost;
  }
  // Added get modual for armorType property
  public String getArmorType() {
    return this.armorType;
  }
  // takes the armour protection into account
  // reduces the overall damage based on armour typ
  public abstract int getFinalDamage(int damage);

  //================>>
  // SETTERS
  public void setArmourAmount(int armourAmount) {
    this.armourAmount = armourAmount;
  }
  public void setDexterityCost(int dexterityCost) {
    this.dexterityCost = dexterityCost;
  }
  // Added set modual for armorType property
    public void setArmorType(String armorType) {
      this.armorType = armorType;
  }
  
} // class
