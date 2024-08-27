public class OverLoading{
// Prepare an Example to show OverLoading Concept

public void name(){

}

public int name (int name ){
    return name ;
}

public String name (String name ){
    return name;
    
}
public void name (int age ,String val){
    System.out.println(age+val);
}
}
