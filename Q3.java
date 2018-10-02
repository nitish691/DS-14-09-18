import java.util.Scanner;

class Q3
{
	static int count = 1;
	static int fiboNumber(int a,int b,final int N)
	{
		
		System.out.print(a + " ");
		if(count == N)
			return a;
		else
		{
			int c = a+b;
			a = b;
			b = c;
			count++;
			return fiboNumber(a,b,N);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter n : ");
		int N = sc.nextInt();
		if(N > 0)
			System.out.println("\nThe Fibonacci number at pos : " + N + " is = " + fiboNumber(0,1,N));
		sc.close();
	}
}