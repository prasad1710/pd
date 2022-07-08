package javaPrograms;

public class NumberNStringProgram {

	public static void main(String[] args) {
		int a=3;
		if(a%2==0)
		{System.out.println("no. is even");}
		else 
		{System.out.println("no.is odd");}
		
//==================================================
		int b=5,i,fact=1;
		for(i=1;i<=b;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
//==================================================
		int c=6,facto=1;
		for(i=1;i<=c;i++)
		{
			facto=facto*i;
		}
		System.out.println(facto);
	}

}
