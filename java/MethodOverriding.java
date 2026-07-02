class A 
{
     public int add(int a1,int a2)
     {
        return a1+a2;
     }
}
class B extends A
{
    public int add(int a1,int a2)
    {
        return a1+a2+1;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj =new B();
        int r = obj.add(60, 10);
        System.out.println(r);

    }
}
/*

Method overriding is a feature in Java where a child class writes its own version of a method that already exists in 
the parent class. 
The method must have the same name and same parameters as the parent class method.


*/