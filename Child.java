public class Child extends Parent{
// Prepare Some Functions in Child Class and Extend it to Parent Class
public String carcolor(String carcolor){
    return carcolor;
    
    
}
public int Car_id(int Car_id){
    return Car_id;
}
public static void main(String[] args){
    Child C=new Child();
    String S=C.carcolor("Red ");
    System.out.println(S);
    int a=C.Car_id(32);
    System.out.println(a);
    

}

}
