import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    	if(x%3==0)
    	System.out.println(0);
    	else if((x+1)%3==0)
    		System.out.println(1);
    		else
		    System.out.println(2);		
	}
}
}