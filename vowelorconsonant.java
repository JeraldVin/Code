import java.util.Scanner;
class VowelConsonanat{
public ststic void main(String[] args){
Scanner sc=new Scanner(System.in);
String vowel="aeiou";
String consonant="bcdfghjklmnpqrstvwxyz";
char c=sc.next().charAt(0);
if(vowel.contains(Character.toString(c)))
System.out.print("Vowel");
else if(consonant.contains(Character.toString(c)))
System.out.print("Consonant");
else
System.out.print("Invalid");
}
}
