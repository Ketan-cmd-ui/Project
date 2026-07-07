/*complile time plolymorphism using method overloading */
class A
{
    public String show(String name)
    {
        return name;
    }
    public String show(String name,String address)
    {
        return name+address;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.show("ketan"));
        System.out.println(obj.show("ketan", "   wadia"));
    }
    
}
