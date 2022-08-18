
/**
 * Write a description of class bruh here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

   public class bruh
{
   public String getShapeName()
   {
       return "Shape";
   }
}

public class Rectangle extends Shape
{
   public String getShapeName()
   {
       return "Rectangle";
   }
}

public class Square extends Rectangle {}

public class Oval extends Shape
{
    public String getShapeName() 
    {
        return "Oval";
    }
}

public class Circle extends Oval
{
    public String getShapeName()
    {
        return "Circle";
    }
}

