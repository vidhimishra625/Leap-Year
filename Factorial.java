public class Factorial
{
    public static void main(String[] args) 
    {
    factorial(7);
    }
    public static void factorial(int num)
    {
        int number = num; 
        long fact = 1; 
        for(int i=1;i<=number;i++)
        { 
            fact = fact * i; 
        } System.out.println("Factorial of "+number+" is: "+fact);
    }
}
