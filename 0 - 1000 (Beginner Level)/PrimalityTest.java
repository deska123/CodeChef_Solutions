// https://www.codechef.com/problems/PRB01

/* package codechef; // don't place package name! */
import java.util.*;
import java.io.*;
     
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
    {
		// your code goes here
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for(int a = 0; a < t; a++) {
            int n = Integer.parseInt(reader.readLine());
            if(isPrime(n)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
	}
	
	public static boolean isPrime(int number)
	{
		for(int b = 2; b < number; b++) {
			if(number % b == 0) {
				return false;
			}
		}
		return true;
	}
} 
