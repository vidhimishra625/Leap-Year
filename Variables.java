import java.util.*;
public class Variables
{
    public static void main(String args[])
    {
        Person p=new Person();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        p.setName(sc.nextLine());
        System.out.println("Enter Age:");
        p.setAge(sc.nextInt());
        System.out.println(p.getName()+", "+p.getAge());        
    }
}
public class Person
{
    String name;
    int age;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}
