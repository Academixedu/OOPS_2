public class OverLoading{
    public int add(int a, int b) {
		return a+b;
	}
		public int add(int a, int b, int c) {
			return a+b+c;
	}
    public double add(double a, double b){
        return a+b;
    }
    
        public static void main(String[]args) {
            System.out.println("sum of 5,10");
            System.out.println("sum of 20,30,40");
            System.out.println("sum of 2.5,4.5");

    }
   

}


