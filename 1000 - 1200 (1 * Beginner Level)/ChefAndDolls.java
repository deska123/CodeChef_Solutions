//https://www.codechef.com/problems/MISSP

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
			int[] arr = new int[100001];
			for(int b = 0; b < 100001; b++) {
				arr[b] = 0;
			}
			for(int c = 0; c < n; c++) {
				int type = Integer.parseInt(reader.readLine());
				arr[type]++;
			}
			int out = 0;
			for(int d = 1; d < 100001; d++) {
				if(arr[d] % 2 != 0) {
					out = d;
					break;
				}
			}
			System.out.println(out);
		}
	}
} 
