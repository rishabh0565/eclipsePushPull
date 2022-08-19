
public class Calculator {
      private double a ; 
      private double b ;
      public Calculator() {
		// TODO Auto-generated constructor stub
	}
      Calculator(double a , double b ){
    	  this.a = a ; 
    	  this.b = b ;
      }
      
     public double sum () {
    	return a+b ;  
     }
     public double sub () {
     	return a-b ;  
      }
     public double mul () {
     	return a*b ;  
      }
     public double div () {
     	return a/b ;  
      }
     public double percentage() {
    	 return a/b*100;
     }
     
 }
