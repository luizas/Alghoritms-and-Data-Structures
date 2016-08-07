/*Check  unique characters in String
example: Data -2
example:-and -3*/


import java.util.*;

public class UniqueCharactersInString {
        
  
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String sprawdz=sc.next();
        
        int ile2=0;
        boolean prawda=true;
        
        for(int i=0;i<sprawdz.length();i++)
        {
        	int sz=sprawdz.charAt(i);
        	int ile=0;
        	for(int j=0;j<sprawdz.length();j++)
        	{ 
        		if(sz==sprawdz.charAt(j))
        		{
        			ile++;
        		}
        	        	
        	}
        	if(ile==1){ile2++;}
   
        }
        
        System.out.println(ile2);
    }
}
