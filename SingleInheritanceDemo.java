package INHERITANCE;

class number
{
    int a,b;
    void accept(int x,int y)
    {
       a =x;
       b=y;
    }
}
class calculate extends number
{
    void calc()
    {
        System.out.println("Sum is " + (a+b));
        System.out.println("Difference is " + (a-b));
    }
}
public class SingleInheritanceDemo
{
    public static void main(String args[])
    {
        calculate c1 = new calculate();
        c1.accept(10,20);
        c1.calc();
    }
}