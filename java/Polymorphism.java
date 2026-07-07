/*complile time plolymorphism using method overloading */
class S
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
        S obj = new S();
        System.out.println(obj.show("ketan"));
        System.out.println(obj.show("ketan", "   wadia"));
    }
    
}
