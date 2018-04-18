//Sort array of Strings-Insertion Sort
import java.util.Arrays;/test

public class InsertionSortString {
        

    public  static void main(String[] args) 
    {
		String[]tab={"lui","arek","gaga","op"};
		
		System.out.println(tab.length);
		
		
		for(int outer=1; outer<tab.length;outer++)
		{   
			String temp=tab[outer];
			int inner=outer;
		
			while (inner>0&&tab[inner-1].compareTo(temp)>0)
			{
				tab[inner]=tab[inner-1];
				inner--;
				
			}
			tab[inner]=temp;
		}
		System.out.println(Arrays.toString(tab));
		}  

}
