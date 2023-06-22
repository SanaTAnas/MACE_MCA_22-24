package graphics;

import java.lang.Math;

class Triangle implements properties{
   
   int a;
   int b;
   int c;
   
    public Triangle(int a,int b,int c){
      
      this.a=a;
      this.b=b;
      this.c=c;
     }
     public void area(){
        
        double s; 
        
        s=(a+b+c)/2;
        
        System.out.println("Area of Triangle:"+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
     }
     public void perimeter(){
         
         System.out.println("Perimeter of Triangle"+(a+b+c));
     }
   
     }
