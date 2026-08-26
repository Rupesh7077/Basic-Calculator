import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a=input.nextInt();
        System.out.println("Enter Second Number:");
        int b=input.nextInt();
        System.out.println("Enter Operation(+,-,*,/,%):");
        char operation=input.next().charAt(0);
        if(operation=='+'){
            System.out.println("Addition of two numbers are: "+(a+b));
        }
        else if(operation=='-'){
            System.out.println("Subtraction of two numbers are: "+(a-b));
        }
        else if(operation=='*'){
            System.out.println("Multiplication of two numbers are: "+(a*b));
        }
        else if(operation=='/'){
            if(b!=0){
                System.out.println("Division of two numbers are: "+(a/b));
            }else{
                System.out.println("Error: Cannot divide by zero!");
            }
        }
        else if(operation=='%'){
            if(b!=0){
                System.out.println("Modules of two numbers are: "+(a%b));
            }else{
                System.out.println("Error: Cannot calculate modulus by zero!");
            }
        }
        else{
            System.out.println("Invalid operation! Please use +, -, *, /, or %");
        }
        input.close();
    }
}