import java.util.Scanner;
class Person
{
    String name;
    int Pid;
}
class Student extends Person
{
    Scanner scn = new Scanner(System.in);
    int phy,chem,math;
    void accept(int phy,int chem,int math)
    {
      System.out.println("Enter marks of physics, chemistry and mathematics:");
      phy = scn.nextInt();
      chem = scn.nextInt();
      math = scn.nextInt();
    }
    void calculate()
    {
        int total=phy+chem+math;
        System.out.println("Total marks: "+total);
        double avg=total/3.0;
        System.out.println("Average marks: "+avg);
    }
}
public class InheritancePersonDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int range = sc.nextInt();
        Person[] p = new Student[range];
        for(int i=0;i<range;i++)
        {
            p[i] = new Student();
            System.out.println("Enter name and Pid of student "+(i+1)+":");
            p[i].name = sc.next();
            p[i].Pid = sc.nextInt();
            ((Student)p[i]).accept(((Student)p[i]).phy,((Student)p[i]).chem,((Student)p[i]).math);
        }
    }
}