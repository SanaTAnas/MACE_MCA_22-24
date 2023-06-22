package graphics;
import java.lang.Math;
class Circle implements properties{
   
   int r;
  
   public Circle(int r){
      
      this.r=r;
   }
   public void area(){
      
      System.out.println("Area of circle:"+Math.PI*r*r);
   }
   public void perimeter(){
      
      System.out.println("Perimeter of Circle:"+2*Math.PI*r);
   }
   }
