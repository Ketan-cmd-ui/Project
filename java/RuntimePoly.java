/* runtime polymorphism using method overriding */

class Parent {
    public void show() {
        System.out.println("Parent class show method");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child class show method");
    }
}

public class RuntimePoly {
    public static void main(String[] args) {
        Parent obj = new Child(); /*  refrence of parent class but object of child class */
        obj.show(); // Calls Child's show method
    }
}
