import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = (int) (Math.random()*100);
        int guess = -5;
        boolean isGuessed = false;
        System.out.println("In this GAME you have to guess the number [0-99] \n\n");
        while (guess != num && guess != -1) {
            System.out.println("Guess the number or Enter -1 to exit: ");
            try {
                guess = sc.nextInt();
            }catch(Exception exception) {
                System.out.println("\n***********Warning***********\nPlease Enter Only integer number Range - [0-99]\n");
                // Clear the input buffer
                String er =  sc.nextLine();
                continue;
            }
            
            if (guess == num) {
                isGuessed = true;
                break;
            }
        }
        
        if (isGuessed) {
            System.out.println("You guessed it right! The number was: " + num);
        } else {
            System.out.println("You didn't guess the number. The right number was: " + num);
        }
        
    }
}
