public class OverLoading{
// Prepare an Example to show OverLoading Concept


public void dog(){
    System.out.println(" dog ");
}
public void dog(String name){
    System.out.println(" dog name " + name);
}
public void dog(String name, String color){
    System.out.println(" dog name: " + name + " dog color: " +color);
}
public void dog(String name, String color, double cost ){
    System.out.println(" dog name: " + name + " dog color: " + color + " dog cost: " + cost);
}
public static void main(String[] args){
    OverLoading  d=new OverLoading();
    d.dog();
    d.dog("rikki");
    d.dog("rikki", "black");
    d.dog("rikki", "black",2500);
}
}
