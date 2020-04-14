import java.util.Scanner;
public class Complete {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number > 10) {
            System.out.println("You entered a number greater than 10");
        } else if ( number < 10){
            System.out.println("You entered a number less than 10");
        } else {
            System.out.println("You entered a number equal to 10");
        }
    }
}
