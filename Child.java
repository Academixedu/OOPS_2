public class Child extends Parent{
    public long buddy(Long a){
     return a;
    }
    public char frnd(char s){
        return s;
    }
    public static void main(String[] args) {
        Child c=new Child();
       System.out.println( c.buddy(1274684389l)+" "+ c.frnd('s')+" "+ c.not("arbaz"));
    }
// Prepare Some Functions in Child Class and Extend it to Parent Class
}
