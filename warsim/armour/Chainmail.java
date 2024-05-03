package armour;

public class Chainmail extends Armour {
  private int armourAmount = 150;
  private int dexterityCost = 75;
  private String armorType = "Chainmail";

  public Chainmail() {
    super();
    super.setArmourAmount(armourAmount);
    super.setDexterityCost(dexterityCost);
    super.setArmorType(armorType);
  } // contructor

  public int getFinalDamage(int damage) {
    return damage - (this.armourAmount / 5);
  }
  
} // class
