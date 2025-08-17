/*5.	Check if a number is even or odd using recursion*/

class EvenOdd{
public static void main(String h[]){
int num=17;
String result=num>=0?checkEvenOdd(num):checkEvenOdd(-num);
System.out.println("Result is="+result);
}

static String  checkEvenOdd(int n){
if(n==0) return "Even";
if(n==1) return "Odd";
return checkEvenOdd(n-2);
}
}