//https://www.codechef.com/problems/AGELIMIT

using System;

public class Test
{
	public static void Main()
	{
		// your code goes here
		int t = Int32.Parse(Console.ReadLine());
		for(int a = 1; a <= t; a++) {
		    string[] temp = Console.ReadLine().Split(' ');
		    if(Int32.Parse(temp[2]) < Int32.Parse(temp[1]) && Int32.Parse(temp[2]) >= Int32.Parse(temp[0])) {
		        Console.WriteLine("YES");
		    } else {
		        Console.WriteLine("NO");
		    }
		}
	}
}
