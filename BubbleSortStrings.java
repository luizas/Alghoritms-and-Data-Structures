//Sort array of Strings- Bubble Sort/test

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortStrings {
        

    public  static void main(String[] args) 
    {
		String[]tab={"Ola","Luiza","Arek","Aabi","Natalia"};
		
		int outer,inner;
		
		
		for(outer=tab.length-1; outer>0;outer--)
		{
			for(inner=0;inner<outer;inner++)
			{ int pom=tab[inner+1].compareTo(tab[inner]);
				if (pom<0)
				{
					swap(inner,inner+1,tab);
				}
			}
		}
		System.out.println(Arrays.toString(tab));
		}  
	public static void swap(int first, int second, String[]tab)   
	{
		String temp=tab[first];
		tab[first]=tab[second];
		tab[second]=temp;
		
	}  
    
}
