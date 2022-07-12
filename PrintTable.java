import java.util.Scanner;
class PrintTable
{
public static void main(String args[])
{
int i;
	Scanner sha=new Scanner(System.in);
	System.out.println("Enter a number to print Tables");
	int num=sha.nextInt();
	for(i=1;i<=20;i++)
	{
		System.out.println(num+"X"+i+"="+(num*i));
	}
}
}
