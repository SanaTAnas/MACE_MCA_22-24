import java.util.Scanner;

class cpu{
   
   int price;
   
   Scanner s=new Scanner(System.in);
   
   void get1(){
   
      System.out.println("Enter price:");
  
      price=s.nextInt();
   }
   
   void disp1(){
   
       System.out.println("🤑️PRICE"+price);
       }
       
  class processor{
  
  int core;
  
  String manf;
  
     void get2(){
         Scanner s=new Scanner(System.in);
      
         System.out.println("Enter core:");
         
         core=s.nextInt();
         
         System.out.println("Enter manufacturer:");
         
         manf=s.next();
         
         }
         
      void disp2(){
         
         System.out.println("CORE"+core+"MANUFACTURER👷‍♂️️"+manf);
         
       }
         
       }
        
 static class RAM{
     
      static int mem;
     
      static String man;
     
      void get3(){
     
        Scanner s=new Scanner(System.in);
     
        System.out.println("Enter memory:");
        
        mem=s.nextInt();
        
        System.out.println("Enter manufactures:");
        
        man=s.next();
        
        }
        
        static void disp3(){
        
           System.out.println("MEMORY📝️="+mem+"MANF"+man);
        
        }
        
        }
        
        }
        
  class computer{
  
     public static void main(String arg[]){
     
     cpu c=new cpu();
     
     c.get1();
     
     cpu.processor p=c.new processor();
     
     p.get2();
     
     cpu.RAM r=new cpu.RAM();
     
     r.get3();
     
     System.out.println("Details");
     
     c.disp1();
     
     p.disp2();
     
     r.disp3();
     }
     
     }
     
     
