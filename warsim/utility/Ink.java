package utility;

/*
 * Class for all of our in games prints
 */
public class Ink {
  
  public Ink() {
    // do nothing
  } // constructor

  public void Welcome() {
    System.out.println("Warsim 2024");
    System.out.println("     _____");
    System.out.println("  .-,;='';_),-.");
    System.out.println(" \\_\\(),()/_/");
    System.out.println("     (,___,)");
    System.out.println("  ,-/`~`\\-,___");
    System.out.println("  / /).:.('--._)");
    System.out.println("   {_[ (_,_)");
    System.out.println("     | Y |");
    System.out.println("    /  |  \\");
    System.out.println("    ''' ''' ");
    System.out.println();
  }

  // Print warrior selection menu
  public void printWarriorMenu() {
    System.out.println("###################################################");
    System.out.println("Choose your Warrior:");
    System.out.println("1. Human");
    System.out.println("2. Elf");
    System.out.println("3. Orc");
    System.out.println("###################################################");
  }

   // Print weapon selection menu
   public void printWeaponMenu() {
    System.out.println("###################################################");
    System.out.println("Choose your Weapon:");
    System.out.println("1. Dagger");
    System.out.println("2. Sword");
    System.out.println("3. Axe");
    System.out.println("###################################################");
  }

  // Print armour selection menu
  public void printArmourMenu() {
    System.out.println("###################################################");
    System.out.println("Choose your Armour:");
    System.out.println("1. Leather");
    System.out.println("2. Chainmail");
    System.out.println("3. Platemail");
    System.out.println("###################################################");
  }

  // Print attack type selection menu
  public void printAttackMenu() {
    System.out.println("###################################################");
    System.out.println("Choose Attack Type:");
    System.out.println("1. Normal");
    System.out.println("2. Heavy");
    System.out.println("###################################################");
  }

} // class
