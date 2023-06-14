import java.util.*;
class student
{
    int sNo;
    String sName;
    student(int no,String nm)
    {
        sName=nm;
        sNo=no;
    }
    void display()
    {
        System.out.println("Student Number:"+sNo);
        System.out.println("Student Name:"+sName);
    }
}
interface sport
{
    void displaysports();
}
class result extends student implements sport
{
    String result;
    int sId;
    String item;
    result(int sNo,String sName,int sId,String item,String rslt)
    {
        super(sNo,sName);
        result=rslt;
        this.sId=sId;
        this.item=item;
    }
    public void displaysports()
    {
        System.out.println("Sports ID:"+sId);
        System.out.println("Sports Item:"+item);
    }
    void display()
    {
        super.display();
        displaysports();
        System.out.println("Result:"+result);
    }
}
class resultMain{
   public static void main(String arg[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter student no:");
      int sNo=sc.nextInt();
      System.out.println("Enter student Name:");
      String sName=sc.next();
      System.out.println("Enter student sport id:");
      int sId=sc.nextInt();
      System.out.println("Enter student item:");
      String item=sc.next();
      System.out.println("Enter student result:");
      String result=sc.next();
      result r=new result(sNo,sName,sId,item,result);
      r.display();
      }}
      
      


