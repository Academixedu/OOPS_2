import java.util.Scanner;

public class Parent extends Child1{
// Prepare a Function Here 
public static void main(String[] args) {
    Parent p = new Parent();
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    String s = sc.next();
    String t = sc.next();
    System.out.println(p.Add(num1, num2));
    System.out.println(p.Sub(num1, num2));
    Vehicle(s);
    Tree(t);    
}
  
}
