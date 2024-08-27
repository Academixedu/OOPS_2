public class Child extends Parent{
// Prepare Some Functions in Child Class and Extend it to Parent Class
 public String cname(String name1){
    return name1;
 }
 public static void main(String[] args) {
   Child c=new Child();
    System.out.println(c.sname("marsh"));
      System.out.println(c.cname("mello"));
      
 }
}

