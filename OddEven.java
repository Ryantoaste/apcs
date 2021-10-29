import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        int odds = 0;
        int evens = 0;
        int zeros = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer." );
        int number;
        number = scan.nextInt();
        String length = Integer.toString(number);
        for (int i = 0; i < length.length(); i++){
            char c = length.charAt(i);
            int y = Character.getNumericValue(c);
            if (y % 2 == 0){
                evens++;
            }else if (y % 2 == 1) {
                odds++;
            }else{
                zeros++;
            }
        }
        System.out.println("You entered "+evens+" even numbers, "+odds+" odd numbers, and "+zeros+" zeros");
    }
}
