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