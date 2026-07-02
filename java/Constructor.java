class Const{

    int age;
    String name;
  public Const()
  {
    age=6;
  }
  public Const(String name, int age )
  {
    this.name=name;
    this.age=age;
  }
}

public class Constructor {
 public static void main(String[] args) {
    Const c = new Const();
    Const obj1 = new Const("ketan",54);
System.out.println(obj1.name + " " + obj1.age);
     System.out.println(c.age);
 }   
}
