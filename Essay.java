
public class Essay extends GradedActivity
{
   private double grammar;//30
   private double spelling;//20
   private double correctLength;//20
   private double content;//30
   
   public Essay(double g, double s, double cL, double c)
   {
      grammar = g;
      spelling = s;
      correctLength = cL;
      content = c;
   }
   
   public void setGrammar(double g)
   {
      if(g < 0 || g > 30)
      {
         grammar = 0;
      }
      else
         grammar = g;
   }
   
   public double getGrammar()
   {
      return grammar;
   }
   
   public void setSpelling(double s)
   {
      if(s < 0 || s > 20)
      {
         spelling = 0;
      }
      else
         spelling = g;
   }
   
   public double getSpelling()
   {
      return spelling;
   }
   
   public void setContentLength(double cL)
   {
      if(cL < 0 || cL > 20)
      {
         correctLength = 0;
      }
      else
         correctLength = cL;
   }
   
   public double getCL()
   {
      return correctLength;
   }
   
   public void setContent(double c)
   {
      if(c < 0 || c > 30)
      {
         content = 0;
      }
      else
         content = c;
   }
   
   public double getContent()
   {
      return content;
   }
   
   public double totalScore()
   {
      return grammar + spelling + correctLength + content;
   }
}