package javaPrograms;

public class MatrixProgram {

	public static void main(String[] args) {
		
	    for(int i=1;i<=4;i++)
	    {for(int j=1;j<=4;j++)
	    	{
	    	System.out.print("* ");
	    	}
	    System.out.println();
	    }
	    System.out.println();
//==============================================
	    for(int i=1;i<=4;i++)
	    {
	    	for(int j=1;j<=i;j++)
	    	{System.out.print("* ");}
	    	System.out.println();
	    }
	    System.out.println();
//==============================================
	    for(int i=1;i<=4;i++)
	    {
	    	for(int j=i;j<=4;j++)
	    	{System.out.print("* ");}
	    	System.out.println();
	    }
	    System.out.println();
//=============================================
	   for(int i=1;i<=4;i++)
	    {for(int j=3;j>=i;j--)
	    {System.out.print("  ");}
	    for(int j=1;j<=i;j++)
	    {System.out.print("* ");}
	    System.out.println();
	    }
	    System.out.println();
//=============================================
	    for(int i=1;i<=4;i++)
	    {for(int j=2;j<=i;j++)
	    {System.out.print("  ");}
	    for(int j=4;j>=i;j--)
	    {System.out.print("* ");}
	    System.out.println();
	    }
	    System.out.println();
//=============================================
	    for(int i=1;i<=4;i++)
	    {for(int j=3;j>=i;j--)
	    {System.out.print(" ");}
	    for(int j=1;j<=i;j++)
	    {System.out.print("* ");}
	    System.out.println();
	    }
	    System.out.println();
//=============================================
	   for(int i=1;i<=4;i++)
	   {for(int j=2;j<=i;j++)
	   {System.out.print(" ");}
	   for(int j=4;j>=i;j--)
	   {System.out.print("* ");}
	   System.out.println();
	   }
	   System.out.println();
//=============================================
	   for(int i=1;i<=4;i++)
	   {for(int j=3;j>=i;j--)
	   {System.out.print(" ");}
	   for(int j=1;j<=i;j++)
	   {System.out.print("* ");}
	   System.out.println();
	   }
	   for(int i=1;i<=3;i++)
	   {for(int j=1;j<=i;j++)
	   {System.out.print(" ");}
	   for(int j=3;j>=i;j--)
	   {System.out.print("* ");}
	   System.out.println();
	   }
	   System.out.println();
//==============================================
	   for(int i=1;i<=4;i++)
	   {for(int j=1;j<=i;j++)
	   {System.out.print("* ");}
	   System.out.println();
	   }
	   for(int i=1;i<=3;i++)
	   {for(int j=3;j>=i;j--)
	   {System.out.print("* ");}
	   System.out.println();
	   }
	   System.out.println();
//==============================================
	   for(int i=1;i<=4;i++)
	   {for(int j=3;j>=i;j--)
	   {System.out.print("  ");}
	   for(int j=1;j<=i;j++)
	   {System.out.print("* ");}
	   System.out.println();
	   }
	   for(int i=1;i<=3;i++)
	   {for(int j=1;j<=i;j++)
	   {System.out.print("  ");}
	   for(int j=3;j>=i;j--)
	   {System.out.print("* ");}
	   System.out.println();
	   }
	   System.out.println();
//==============================================
		for(int i=1;i<=4;i++)
		{for(int j=1;j<=4;j++)
			if(i==1||j==1||i==4||j==4)
			{System.out.print("*");}
			else
			{System.out.print(" ");}
		System.out.println();
		}
		System.out.println();
//==============================================
		for(int i=1;i<=4;i++)
		{for(int j=3;j>=i;j--)
		{System.out.print("  ");}
		for(int j=1;j<=4;j++)
		{System.out.print("* ");}
		System.out.println();
		}
		System.out.println();
//==============================================
	   for(int i=1;i<=4;i++)
	   {for(int j=2;j<=i;j++)
	   {System.out.print("  ");}
	   for(int j=1;j<=4;j++)
	   {System.out.print("* ");}
	   System.out.println();
	   }
	   System.out.println();
//==============================================

	}
}
