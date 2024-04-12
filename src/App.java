import java.util.Scanner;
// Inventory System based off chatgpt suggestion cause idk what to do. very basic things prob can add a sort but key funciont and a search buy key or value later.¯\_(ツ)_/¯
public class App {
    public static void main(String[] args) throws Exception {
        invontory MyINVO = new invontory();
        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to do \nAdd something? \nRemove something? \nSee all? \nSee a category sorted? \nIf you want to stop type (no) ");
        String input = scan.nextLine();

        while (input != "no"|| input != "No"){
            //adding items to the tree maps prompts
            if (input.equals("add") || input.equals("Add")){
                System.out.println("What category do you want to add to? (1 = Swords, 2 = Armors, 3 = Potions, 4 = materials)");
                int Category = scan.nextInt();
                scan.nextLine();
                System.out.println("What item would you like to add ? ");
                String Name = scan.nextLine();
                System.out.println("What value would you like to add to the item ?");
                int Worth = scan.nextInt();
                MyINVO.adding(Category, Name, Worth);
                System.out.println("Its been added");
            }
            // removing items form the maps
            else if (input.equals("remove") || input.equals("Remove")){
                System.out.println("What category do you want to remove from? (1 = Swords, 2 = Armors, 3 = Potions, 4 = materials)");
                int Category = scan.nextInt();
                scan.nextLine();
                System.out.println("What item would you like to remove ? ");
                String Name = scan.nextLine();
                System.out.println("what value does this item have ?");
                int Worth = scan.nextInt();
                MyINVO.remove(Category, Name, Worth);
                System.out.println("Its been removed");
            }
            //Displaying all 
            else if (input.equals("see all") || input.equals("all") || input.equals("All")){
                MyINVO.Display();
            }
            //sorting a category
            else if (input.equals("Sort") || input.equals("sort") || input.equals("all sort")){
                System.out.println("what category would you like to sort");
                int Category = scan.nextInt();
                MyINVO.AlphaSort(Category);
            
            }else{
                System.out.println("You typed something that does not work please try again");
                System.out.print("");
                System.out.println("What would you like to do? \nAdd something? \nRemove something? \nSee all? \nSee a category sorted? \nIf you want to stop type (no) ");
                input = scan.nextLine();
            }

    
   
    
    

    }
}
}