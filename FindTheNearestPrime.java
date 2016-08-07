/*Find the nearest prime
Problem Statement

The goal is to read in a number and to output the nearest prime. If two primes are equidistant then output the lower one.

Input Format

An integer N.

Output Format

The closest prime to N.

Constraints

2<=N<=10000

Sample Input

3856

Sample Output

3853*/

import java.util.Scanner;


public class FindTheNearestPrime {
        
   public static void main(String[] args) {
   	
   	Scanner sc=new Scanner(System.in);
   	int x=sc.nextInt();
   	
   	int sz1=1;
   	int sz2=1;
   	
   	
   	for(int i=x;i>=2;i--)
   	{
   		boolean p;
   		p=prime(i);
   		if(p==true){sz1=i; break;
   		}
   		 		
   	}
   	  	
   	for(int i=x+1;i<2*x;i++)
   	{
   		boolean p;
   		p=prime(i);
   		if(p==true){sz2=i; break;
   		}
   		 		
   	}
   	
   	 if(x-sz1>sz2-x){System.out.println(sz2);}
   	 else {System.out.println(sz1);}
   	
   	
        
    }
    	public static boolean prime(int pom)
   	 {
   		boolean y=true;
   		
   		for(int i=2;i<pom;i++)
   		{
   			if(pom%i==0){
   				y=false;
   				break;
   			}
   		}
   		return y;
   	}
}
