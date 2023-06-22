package graphics;
import java.lang.Math;
class Square implements properties{
   
   int s;
  
   public Square(int s){
      
      this.s=s;
   }
   public void area(){
      
      System.out.println("Area of Square:"+s*s);
   }
   public void perimeter(){
      
      System.out.println("Perimeter of Circle:"+4*s);
   }
   }
