/*this is the example of encapsulation- encapsulation means hiding or keeping the data private
using access modifires like privete and exposing  it via methods.*/
class Demo
{
   private int age=38;
   private String name = "ketan";
   public int getage()
   {
    return age;
   }
   public int getAge() {
    return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
   public void setName(String name) {
    this.name = name;
}
   public String getString()
   {
    return name;
   }
   
}

public class Encapsulation {
    public static void main(String[] args) {
     Demo d =new Demo();
     /*defualt value */    
     System.out.println("age : "  +d.getage());
     System.out.println("name: " +d.getString());
      d.setAge(30);
      d.setName("hello");
      
      System.out.println("age : " + d.getAge());
      System.out.println("NAME: " +d.getString());
    }
}
