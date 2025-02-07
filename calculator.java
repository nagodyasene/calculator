import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which operation do you want to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int op = sc.nextInt();
        System.out.println("Please enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNum = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("The sum is: " + addition(firstNum,secondNum));
                break;
            case 2:
                System.out.println("The difference is: " + subtraction(firstNum,secondNum));
                break;
            case 3:
                System.out.println("The product is: " + multiplication(firstNum,secondNum));
                break;
            case 4:
                System.out.println("The division is: " + division(firstNum,secondNum));
                break;
        }
    }
    static int addition(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
    static int subtraction(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
    static int multiplication(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
    static int division(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
}


