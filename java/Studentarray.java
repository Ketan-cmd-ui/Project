class Student {
    int roll_no;
    String name;
    int marks;

}
public class Studentarray {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.roll_no = 45;
        s1.name = "pravin";
        s1.marks= 89;

        Student s2 =new Student();
        s2.roll_no=56;
        s2.name="ketan";
        s2.marks=96;

        Student s3 =new Student();
        s3.roll_no=78;
        s3.name="iris";
        s3.marks=14;

        Student student[] = new Student[3];
         student[0]=s1;
         student[1]=s2;
         student[2]=s3;

        // for(int i=0;i<student.length;i++)
        for(Student stud : student)
         {
            System.out.println(stud.name +" : "+ stud.marks + "  roll_no = "+ stud.roll_no);
         }


    }
}
