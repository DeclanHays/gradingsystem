
public class CourseGrades implements Analyzable
{
 
   GradedActivity[] grades = new GradedActivity[4];
   
   public CourseGrades(GradedActivity g, PassFailExam e, Essay ess, FinalExam fe)
   {
      grades[0] = g;
      grades[1] = e;
      grades[2] = ess;
      grades[3] = fe;
   }
   public void setLab(GradedActivity l)
   {
      grades[0] = l;
   }
   
   public void setPassFailExam(PassFailExam e)
   {
      grades[1] = e;
   }
   
   public void setEssay(Essay e)
   {
      grades[2] = e;
   }
   
   public void setFinalExam(FinalExam e)
   {
      grades[3] = e;
   }
   
   public String toString()
   {
      String s = "";
      s += "Lab: " + grades[0].getScore() + "Grade: " + grades[0].getGrade();
      s += "Exam: " + grades[1].getScore() + "Grade: " + grades[1].getGrade();
      s += "Essay: " + grades[2].getScore() + "Grade: " + grades[2].getGrade();
      s += "Final Exam: " + grades[3].getScore() + "Grade: " + grades[3].getGrade();
      return s;
   }
   
   public double getAverage()
   {
      double average;
      double total = 0;
      for(int i = 0; i < grades.length; i++)
      {
         if(i != 1)
         {
            total += grades[i].getScore();
         }
         
      }
      average = total/3;
      return average;
   }
   
   public GradedActivity getHighest()
   {
      double highestScore = 0;
      int highestIndex = 0;
      for(int i = 0; i < grades.length; i++)
      {
         if(i != 1)
         {
            if(grades[i].getScore() > highestScore)
            {
               highestScore = grades[i].getScore();
               highestIndex = i;
            }
         }
      }
      return grades[highestIndex];
      
   }
   
   public GradedActivity getLowest()
   {
      double lowestScore = 0;
      int indexLowest = 0;
      for(int i = 0; i < grades.length; i++)
      {
         if(i != 1)
         {
            if(grades[i].getScore() < lowestScore)
            {
               lowestScore = grades[i].getScore();
               indexLowest = i;
            }
         }
      }
      return grades[indexLowest];
   }
   
   
}