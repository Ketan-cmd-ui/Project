import PackageExample.A;

public class CallingPackage {

    public static void main(String[] args) {

        A a = new A();
        int r = a.add(7, 7);

        System.out.println(r);
    }
}