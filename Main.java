import java.util.Scanner;
/**
 *
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // switch case exmaple
    // get the user choice between 1 and 5
    System.out.println("Please make a selection (1-5)");
    int choice = input.nextInt();

    // determine which candy to drop
    if(choice ==1){
      System.out.println("Here is your chocolate bar");
    }else if(choice == 2){
      System.out.println("Here are your skittles");
    }else if (choice ==3){
      System.out.println("Here are your M&Ms");
    }

    // the same thing but as a switch case statement
    switch(choice){
      case 1:
        System.out.println("Here is your chocolate bar");
        break;
      case 2:
        System.out.println("Here are your Skittles");
        break;
      case 3:
        System.out.println("Here are your M&Ms");
        break;
      default:
        System.out.println("Invalid choice");
    }



    // Nested loop+ exmaple
    // Asks the user if the animal has feathers
    System.out.println("Does the animal have feathers? (yes/no)");
    String featherAnswer = input.nextLine();

    // check to see the feather status
    if(featherAnswer.equals("yes")){
     // get the feather colour
     System.out.println("What colour are the feathers? (red/blue)");
     String featherColour = input.nextLine();

     //determine what type of bird
     if(featherColour.equals("blue")){
       System.out.println("That is a blue jay");
     } else if(featherColour.equals("red")){
       System.out.println("That is a cardinal");
     }
      

   // if the user answered no
   } 

  }
}
