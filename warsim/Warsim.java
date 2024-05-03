import warrior.*;
import weapon.*;
import armour.*;
import utility.*;
import java.util.Scanner;
import java.util.Random;

public class Warsim {
  // Objects
  public static Scanner input = new Scanner(System.in);
  public static Random randNum = new Random();
  public static Ink ink = new Ink();
  public static Warrior player; // player
  public static Weapon pWeapon; // player weapon
  public static Armour pArmour; // player armour

  public static Warrior enemy; // enemy
  public static Weapon eWeapon; // enemy weapon
  public static Armour eArmour; // enemy armour

  // Game Vars
  public static boolean gameOver = false;
  public static boolean playerTurn = true; // player starts
  public static String who = "Player";
  public static String winner = "";
  public static int choice = 0;
  public static int attackType = 0;
  public static int damage = 0;
  
  //================>>
  // main method
  public static void main(String[] args) {

    // Prints welcome message w/ASCII art ;)
    ink.Welcome();

    //==================>>
    // Character Setup
    System.out.println("What is thy name: ");
    String name = input.nextLine();

    //=====================>>
    // Player Creation
    // Warrior
    ink.printWarriorMenu();
    choice = input.nextInt();
    createWarrior(who, choice);
    
    // Weapon
    ink.printWeaponMenu();
    choice = input.nextInt();
    createWeapon(who, choice);
    
    // Armour
    ink.printArmourMenu();
    choice = input.nextInt();
    createArmour(who, choice);

    // set who to Enemy
    who = "Enemy";

    //=====================>>
    // Enemy Creation
    // Warrior
    choice = randNum.nextInt(3) + 1;
    createWarrior(who, choice);

    // Weapon
    choice = randNum.nextInt(3) + 1; 
    createWeapon(who, choice);

    // Armour
    choice = randNum.nextInt(3) + 1; 
    createArmour(who, choice);



    // Print Stats/Details
    System.out.println("Welcome " + name);
    System.out.println("Health: " + player.getHealth());
    System.out.println("Strength: " + player.getStrength());
    System.out.println("Dexterity: " + player.getDexterity());
    System.out.printf("Your Weapon does: %d damage\nWith a Dexterity cost of: %d\n",
      pWeapon.getDamageAmount(), pWeapon.getDexterityCost());

    System.out.println("Enemy");
    System.out.println("Health: " + enemy.getHealth());
    System.out.println("Strength: " + enemy.getStrength());
    System.out.println("Dexterity: " + enemy.getDexterity());

    //==================>>
    // Main Game Loop
    while(!gameOver) {
      if(playerTurn) {
        // player code
        ink.printAttackMenu();
        attackType = input.nextInt();
        damage = pWeapon.strike(attackType, 
          player.getDexterity(),
          player.getStrength());

        // take the damage and pass it into the enemy's armour
        // to reduce the damage
        damage = eArmour.getFinalDamage(damage);

        System.out.println("Damage amount is: " + damage); // testing

        // assign the damage amount to the enemy
        enemy.takeDamage(damage);

        // check to see if the enemy is dead!
        if(enemy.getHealth() <= 0) { // enemy is dead!
          winner = "Player";
          gameOver = !gameOver;
        }
        playerTurn = !playerTurn; // toggles player turn
      }
      else {
        // enemy code
        winner = "Enemy";
        playerTurn = !playerTurn; // toggles player turn
      }
      
    } // while()
    System.out.println("Game Over! Winner is " + winner);

  } // main()

  //========================>>
  // Helper Methods
  public static void createWarrior(String who, int choice) {
    if(who.equals("Player")) { // player warrior creation
      switch (choice) {
        case 1: // Human
          player = new Human();
          break;
        case 2: // Elf
          player = new Elf();
          break;
        case 3: // Orc
          player = new Orc();
          break;
        default:
          System.out.println("Oops!");
          break;
      } // switch
    }
    else { // enemy warrior creation
      switch (choice) {
        case 1: // Human
          enemy = new Human();
          break;
        case 2: // Elf
          enemy = new Elf();
          break;
        case 3: // Orc
          enemy = new Orc();
          break;
        default:
          System.out.println("Oops!");
          break;
      } // switch
    }
  } // createWarrior()

  public static void createWeapon(String who, int choice) {
    switch (choice) {
      case 1: // Dagger
        if(who.equals("Player")) {
          pWeapon = new Dagger();
        }
        else {
          eWeapon = new Dagger();
        }
        break;
      case 2: // Sword
        if(who.equals("Player")) {
          pWeapon = new Sword();
        }
        else {
          eWeapon = new Sword();
        }
        break;
      case 3: // Axe
        if(who.equals("Player")) {
          pWeapon = new Axe();
        }
        else {
          eWeapon = new Axe();
        }
        break;
      default:
        System.out.println("Oops!");
        break;
    } // switch
  } // createWeapon()

  public static void createArmour(String who, int choice) {
    switch (choice) {
      case 1: // Leather
        if(who.equals("Player")) {
          pArmour = new Leather();
        }
        else {
          eArmour = new Leather();
        }
        break;
      case 2: // Chainmail
        if(who.equals("Player")) {
          pArmour = new Chainmail();
        }
        else {
          eArmour = new Chainmail();
        }
        break;
      case 3: // Platemail
        if(who.equals("Player")) {
          pArmour = new Platemail();
        }
        else {
          eArmour = new Platemail();
        }
        break;
      default:
        System.out.println("Oops!");
        break;
    } // switch
  } // createArmour()

} // class