import java.io.*;
class File_Read
{
   public static void main(String arg[]) throws IOException
    {
      String s="";

   		 try{
   		 
		FileReader f1=new FileReader("/home/user/Desktop/JAVA/28/new.txt");
   
		BufferedReader r=new BufferedReader(f1);
		
		while((s=r.readLine())!=null){
		
        		System.out.println(s);
		}
		r.close();
   	
	}catch(IOException e){System.out.println(e);}
	
	
			
  }
}
