import java.util.*;
class student
{
    int sNo;
    String sName;
    student(int sNo,String nm)
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
    int sId;
    String item;
    
    sport(int id,String it)
    {
        sId=id;
        item=it;
    }
    void display()
    {
        System.out.println("Sports ID:"+sId);
        System.out.println("Sports Item:"+item);
    }
}
class result extends student implements sport
{
    String result;
    result(int sNo,String sName,int sId,String item,String rslt)
    {
        super(sNo,sName,sId,item);
        result=rslt;
    }
    void display()
    {
        super.display();
        System.out.println("Result:"+result);
    }
}
}

