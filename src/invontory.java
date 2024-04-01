import java.util.ArrayList;
import java.util.HashMap;
public class invontory {
    ArrayList<HashMap> WholeInvontory = new ArrayList<HashMap>();
    HashMap <String,Integer> Swords  = new HashMap <String,Integer> ();
    HashMap <String,Integer> Armors  = new HashMap <String,Integer> ();
    HashMap <String,Integer> Potions  = new HashMap <String,Integer> ();
    HashMap <String,Integer> Materials  = new HashMap <String,Integer> ();
    
    public invontory(){
        //Swords
        Swords.put("Copper Sword",1);
        Swords.put("Iron Sword", 2);
        Swords.put("Silver Sword", 3);
        Swords.put("Lead Sword", 4);
        Swords.put("Tungsten Sword", 5);
        Swords.put("Gold Sword", 6);
        Swords.put("Platinum Sword", 7);
        Swords.put("Ice Sword", 8);
        Swords.put("HellBlade Sword", 9);
        Swords.put("Muramasa",8);
        Swords.put("Nights Edge ", 11);
        Swords.put("Excalibur", 15);
        Swords.put("Terra Blade", 20);
        Swords.put("Star Wrath", 8);
       //armor
       Armors.put("Copper Armor", 5);
       Armors.put("Iron Armor", 5);
       Armors.put("Siliver Armor", 5);
       Armors.put("Lead Armor", 5);
       Armors.put("Tungston Armor", 5);
       Armors.put("Gold Armor", 5);
       Armors.put("Platinum Armor", 5);
       Armors.put("Molten Armor", 5);
       Armors.put("mithreal Armor", 5);
       Armors.put("Oracalcom", 5);
       Armors.put("Hallow Armor", 5);
       Armors.put("beetle Armor", 5);
       Armors.put("Vortex Armor", 5);   
       //potinos 
       Potions.put("", 5);   
       Potions.put("", 5); 
       Potions.put("", 5); 
       Potions.put("", 5);   
       Potions.put("", 5); 
       Potions.put("", 5);
       Potions.put("", 5);   
       Potions.put("", 5); 
       Potions.put("", 5);
       Potions.put("", 5);   
       Potions.put("", 5); 
       Potions.put("", 5);
       //Materials
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       Materials.put("", 5);
       //adding everyhting
       WholeInvontory.add(Swords);
       WholeInvontory.add(Armors);
       WholeInvontory.add(Potions);
       WholeInvontory.add(Materials);
    }

   

}
