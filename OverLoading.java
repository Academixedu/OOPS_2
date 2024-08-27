public class OverLoading{
// Prepare an Example to show OverLoading Concept
public void ref(){
    System.out.println("helloo");
}
public void ref(String a){
    System.out.println("hello again");
}
public void ref(int a,String b){
    System.out.println(1+""+"heloo once agian");
}
public static void main(String[] args) {
    OverLoading n=new OverLoading();
   n.ref("hello");
   n.ref("hello again");
   n.ref(01,"hello once again");
   


}
}
