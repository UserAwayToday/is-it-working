import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;


public class invontory {
    ArrayList<TreeMap> WholeInvontory = new ArrayList<TreeMap>();
    TreeMap <String,Integer> Swords  = new TreeMap <String,Integer> ();
    TreeMap <String,Integer> Armors  = new TreeMap <String,Integer> ();
    TreeMap <String,Integer> Potions  = new TreeMap <String,Integer> ();
    TreeMap <String,Integer> Materials  = new TreeMap <String,Integer> ();
    int S = 0;
    int A = 1;
    int P = 2;
    int M = 3;

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

    public void AlphaSort(int x){
        x = x-1;
        if(x == S){
            for (Map.Entry<String,Integer> entry : Swords.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
        }

        }else if (x == A){
            for (Map.Entry<String,Integer> entry : Armors.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }

        }else if (x == P){
            for (Map.Entry<String,Integer> entry : Potions.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }

        }else if (x == M){
            for (Map.Entry<String,Integer> entry : Materials.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }   
    }
    
    public void adding(int x, String y, int z){
        x = x -1;
        if (x == S){
            Swords.put(y,z);
        }
        else if (x == A){
            Armors.put(y,z);
        }
        else if (x == P){
            Potions.put(y,z);
        }
        else if (x == M){
            Materials.put(y,z);
        }
    }

    public void remove(int x, String y, int z){
        x = x -1;
        if (x == S){
            Swords.remove(y,z);
        }
        else if (x == A){
            Armors.remove(y,z);
        }
        else if (x == P){
            Potions.remove(y,z);
        }
        else if (x == M){
            Materials.remove(y,z);
        } 
    }

    Public void 
}
