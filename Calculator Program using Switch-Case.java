import java.util.*;
public class Calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter First Number:");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2=sc.nextInt();
        System.out.println("Enter the Operator:");
        char op=sc.next().charAt(0);
        switch(op)
        {
            case '+':System.out.println("The Sum is: "+(num1+num2));
            break;
            case '-':System.out.println("The Difference is: "+(num1-num2));
            break;
            case '*':System.out.println("The Product is: "+(num1*num2));
            break;
            case '/':System.out.println("The Quotient is: "+(num1/num2));
            break;
            case '%':System.out.println("The Remainder is: "+(num1%num2));
            break;
            default:System.out.println("Wrong Operator!");
        }
    }
}
