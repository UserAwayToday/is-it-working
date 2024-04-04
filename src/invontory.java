import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
public class invontory {
    ArrayList<TreeMap> WholeInvontory = new ArrayList<TreeMap>();
    TreeMap <String,Integer> Swords  = new TreeMap <String,Integer> ();
    TreeMap <String,Integer> Armors  = new TreeMap <String,Integer> ();
    TreeMap <String,Integer> Potions  = new TreeMap <String,Integer> ();
    TreeMap <String,Integer> Materials  = new TreeMap <String,Integer> ();
    
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
       Potions.put("Lesser Healing", 5);   
       Potions.put("Healing", 5); 
       Potions.put("Greater Healing", 5); 
       Potions.put("Super Healing", 5);   
       Potions.put("Lesser Restoration", 5); 
       Potions.put("Restoration", 5);
       Potions.put("Lesser Mana", 5);   
       Potions.put("Mana", 5); 
       Potions.put("Greater Mana", 5);
       Potions.put("Super Mana", 5);   
       Potions.put("Battle", 5); 
       Potions.put("Invisibility", 5);
       //Materials
       Materials.put("Wood", 5);
       Materials.put("Stone", 5);
       Materials.put("Iron", 5);
       Materials.put("Siliver", 5);
       Materials.put("Lead", 5);
       Materials.put("Gold", 5);
       Materials.put("Platnium", 5);
       Materials.put("HellStone", 5);
       Materials.put("Meteorite", 5);
       Materials.put("Obsidian", 5);
       Materials.put("Palladium", 5);
       Materials.put("Mythril", 5);
       Materials.put("Hollow", 5);
       Materials.put("Solar", 5);
       Materials.put("Vortex", 5);
       //adding everyhting
       WholeInvontory.add(Swords);
       WholeInvontory.add(Armors);
       WholeInvontory.add(Potions);
       WholeInvontory.add(Materials);
    }
    public void Display(){
        for (int i = 0 ; i < WholeInvontory.size(); i ++){
            System.out.println( WholeInvontory.get(i));
        }
        
    }
    public void SortMaps(int x){
        x = x-1;
        TreeMap <String,Integer> Temp  = new TreeMap <String,Integer> ();
        for (int i = 0 ; i < WholeInvontory.get(x).size(); i ++){
           // temp.put(WholeInvontory.get(x.get(i)));
        }
        
    }

   

}
