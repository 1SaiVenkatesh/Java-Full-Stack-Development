import java.util.*;

class ArthmeticCalculator {
  public static void main(String[] args) {

    char operator;
    Long number1, number2, result = null;

    // create an object of Scanner class
    Scanner sc = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: Addition(+), Substraction(-),Multiplication (*), or Division (/)");
    operator = sc.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter the 1st number");
    number1 = sc.nextLong();

    System.out.println("Enter the 2nd number");
    number2 = sc.nextLong();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(" ");
        System.out.println("The addition of two numbers is : " +number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(" ");
        System.out.println("The substraction of two numbers is : " +number1+ " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(" ");
        System.out.println("The multiplication of two numbers is :" +number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(" ");
        System.out.println("The division of two numbers is :" +number1 + " / " + number2 + " = " + result);
        break;

      default:
    	System.out.println(" ");
        System.out.println("The operator entered does not exist");
        break;
    }

    System.out.println("\n Hence the result of two numbers is:\n"+ result);
     
  }
}