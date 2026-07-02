class Stat
{
    String name;
    String college;

    public Stat()
    {
        name="college";
        college ="wadia";
        System.out.println("hi i am constructor");
    }

    static
    {
        System.out.println("hello i am static");
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
       /*  Stat s =new Stat();
        Stat s1 = new Stat();
        System.out.println(s1.name); */
        Class.forName("Stat");
       
    }
    
}
