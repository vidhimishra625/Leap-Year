public class Program 
{
    public static void main(String[] args) 
    {
        sum();
    }
    public static void sum()
    {
        int i=1, s=0;
        while(i<=100)
        {
            s+=i;
            i++;
        }
        System.out.println("The Sum of Natural Numbers between 1 and 100 is: "+s);
    }
}
