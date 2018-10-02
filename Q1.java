import java.util.Scanner;
class array
{
	public boolean search(int index,int value,int size,int arr[])
	{
		if(index == size)
			return false;
		else if(arr[index] == value)
			return true;
		else
			return search(++index,value,size,arr);
	}
}
class Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		array a = new array();
		System.out.print("\nEnter the size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("\nEnter the elements of array : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\nEnter a number to search : ");
		int x = sc.nextInt();
		System.out.println("Number found in array : " + a.search(0,x,n,arr));
		System.out.println();
		sc.close();
	}
}