package armour;

public class Platemail extends Armour {
  private int armourAmount = 350;
  private int dexterityCost = 250;
  private String armorType = "Platemail";

  public Platemail() {
    super();
    super.setArmourAmount(armourAmount);
    super.setDexterityCost(dexterityCost);
    super.setArmorType(armorType);

  } // contructor

  public int getFinalDamage(int damage) {
    return damage - (this.armourAmount / 2);
  }
  
} // class
