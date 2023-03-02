package exercise5;
import java.util.Random;
import java.util.HashMap;
  

interface Player
{
    public void assignWeapon(String weapon);
    public void mission();
}
  

class Terrorist implements Player
{
    
    private final String TASK;
  
    
    private String weapon;
  
    public Terrorist()
    {
        TASK = "PLANT A BOMB";
    }
    public void assignWeapon(String weapon)
    {
       
        this.weapon = weapon;
    }
    public void mission()
    {
        
        System.out.println("Terrorist with weapon "
                           + weapon + "|" + " Task is " + TASK);
    }
}
  

class CounterTerrorist implements Player
{
    
    private final String TASK;
  
        private String weapon;
  
    public CounterTerrorist()
    {
        TASK = "DIFFUSE BOMB";
    }
    public void assignWeapon(String weapon)
    {
        this.weapon = weapon;
    }
    public void mission()
    {
        System.out.println("Counter Terrorist with weapon "
                           + weapon + "|" + " Task is " + TASK);
    }
}
  

class PlayerFactory
{
 
    private static HashMap <String, Player> hm =
                         new HashMap<String, Player>();
  

    public static Player getPlayer(String type)
    {
        Player p = null;
  
   
        if (hm.containsKey(type))
                p = hm.get(type);
        else
        {
          
            switch(type)
            {
            case "Terrorist":
                System.out.println("Terrorist Created");
                p = new Terrorist();
                break;
            case "CounterTerrorist":
                System.out.println("Counter Terrorist Created");
                p = new CounterTerrorist();
                break;
            default :
                System.out.println("Unreachable code!");
            }
  
            
            hm.put(type, p);
        }
        return p;
    }
}
  

public class FlyweightPattern
{

    private static String[] playerType =
                    {"Terrorist", "CounterTerrorist"};
    private static String[] weapons =
      {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
  
  
    
    public static void main(String args[])
    {
      
        for (int i = 0; i < 10; i++)
        {
         
            Player p = PlayerFactory.getPlayer(getRandPlayerType());
  
       
            p.assignWeapon(getRandWeapon());
  
           
            p.mission();
        }
    }
  
   
    public static String getRandPlayerType()
    {
        Random r = new Random();
  
     
        int randInt = r.nextInt(playerType.length);
  
       
        return playerType[randInt];
    }
    public static String getRandWeapon()
    {
        Random r = new Random();
  

        int randInt = r.nextInt(weapons.length);
  
       
        return weapons[randInt];
    }
}
//Structural design pattern
//is used when we need to create a lot of Objects of a class
//Since every object consumes memory space that can be crucial for low memory devices, such as mobile devices or embedded systems, flyweight design pattern can be applied to reduce the load on memory by sharing objects
//The number of Objects to be created by application should be huge
//To apply flyweight pattern, we need to divide Object property into intrinsic and extrinsic properties
//Intrinsic properties make the Object unique whereas extrinsic properties are set by client code and used to perform different operations
//It can also improve performance in applications where object instantiation is expensive.
//the flyweight pattern is based on a factory which recycles created objects by storing them after creation
//Each time an object is requested, the factory looks up the object in order to check if it's already been created. If it has, the existing object is returned – otherwise, a new one is created, stored and then returned.
//It's very important that the flyweight objects are immutable: any operation on the state must be performed by the factory.
//The goal of the flyweight pattern is to reduce memory usage by sharing as much data as possible
//example-wordProcessor
//The flyweight pattern is similar to the core concept of a cache and can fit this purpose well.
//In Flyweight pattern we use a HashMap that stores reference to the object which have already been created, every object is associated with a key.
//Now when a client wants to create an object, he simply has to pass a key associated with it and if the object has already been created we simply get the reference to that object else it creates a new object and then returns it reference to the client.


