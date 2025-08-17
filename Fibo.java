import java.util.Scanner;
class Fibo{
public static void main(String d[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
System.out.println("Fibonacci number="+fibo(n));
}
static int fibo(int n){
if(n<2)
return n;

return fibo(n-1)+fibo(n-2);
}
}
