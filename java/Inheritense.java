class Clac
{
      public int add(int a1, int a2)
      {
        return a1+a2;
      }
      public int sub(int a1, int a2)
      {
        return a1-a2;
      }
}
class AdvanceClac extends Clac
{
    public int multi(int n1, int n2)
    {
        return n1 *n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }

}
public class Inheritense {
    public static void main(String[] args) {
        AdvanceClac a1 =new AdvanceClac();
        int r1 = a1.add(8, 8);
        int r2= a1.sub(8, 9);
        int r3 = a1.multi(8, 9);
        int r4 = a1.div(9, 3);
        System.out.println(r1 +" " + r2+" " + r3+ " "+ r4);
    }
}
/* the above example the is single level inheritence  
in java we can achieve the single level , multilevel and herichical level inheritense by class

in java multiple level inheritence not achieve by class but we can achieve it by interface 
*/