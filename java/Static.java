class Student
{
    String name;
    static String college="abc"; 
   String brand;
      
    public  void show()
    {
        System.out.println(name +" :"+ ":" );
    }
    public static void show1(Student s3)

        {
         System.out.println(college +":"); /* we can use static variable in static method but we cant usr non static variable00  */
         System.out.println(s3.brand +":" ); 
        
        }
    

}

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.name="ketan";
        s2.name="joshi";
        s3.brand="wadia";
         s1.show();
         Student.show1(s3);
        System.out.println(s1.name);
        System.out.println(s2.name);
        Student.college="xyz";
        System.out.println(Student.college);/*the obeject shares the same static variable */
    }
}
