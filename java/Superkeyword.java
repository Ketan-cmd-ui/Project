class A{
    public A()
    { super();
        System.out.println("this Class A constructor");
    }
    public A(int a)
    {  super();
       System.out.println("int a ");
    }
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'add'");
	}

}
class B extends A
{
  public B ()
  { super();
    System.out.println("this is class b constructor");
  }
  public B(int b)
  { super();
   System.out.println("int b");
  }
}


public class Superkeyword {
    public static void main(String[] args) {
        B b = new B(6);

    }
    
}
/* The super keyword in Java is used to refer to the immediate parent class. 
It is used to access the parent class variables, methods, and constructors. */