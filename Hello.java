import java.util.Scanner;
class Hello
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=0;
		if(sc.hasNextInt()){
			N=sc.nextInt();
			for(int i=0;i<N;i++)
			System.out.println("Hello");
		}
		else
		System.out.print("Invalid Input");
		}
	}
