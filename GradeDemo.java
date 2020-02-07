
public class GradeDemo
{
   public static void main(String[] args)
   {
      GradedActivity lab = new GradedActivity(85);
      PassFailExam exam = new PassFailExam(20, 3, 70);
      Essay essay = new Essay(25, 18, 17, 20);
      FinalExam finalExam = new FinalExam(50, 10);
      
      CourseGrades grades = new CourseGrades(lab, exam, essay, finalExam);
   }
}