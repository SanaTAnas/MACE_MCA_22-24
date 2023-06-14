import java.util.*;
public class LinearSearch
{
	public static int ls(int[] arr,int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] array={23,12,34,5,74,23,55,31};
		System.out.println("Array elements:");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Item to search");
		int searchKey=sc.nextInt();
		int index=ls(array,searchKey);
		if(index!=-1)
		{
			System.out.println("Element "+searchKey+" found at index"+index);
		}
		else
		{
			System.out.println("Element "+searchKey+" not found in the array");
		}
	}
}
