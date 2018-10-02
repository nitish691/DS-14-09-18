import java.util.Scanner;
class Q2
{
	static void reverse(int index,int size,int arr[])
	{
		if(index < (size/2))
		{
			int temp = arr[index];
			arr[index] = arr[size-index-1];
			arr[size-index-1] = temp;
			
			reverse(++index,size,arr);
		}
		else
			return;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
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
		
		System.out.print("\nReversed Array : ");
		reverse(0,n,arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}