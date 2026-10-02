import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s= new Scanner(System.in);
		int T=s.nextInt();
		while(T-- > 0){
		    int N=s.nextInt();
		    int M=s.nextInt();
		    System.out.pirntln(Math.max(0,N-M));
		}

	}
}
