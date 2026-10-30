import java.util.*;
public class Main12 {
public static void main (String []args){
class Calculator{
int add(int a,int b){
return a+b;
}
int sub(int a,int b){
return a-b;
}
int mul(int a,int b){
return a*b;
}
int div(int a, int b){
return a/b;
}
}
Calculator s=new Calculator();
System.out.println(s.add(1,2));
System.out.println(s.sub(1,2));
System.out.println(s.mul(1,2));
System.out.println(s.div(1,2));
}
}
