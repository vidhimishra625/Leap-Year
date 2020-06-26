import java.util.*;
public class Multiplication
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        System.out.println("The table of "+num+" upto 12 is:");
        for(int i=1;i<=12;i++)
        {
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
