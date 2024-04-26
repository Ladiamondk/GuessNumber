import java.util.Scanner;

public class playGame{
    //Implement the contructure method
    public playGame(){
    }
    public void play() {
      Scanner sc = new Scanner(System.in);
  
      //Set the inital low, high, and boolean value
      int low = 1;
      int high = 100;
      boolean guessed = false;
      //prompt user to make a guess
      System.out.println("Guess a number between 1 to 100");
  
    while(!guessed){
      int guess = getMidPoint(low, high);
      char response = getResponse(guess);
      switch(response){
        case 'c':
          guessed = true;
          System.out.println("Great!");
          break;
        case 'h':
          low = guess +1;
          break;
        case 'l':
          high = guess -1;
          break;
        default:
          System.out.println("Invalid input");
          break;
      }
    }
    }
    public static int getMidPoint(int low, int high){
      return low + (high - low) / 2;
    }
  
    public static char getResponse(int guess){
      Scanner sc = new Scanner(System.in);
      System.out.println("Is it " + guess + "? (h/l/c); ");
      char response = sc.next().charAt(0);
      return response;
    }
  
    public static boolean shouldPlayAgain(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Do you want to play again? (y/n): ");
      char response = sc.next().charAt(0);
      return response == 'y';
  
    }
  }
  