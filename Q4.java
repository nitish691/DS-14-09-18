import java.util.Scanner;
class Power
{
	private int count=1;
	
	public int findPower(int x,int y)
	{
		if(count == y)
			return x;
		else if(y == 0)
			return 1;
		else
		{
			count++;
			return x*findPower(x,y);
		}
	}
}
class Q4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Power num = new Power();
		System.out.println("Enter x : ");
		int x = sc.nextInt();
		System.out.println("Enter y : ");
		int y = sc.nextInt();
		System.out.println("\nx^y = " + num.findPower(x,y));
		sc.close();
	}
}