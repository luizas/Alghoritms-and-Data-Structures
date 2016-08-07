

Problem Statement

Use a priority queue to sort a list of numbers. Insert all the numbers into the priority queue and then remove them all. 
Smaller numbers should have highest priority so they come out first.

 

Input Format

A list of N unsorted integers separated by a space.

 

Output Format

The list of sorted integers, from smallest to biggest, each on a separate line.

Constraints

1<=N<=100

-1000<=n<=1000

Sample Input

9 2 5 1 4

Sample Output

1

2

4

5

9*/

import java.util.*;

public class SortPriorityQueue {

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue q=new PriorityQueue(100);

        while(sc.hasNextInt())
        {
            q.insert(sc.nextInt());
        }

        while(!q.isEmpty())
        {
        	System.out.println(q.remove());
        }
    }
}

public class PriorityQueue{

  private int maxsize;
	private int[]qarray;
	private int nItems;
	private int front;

    public PriorityQueue(int a) {
    	maxsize=a;
    	qarray=new int[maxsize];
        front=0;
    	nItems=0;
    }
    public void insert(int item){


    	if (nItems==0){

    		qarray[0]=item;
    	}
    	else
    	{
    		int j=nItems;

    	while(j>0&&qarray[j-1]>item)
    	{
    		qarray[j]=qarray[j-1];
    		j--;
    	}
    	qarray[j]=item;
    	}
      nItems++;

     }

    public int remove(){
    //	if(isEmpty())return null;
    	int temp=qarray[front];
    	front++;
    	if(front==maxsize)
    		front=0;
    		nItems--;
    		return temp;


    }
    public int peekFront()
    	{ // peek at front of queue
		return qarray[front];
			}
	public boolean isEmpty()
		 { // true if queue is empty
		return (nItems==0);
         }
    public boolean isFull() { // true if queue is full
        return (nItems==maxsize);
         }
    public int size() { // number of items in queue
        return nItems;
    }

}
