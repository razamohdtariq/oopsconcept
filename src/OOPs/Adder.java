package OOPs;
//Method Overloading: changing no. of arguments

public class Adder {
	 
		static int add(int a,int b){
			
			return a+b;} 
		
		static int add(int a,int b,int c)
		{
			return a+b+c;}  
		}  
		class TestOverloading1{  
			
		public static void main(String[] args){ 
			
		System.out.println(Adder.add(11,27));
		
		System.out.println(Adder.add(11,15,18));  
		}
		
		}  
	
