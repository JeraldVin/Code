import java.util.Scanner;
class EvenOdd{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
if(sc.hasNextInt()){
int num=sc.nextInt();
if(num<0)
System.out.print("Invalid");
else if(num%2==0)
System.out.print("Even");
else
System.out.print("Odd");
}
else
System.out.print("Invalid Input");
}
}
