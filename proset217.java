import java.util.Scanner;

class Sum
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int flag=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]+arr[j]==k){
					System.out.print("yes");
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		System.out.print("no");
	}
}
