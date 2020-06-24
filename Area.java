public class ProgramArea 
{
    public static void main(String[] args)
    {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));
    }
    public static double area(double r)
    {
        double PI=Math.PI;
        double a;
        if(r>=0)
        {
            a=r*r*PI;
            return a;
        }
        else
        {
            return (-1);
        }
    }
    public static double area(double x, double y)
    {
        double a;
        if(x>=0&&y>=0)
        {
            a=x*y;
            return a;
        }
        else
        {
            return (-1);
        }
    }
}
