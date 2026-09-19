public class demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentId = "SP26-BAI-005";
        s1.name = "Abeer Amina";
        s1.completedCredits = 15;

        s2.studentId = "SP26-BAI-011";
        s2.name = "Alishba";
        s2.completedCredits = 18;

        s3.studentId = "SP26-BAI-050";
        s3.name = "Tehreem";
        s3.completedCredits = 12;

        System.out.println("Before Change:");

        System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " " + s3.completedCredits);

        s2.completedCredits = s2.completedCredits + 3;

        System.out.println("\nAfter Change:");

        System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " " + s3.completedCredits);
    }
}
