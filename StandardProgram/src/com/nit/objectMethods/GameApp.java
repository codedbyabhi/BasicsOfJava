/*You are developing a Game Character Profile System for an international gaming platform.

During gameplay, players can create temporary copies of their character profiles for simulations such as training mode or battle prediction.
These copies must be independent of the original object, so changes to the clone should not affect the original character.

This requires implementing object cloning using the clone() method.

Class Details

Create a class named GameCharacter that implements Cloneable.

Data Members
String characterId // unique character identifier
String playerName // name of the player
int level // current character level
double health // current health points

Constructor
GameCharacter(String characterId, String playerName, int level, double health)
Initializes all fields.

Override clone() from Object class

Logic
Call super.clone() to create a shallow copy.
Return the cloned GameCharacter object.

Main Class Details

Create a class named GameApp.

Use Scanner to read details of one character.
Create the original GameCharacter object.
Clone the object using clone().
Modify the cloned character’s level and health.
Print details of both original and cloned objects to show independence.*/
package com.nit.objectMethods;
import java.util.*;

public class GameApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        String characterId = sc.nextLine();
        String playerName = sc.nextLine();
        int level = sc.nextInt();
        double health = sc.nextDouble();

        if(level<0 || health<0){
            System.out.println("Error: Invalid character details");
            System.exit(0);
        }

        GameCharacter gc = new GameCharacter(characterId, playerName, level, health);
        
        GameCharacter clone = gc.clone();

        clone.level +=5;
        clone.health -=20;

        System.out.println("Original Character:");
        System.out.println("CharacterId="+gc.characterId+", PlayerName="+gc.playerName+", Level="+gc.level+", Health="+gc.health);

        System.out.println("Cloned Character:");
        System.out.println("CharacterId="+clone.characterId+", PlayerName="+clone.playerName+", Level="+clone.level+", Health="+clone.health);
       
       
        
    }
}
class GameCharacter implements Cloneable{
    public String characterId;
    public String playerName;
    public int level;
    public double health;


    public GameCharacter(String characterId, String playerName, int level, double health){
        this.characterId=characterId;
        this.playerName=playerName;
        this.level=level;
        this.health=health;
    }

    public GameCharacter clone() throws CloneNotSupportedException{
        return (GameCharacter) super.clone();
    }
}