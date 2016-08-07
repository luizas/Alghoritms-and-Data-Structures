//Sort table of Integers (bubble sort)


import java.util.Arrays;

public class BubbleSortTableofIntegers {


    public  static void main(String[] args)
    {
		int[]tab={12,3,18,5,6,8,9,10,45,3,78,98};

		System.out.println(tab.length);

		int outer,inner;


		for(outer=tab.length-1; outer>0;outer--)
		{
			for(inner=0;inner<outer;inner++)
			{
				if (tab[inner]>tab[inner+1])
				{
					swap(inner,inner+1,tab);
				}
			}
		}
		System.out.println(Arrays.toString(tab));
		}
	public static void swap(int first, int second, int[]tab)
	{
		int temp=tab[first];
		tab[first]=tab[second];
		tab[second]=temp;

	}

}
