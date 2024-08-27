public class OverLoading{
// Prepare an Example to show OverLoading Concept

public void Product(int a,int b){
    System.out.println(a*b);
}
public void Product(int a, int b, String c){
    System.out.println(a*b+" "+c);
}
public void Product(char c){
    System.out.println(c);
}

public static void main(String[] args) {
    OverLoading O = new OverLoading();
    O.Product(5, 2);
    O.Product(2, 9, "Product");
    O.Product('P');
}
}
