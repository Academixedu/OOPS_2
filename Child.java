public class Child extends Parent{
// Prepare Some Functions in Child Class and Extend it to Parent Class
public void sum(int a, int b) {
  int c = a + b;
  System.out.println("The sum of two numbers is: " + c);
}

public static void main(String[] args) {

  Child tt = new Child();

 
  tt.sum(10, 2);
  System.out.println("The multiplication of two numbers is: " + tt.multiplication(3, 4));
}
  }

