// Sort array of Integer- MergeSort

import java.util.*;

public class MergeSortNumbers
{

    public static void main(String[] args) {

    	 int []array={3,2,4,5,1,6};
        // String[]workspace=new String[6];
          System.out.println(Arrays.toString(array));
    	  mergeSort(array,0,5);
     	  System.out.println(Arrays.toString(array));
     	  	int outer,inner;

        int sum=0;
    }



public static void mergeSort(int[]array,int left, int right)
{
        int[]workspace=new int[6];

	    int mid = (left + right) /2;
		if(left==right)return;
		mergeSort(array,left, mid);
		mergeSort(array,mid+1, right);
		for(int i=left; i<=right; i++)
		workspace[i]=array[i];

		int i1=left;
		int i2=mid+1;
		for( int curr=left; curr<=right; curr++){

		if(i1>mid)
			{array[curr]=workspace[i2++];}
		else
			if(i2>right)
			{ array[curr] = workspace[i1++];}

		else if (workspace[i1]>workspace[i2])
			 {array[curr]=workspace[i1++];}
		else {array[curr]=workspace[i2++]; }
       }
}
}
