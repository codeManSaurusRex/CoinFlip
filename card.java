//William Bigger
//970 540 642
import java.util.Scanner;
import java.util.Random;
import java.lang.String;
public class card {
    public static void main(String[] args) { 
     Scanner scnr = new Scanner(System.in);
  
     Random random = new Random();
     int suitIndex =  random.nextInt(4) + 1;
     int cardIndex = random.nextInt(13) + 2;
     String spades = "Spades"; 
     String hearts = "Hearts";
     String clubs = "Clubs";
     String diamonds = "Diamonds";
    System.out.println("********");
    System.out.print("Hello! You picked the ");

switch (cardIndex) {
    case 2:
        System.out.print("Two of ");
        break;
    case 3:
        System.out.print("Three of ");
        break;
    case 4:
        System.out.print("Four of ");
        break;
    case 5:
        System.out.print("Five of ");
        break;
    case 6:
        System.out.print("Six of ");
        break;
    case 7:
        System.out.print("Seven of ");
        break;
    case 8:
        System.out.print("Eight of ");
        break;
    case 9:
        System.out.print("Nine of ");
        break;
    case 10:
        System.out.print("Ten of ");
        break;
    case 11:
        System.out.print("Jack of ");
        break;
    case 12:
        System.out.print("Queen of ");
        break;
    case 13:
        System.out.print("King of ");
        break;
    case 14:
        System.out.print("Ace of ");
        break;
    default:
        System.out.println("Invalid card index");
        break;
}

    
    switch (suitIndex){

     case (1):
     System.out.print(spades);
     break;
     case (2):
     System.out.print(hearts);
     break;
     case (3):
     System.out.print(clubs);
     break;
     case (4):
     System.out.print(diamonds);
     default:
     break;

     }
    
     System.out.println(".");
     

        scnr.close();
    } }
