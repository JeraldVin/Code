import java.util.Scanner;
class SumOfN
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,num=0;
		if(sc.hasNextInt()){
			num=sc.nextInt();
			if(num>0){
			for(int i=1;i<=num;i++)
			sum+=i;
			System.out.print(sum);}
			else
			System.out.print("Invalid Input");
		}
		else
		System.out.print("Invalid Input");
		}
	}
