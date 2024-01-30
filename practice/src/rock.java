import java.util.Random;
import java.util.Scanner;
public class rock {
    public static void main(String[] args) {
        System.out.println("PROGRAM FOR ROCK PAPER AND SISSIORS");
        System.out.println("---------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option:");
        System.out.println("1.Rock");
        System.out.println("2.paper");
        System.out.println("Scissors");
        System.out.println("Exit the Game");
        int userinput = sc.nextInt();
        Random random = new Random();
        int computerintput = random.nextInt(3);
        // 
        while (userinput>=3) {
            // 0.rock 1.paper 2.scissors 
        if (userinput == computerintput) {
            System.out.println("Draw!");
            break;
        } 
        else if (userinput == 0 && computerintput == 2 || userinput == 1 && computerintput == 0
                || userinput == 2 && computerintput == 1) {
            System.out.println("You win!");
            break;
        } 
        else {
            System.out.println("Computer wins");
        }
        if (computerintput==0){
            System.out.println("Computer choose ROCK");
            break;
        }
        else if (computerintput==1){
            System.out.println("Computer choose PAPER");
            break;
        }
        else {
            System.out.println("computer choose SCISSORS");
            break;
        }
        
    }
        }
}
