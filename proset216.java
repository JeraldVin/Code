import java.util.Scanner;
import java.util.Arrays;

class Ideone
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int sum=0;
		int p=1;
		for(int i=0;i<n-1;i++){
			sum+=p;
			if(arr[i]==arr[i+1])
			continue;
			else{
				p++;
			}
		}
		System.out.print((sum+p+)+" ");
	}
}
