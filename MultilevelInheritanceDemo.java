class number
{
    int n;
    void set(int n)
    {
        this.n = n;
    }
}
class Square extends number
{
    int square()
    {
        return n*n;
    }
}
class Cube extends Square
{
    int cube()
    {
        return n*n*n;
    }
}
public class MultilevelInheritanceDemo
{
    public static void main(String args[])
    {
        Cube c = new Cube();
        c.set(3);
        System.out.println("Square is " + c.square());
        System.out.println("Cube is " + c.cube());
    }
}