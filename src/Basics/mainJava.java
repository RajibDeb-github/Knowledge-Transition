package Basics;

public class mainJava {
	
	//global variable
	
	 
	public String b="A";
	
    public static final int k=4;   //to declare the constant variable
    //final-finally-finalize difference
    
	public static int i;   //global 

	
	
	public static void main(int z) {  //method overloading
		System.out.println("Malu");
	}
	
	public static int add(int a, int b) {
		i=5;
		int j=10;   //local variable
		int add=a+b;
		
		
		return add;
		
		
	}
	
	public static int sub(int a, int b) {
		i=10;
		int j=15;
		int sub=a-b;
		return sub;
	}
	
	public static void main(String[] args) {  
		//public, private, protected
		//static, Non-Static
		//return type: void
		
		int add=add(10,15);
		System.out.println("The result is: "+add);
		
		
		String a="Rajib";
		String b="Deb";
		System.out.println(a+" "+b);
		/*k=7;
		System.out.println(k);
		
		
*/
		main(5);
	}
	
	

}
