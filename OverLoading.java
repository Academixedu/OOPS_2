public class OverLoading{


    public String  sum(String oo) 
    { 
        return (oo); 
    } 
  
    
    public double sum(double x, double y) 
    { 
        return (x * y); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
       OverLoading s = new OverLoading(); 
       
        System.out.println(s.sum("hello rohit ")); 
        System.out.println(s.sum(10.5, 20.5)); 
    } 
}
// Prepare an Example to show OverLoading Concept

