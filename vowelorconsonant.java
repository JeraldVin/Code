import java.util.Scanner;
class VowelConsonanat{
public ststic void main(String[] args){
Scanner sc=new Scanner(System.in);
String vowel="aeiou";
String consonant="bcdfghjklmnpqrstvwxyz"
char c=sc.nextChar();
if(vowel.contains(c.toString()))
System.out.print("Vowel");
else if(consonant.contains(c.toString()))
System.out.print("Consonant");
else
System.out.print("Invalid");
}
}
