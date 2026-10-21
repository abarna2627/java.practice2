import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s= new Scanner(System.in);
		int T=s.nextInt();
		while(T -- > 0){
		    int X=s.nextInt();
		    int Y=s.nextInt();
		    if(Y>X)
		    System.out.println(Y-X);
		    else
		    System.out.println(0);
		}
	}
}
