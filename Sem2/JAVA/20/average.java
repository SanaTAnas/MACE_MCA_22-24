import java.util.*;


class negetive extends Exception{

   negetive(String s){
   
      super(s);
   }
   }
 class average{
     
     public static void main(String arg[]){
     
        try{
            double avg;
            int sum1=0;
           int[] a=new int[5];
           
           Scanner sc=new Scanner(System.in);
           
           System.out.println("Enter elements:");
           
           for(int i=0;i<5;i++){
              
              a[i]=sc.nextInt();
              
              sum1=check(a[i]);
         
               
                
            }
            avg=sum1/5;
               System.out.println("Average is"+avg);}
            
         catch(negetive n){
         
             System.out.println("Deneid because of..."+n);
             
             }}
         static int check(int arr) throws negetive{
             
             int sum=0;
             
             if(arr<0){
             
                throw new negetive("Negetive no");
                
             }
             
             else{
             
             for(int i=0;i<5;i++){
             
                sum=sum+arr;
                
                }
             }
             return sum;
                }}
                
                
                 
         
            
