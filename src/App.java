import java.util.Scanner;
// invo System based off chatgpt suggestion cause idk what to do
//add, remove, items in a arraylist of arraylists, maybe a search method using apcsa things, 
public class App {
    public static void main(String[] args) throws Exception {
        invontory MyINVO = new invontory();
    MyINVO.Display();
    //MyINVO.AlphaSort(1);

    //adding things 

    Scanner scan = new Scanner(System.in);
    System.out.println("what catagory do you want to add to? (1 = Swords, 2 = Armors, 3 = Potions, 4 = materials)");
    int Cata = scan.nextInt();
    System.out.println("what item would you like to add");
    String Name = scan.nextLine();
    System.out.println("what value would you like to add to the item");
    int Worth = scan.nextInt();
    MyINVO.adding(Cata, Name, Worth);
    System.out.println("Its been added");
    //

    }
}
