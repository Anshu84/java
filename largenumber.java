import java.util.Scanner;
class largest
{
	public static void main(String args[])
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number =");
		x=sc.nextInt();
		System.out.println("enter second number =");
		y=sc.nextInt();
		System.out.println("enter the third number =");
		z=sc.nextInt();
		if(x>=y && x>=z)
		System.out.println("largest is x="+x);
		else if(y>=x && y>=z)
		System.out.println("largest is y="+y);
		else
		System.out.println("largest is z="+z);
	}
}