import java.util.Scanner;

public class num_Game{
    public static void main(String[] args){
        int numToGuess = (int)(Math.random()*100+1);
        Scanner input = new Scanner(System.in);
        boolean correct = false;
        int num_Guess = 0;
        System.out.println("Number Guessing Game");
        System.out.println("Guess the number between 1 to 100.");
        while (!correct) {
            int guess = input.nextInt();
            num_Guess++;
            if(guess == numToGuess){
                correct = true;                      
                System.out.println("Congratulations! You guess number in "+numToGuess+"tries.");}
            else if (guess>numToGuess){
                System.out.println("Your guess too high.Try again");
            }
            else{
                System.out.println("Your guess too low.Try again");
            }
            }
       
        }

}