import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM FOR PLAYING ROCK PAPER AND SCISSORS");
        System.out.println("-------------------------------------------");
        System.out.println("Enter the Option");
        System.out.format("\n0 . ROCK\n1 . PAPER \n2 . SCISSORS \n");
        int userinput = sc.nextInt();
        Random random = new Random();
        int computerintput = random.nextInt(3); // 0.rock 1.paper 2.scissors
        if (userinput == computerintput) {
            System.out.println("Draw!");
        } else if (userinput == 0 && computerintput == 2 || userinput == 1 && computerintput == 0
                || userinput == 2 && computerintput == 1) {
            System.out.println("You win!");
        } 
        else {
            System.out.println("Computer wins");
        }
        if (computerintput==0){
            System.out.println("Computer choose ROCK");
        }
        else if (computerintput==1){
            System.out.println("Computer choose PAPER");
        }
        else {
            System.out.println("computer choose SCISSORS");
        }
        
    }

}
