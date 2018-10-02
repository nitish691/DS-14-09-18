import java.util.Scanner;
class newString
{
	private String newStr = "";
	
	public String findUniqueString(String str,int i,int len)
	{
		if(i == len || len == 0)
			return newStr;
		else if(i == 0)
			newStr += str.charAt(i);
		else if(str.charAt(i) != str.charAt(i-1))
		{
			newStr += str.charAt(i);
		}
		return findUniqueString(str,++i,len);
	}
}
class Q6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		newString s = new newString();
		System.out.print("\nEnter a string : ");
		String str = sc.nextLine();
		int len = str.length();
		System.out.println("\nThe unique string = " + s.findUniqueString(str,0,len));
		sc.close();
	}
}