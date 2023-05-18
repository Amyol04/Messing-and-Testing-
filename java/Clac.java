import java.util.Scanner;

public class Clac {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
      
      // asks for user inputs and puts them into an int to be used later 

        System.out.print("1 to add, 2 to subtract, 3 to multiply, 4 to Divide : ");
        int choice = scanner.nextInt();
        int result;
      // asks for a choice of adding, subtracting.. ect 
      
      // if and else to execute the adding 
        if (choice == 1) {

            result = number1 + number2;
            System.out.println("The sum of " + number1 + " + " + number2 + " is " + result);
        }
       // if and else to execute the subtracting
        if ( choice == 2) {

            result = number1 - number2;
            System.out.println("The sum of " + number1 + " - " + number2 + " is " + result);
        }
      // if and else to execute the multipling  
        if (choice == 3){

            result = number1 * number2;
            System.out.println("The sum of " + number1 + " x " + number2 + " is " + result);
        }

     // if and else to execute the dividing 
        if (choice == 4){

            result = number1 / number2; 
            System.out.println("The sum of " + number1 + " ÷ " + number2 + " is " + result); 
        }

      
        else{

            System.out.println("please enter a valid condition");


        }

        scanner.close();

    }
}
