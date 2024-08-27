public class OverLoading{
// Prepare an Example to show OverLoading Concept

public void kl(String name){
    System.out.println(name);
}
public void kl(int age){
    System.out.println(age);
}
public static void main(String[] args) {
    OverLoading vr=new OverLoading();
    
    vr.kl(21);
    vr.kl("vijay");

}
}

