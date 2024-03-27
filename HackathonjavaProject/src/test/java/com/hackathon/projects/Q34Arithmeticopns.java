package com.hackathon.projects;

public class Q34Arithmeticopns {

public static void main(String[] args) {
	
	System.out.println("Addition is " +add(5,3));
	System.out.println("Subtract is " +subtract(6,3));
	System.out.println("Multiply is " +multiply(5,3));
	System.out.println("Divide is " + divide(5,2));
}
		// TODO Auto-generated method stub
		public static int add(int a, int b) {
			  if (a==0 && b==0) {
			    return 0;
			  }  else
			    	return a + b;
		 			}
			public static int subtract(int a, int b) {
			  return a + (-b);
			}

			public static int multiply(int a, int b) {
				int mul = 0;
			  if (b == 0) {
			    return 0;
			  } else 
			  {
				  for(int i=1;i<=a;i++)  
				  {  
				  //calculates the sum  
				  mul=mul+b;  
				  }  
			    return mul;
			  }
			}
			public static float divide(int a, int b) {
				float Quo = 0;
			  if (b == 0) {
			    throw new IllegalArgumentException("Division by zero");
			  } else if (b == 1) {
			    return a;
			  } else {
				  int c=0;
				while(a>=b)
				  {
				  a=a+(-b);
				  c++;
				  }
		  
			    return c;
			   }
	}
}
