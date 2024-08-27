public class Child1 extends Parent{
// Prepare Some Function and extend to Parent Class
public float division(float x,float y){
    return x/y;
}
public static void main(String[] args) {
    Child1 tt=new Child1();
    System.out.println("the division between the numbers :"+tt.division(10,2));
    System.out.println("the multiplication of two numbers is :"+tt.multiplication(3,4));
}
}
