import java.util.Scanner;
class sumtwo
{
	public static void main(String args[])
	{
		int x,y,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number =");
		x=sc.nextInt();
		System.out.println("enter second number =");
		y=sc.nextInt();
		sum=sum(x,y);
		System.out.println("sum of x and y is="+sum);
	}
public static int sum(int a,int b)
{
int sum;
sum=a+b;
return sum;
}
}