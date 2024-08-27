public class Child extends Parent {
// Prepare Some Functions in Child Class and Extend it to Parent Class
public String dude(String a){
  return a;
}
public static void main(String[] args) {
    Child t=new Child();
    System.out.println(t.dude("hello")+""+t.mr(01));
    
}

}
