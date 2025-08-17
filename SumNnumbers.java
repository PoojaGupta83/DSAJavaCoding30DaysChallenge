//program to calculate Sum of n numbers
class SumNnumbers{
public static void main(String d[]){
System.out.println(sum(10));
}

static int sum(int n){
if(n==0)
return 0;
return n+sum(n-1);
}
}




