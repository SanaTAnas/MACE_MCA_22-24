import java.util.*;

import java.io.*;

class pswd_exp extends Exception{

   pswd_exp(String s){
      
      super(s);
      
   }
   }

class password{

   public static void main(String a[]){
   
      try{
      
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter username:");
         
         String uname=sc.nextLine();
         
         System.out.println("Enter password:");
         
         String pwd=sc.nextLine();
         
         check(uname,pwd);
         
         }
         
     catch(pswd_exp p){
     
        System.out.println("Denied because of..."+p);
        
     }}
     
     static void check(String uname,String pwd) throws pswd_exp{
     
        if(uname.equals("Sana T Anas")&&pwd.equals("Sana@123")){
        
           System.out.println("Welcome");
        
        }
        else{
        
        throw new pswd_exp("Sorry...incorrect username and password");
        }}}
        
