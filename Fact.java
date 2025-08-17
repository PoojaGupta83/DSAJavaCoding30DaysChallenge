import java.util.Scanner;

class Fact{
public static void main(String args[]){
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(fact(n));
}
static int fact(int n){
if(n<1)
return 1;
return n*fact(n-1);
}
}