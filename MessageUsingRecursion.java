public class MessageUsingRecursion{
public static void main(String d[]){
message(1);
}
static void message(int n){
System.out.println("Print" +n);
if(n==5){
return;
}

message(n+1);
}
}