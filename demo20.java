import java.util.*;
public class demo20{
public static void main(String[] args){
String Name;
int Age;
String Deprtment;
Student90 s1=new Student90();
s1.name="yuva";
s1.age=20;
s1.department="CSE";
s1.displayName();
}
}
class Student90 {
String name;
int age;
String department;
void displayName()
{
System.out.println("Name:" +name);
System.out.println("Age:" +age);
System.out.println("Department:" +department);
}
}