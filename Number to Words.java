import java.util.*;
public class Program 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a Number:");
        num=sc.nextInt();
        switch(num)
        {
            case 0: System.out.println("Zero");
            break;
            case 1: System.out.println("One");
            break;
            case 2: System.out.println("Two");
            break;
            case 3: System.out.println("Three");
            break;
            case 4: System.out.println("Four");
            break;
            case 5: System.out.println("Five");
            break;
            case 6: System.out.println("Six");
            break;
            case 7: System.out.println("Seven");
            break;
            case 8: System.out.println("Eight");
            break;
            case 9: System.out.println("Nine");
            break;
            default: System.out.println("Enter a Number between 0 and 9");
        }
    }
}
