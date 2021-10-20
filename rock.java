import java.util.Scanner;
import java.lang.Math;
public class rock {
    public static void main(String[] args){
        String personPlay;
        String computerPlay = "";
        int computerInt;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter [R]ock, [P]aper, or [S]cissors. ");
        personPlay = scan.next();
        personPlay = personPlay.toUpperCase();
        System.out.println(personPlay);
        computerInt = (int)(Math.random() *2);
        if (computerInt == 0){
            computerPlay = "R";
        }else if (computerInt == 1){
            computerPlay = "P";
        }else if (computerInt == 2){
            computerPlay = "S";
        }
        if (personPlay.equals(computerPlay)){
            System.out.println("It's a tie!");
        }else if(personPlay.equals("R")){
            if (computerPlay.equals("S")){
                System.out.println("Rock crushes scissors, you win!");
                main(args);
            }else{
                System.out.println("Paper covers rock, you lose!");
                main(args);
            }
        }else if(personPlay.equals("S")){
            if(computerPlay.equals("P")){
                System.out.println("Scissors cut paper, you win!");
                main(args);
            }
        }else if (personPlay.equals("EXIT")){
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }
}
