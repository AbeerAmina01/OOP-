public class Demo1{
   public static void main(String[] args){
   Student2 s1 = new Student2();
   Student2 s2 = new Student2();
   Student2 s3 = new Student2();
   s1.studentId = "SP26-BAI-005";
   s1.name = "Abeer Amina";
   s1.completedCredits = 17;

   s2.studentId = "SP26-BAI-011";
   s2.name = "Alishba Javed";
   s1.completedCredits = 16;

   s3.studentId = "SP26-BAI-050";
   s3.name = "Tehreem Shahid";
   s1.completedCredits = 15;

   System.out.println("Before change:");

   System.out.println(s1.studentId);
   System.out.println(s1.name);
   System.out.println(s1.completedCredits);

   System.out.println(s2.studentId);
   System.out.println(s2.name);
   System.out.println(s2.completedCredits);

   System.out.println(s3.studentId);
   System.out.println(s3.name);
   System.out.println(s3.completedCredits);
  
   s2.addCredits(4);

   System.out.println("\n After change:");

   System.out.println(s1.studentId);
   System.out.println(s1.name);
   System.out.println(s1.completedCredits);

   System.out.println(s2.studentId);
   System.out.println(s2.name);
   System.out.println(s2.completedCredits);

   System.out.println(s3.studentId);
   System.out.println(s3.name);
   System.out.println(s3.completedCredits);
   //Task2
  System.out.println("Remaining Credits: "+s1.remainingCredits(120));
  System.out.println("Summary:"+s3.summary());
  }
}







