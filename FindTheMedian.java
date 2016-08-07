/*Find the median

Problem Statement

The goal is to read in a list of integers into an array and output the one which is the median, that is, the one which if you put them all in order would be in the middle. If there are two in the middle then take the average of those two. For example the median of 4, 8, 2, 3 and 5 is 4, because if you put them all in order 4 would be the middle value. The median of 2, 7, 4, and 9 is 5.5 because 5.5 is the average of 4 and 7.

Input Format

The first line contains N, the number of inputs. The second line contains N integers separated by a space.

Output Format

A double that represents the median.

Constraints

1<=N<=1000

-1000<=n<=1000

Sample Input

7

15 18 3 2 -5 6 2

Sample Output

3.0*/

import java.util.*;
import java.util.Arrays;
public class FindTheMedian {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int ile=sc.nextInt();
        int[]tab=new int[ile];

        for(int i=0;i<ile;i++)
        {
        	tab[i]=sc.nextInt();
        }


        for(int outer=ile-1;outer>0;outer--)
        {
        	for(int inner=0; inner<outer; inner++)

         	{   if(tab[inner+1]<tab[inner]){
        			swap4(inner,inner+1, tab);
        		  }
              }
           }


           System.out.println(Arrays.toString(tab));

           int p2=ile%2;
           if(p2==0)
           {
           	  double h=(tab[ile/2]+tab[ile/2-1])/2;
           	  	System.out.println(h);
           }

           else {System.out.println(tab[ile/2]);
           }

        }

       public static void swap4(int x,int y, int[]tab)
         {
         	int temp=tab[x];
         	tab[x]=tab[y];
         	tab[y]=temp;

         }
}

