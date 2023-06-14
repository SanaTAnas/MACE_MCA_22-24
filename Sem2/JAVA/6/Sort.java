import java.util.*;

import java.text.Collator;

class Sort{

   String s[];
   
   int n;
   
   sort(int n){
   
      this.n=n;
      
      s=new String[n];
      
      Scanner sc=new Scanner(System.in);
      
      for(int i=0;i<n;i++){
      
         System.out.print("Text"+(i+1)+":");
         
         s[i]=sc.nextLine();
         
         }}
        
    void sort(){
    
       String t='';
       
       for(i=0;i<n-1;i++)
       
          for(j=0;j<n-i-1;j++)
          
             if(s[j].compareTo(s[j+1])>0){
             
                t=s[j];
                
                s[j]=s[j+1];
                
                s[j+1]=t;
                }
                
     void show(){
        
        for(int i=0;i<n;i++)
        
        System.out.print(s[i]);
        
        }
        
class StrSort      
public static void main(String []a){

   Sort s=new Sort(5);
   
   s.sort();
   
   s.show();}
      
