//new program
import java.util.Scanner;
import java.util.Arrays;
class Maximum
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		Arrays.sort(arr);
    for(int i=0;i<n;i++)
    {
    if(i!=n-1)
		System.out.print(arr[i]+" ");
    else
    System.out.print(arr[i]);
    }
	}
}
