public class OverLoading{
// Prepare an Example to show OverLoading Concept
public static void poo(){
    System.out.println("there is nothing in this text :");
}
public static void poo(int a ){
    System.out.println("with some pararmeter given in the text :"+a+"  ");
}
public static void poo(int a,int b,String c) {
    System.out.println("here its diffrent couse we gave three parameter a,b,c the a and b are int and c is string ");
}

public static void main(String[] args) {
    
   
    poo(1,3,"vijay");

    
}
}
