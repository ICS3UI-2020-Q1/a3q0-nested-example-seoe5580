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
