
public class Main {
  
  public static void main(String[] args) {
    boolean playAgain = true;
    
    while(playAgain){
      playGame game = new playGame();
      game.play();
      playAgain = playGame.shouldPlayAgain();
    }
  }

}