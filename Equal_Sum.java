public class EqualSum 
{
    public static boolean hasEqualSum(int num1, int num2, int num3)
    {
        boolean result;
        if((num1+num2)==num3)
        {
            result=true;
        }
        else
        {
            result=false;
        }
        return result;
    }
    public static void main(String[] args) 
    {
        boolean c=hasEqualSum(3,2,5);
        System.out.println(c);
    }
}
